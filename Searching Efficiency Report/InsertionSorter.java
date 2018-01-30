import java.util.List;
import java.util.Comparator;

public class InsertionSorter implements Sorter {
    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends Comparable<E>> int sort(List<E> data) {
        return sort(data, Comparator.naturalOrder());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> int sort(List<E> data, Comparator<E> comparator) {

        int result = 0;
        for (int next = 1; next < data.size(); next++) {
            E insert = data.get(next);
            int moveItemIndex = next;
            while (moveItemIndex > 0 && comparator.compare(data.get(moveItemIndex - 1), insert) > 0) {
                data.set(moveItemIndex, data.get(moveItemIndex - 1));
                moveItemIndex--;
                result++;
            }
            result++;
            data.set(moveItemIndex, insert);
        }
        return result;
    }
}

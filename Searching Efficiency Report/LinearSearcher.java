import java.util.List;
import java.util.Comparator;

public class LinearSearcher implements Searcher {
    /**
     * {@inheritDoc}
    */
    @Override
    public <E extends Comparable<E>> int[] search(List<? extends E> data, E key){
        return search(data, key, Comparator.naturalOrder());
    }

    /**
     * {@inheritDoc}
    */
    @Override
    public <E> int[] search(List<? extends E> data, E key, Comparator<E> comparator){
        //search one by one and return the index
        int result[]= new int[2];
        result[0] = -1;//return -1 if not found
        for(int index = 0; index < data.size(); index++){
            if(comparator.compare(data.get(index), key) == 0){
                result[0] = index;

            }
            result[1]++;
        }
        return result;
    }
}

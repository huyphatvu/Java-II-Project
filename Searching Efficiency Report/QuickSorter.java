import java.util.Comparator;
import java.util.List;

public class QuickSorter implements Sorter {

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends Comparable<E>> int sort(List<E> data){
        return sort(data, Comparator.naturalOrder());
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public < E > int sort(List<  E> data, Comparator<E> comparator){
        int result=0;
        // check for empty or null array
        if (data ==null || data.size()==0){
            return result;
        }
        List<  E> tempData = data;
        int numberSize =  data.size();
        result=quicksort(tempData, 0, numberSize - 1, comparator);
        return result;
    }

    private < E > int quicksort(List< E> tempData, int low, int high, Comparator<E> comparator) {
        int result=0;
        int lowIndex = low;
        int highIndex = high;
        // Get the pivot element from the middle of the list
        E pivot = tempData.get(low + (high - low) / 2);

        // Divide into two lists
        while (lowIndex <= highIndex) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (comparator.compare(tempData.get(lowIndex), pivot) < 0) {
                lowIndex++;
                result++;
            }
            result++;
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (comparator.compare(tempData.get(highIndex), pivot) > 0) {
                highIndex--;
                result++;
            }
            result++;

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // data.
            // As we are done we can increase lowIndex and highIndex
            if (lowIndex <= highIndex) {
                exchange(tempData, lowIndex, highIndex);
                lowIndex++;
                highIndex--;
            }
        }
        return result;
    }

    private <E> void exchange(List< E> tempData, int lowIndex, int highIndex) {
        E temp = tempData.get(lowIndex);
        tempData.set(lowIndex, tempData.get(highIndex));
        tempData.set(highIndex, temp);

    }
}
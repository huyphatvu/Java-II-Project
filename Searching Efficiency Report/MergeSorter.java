import java.util.*;

public class MergeSorter implements Sorter {

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
        int result;
        result=sortArray(data, 0,  data.size()-1, comparator);
        return result;
    }
    private  static <E >  int  sortArray(List<E> data, int low, int high, Comparator<E> comparator ){
        int result =0;
        if((high-low) >= 1){
            int middle1 = (low +high)/2;
            int middle2 = middle1 +1 ;

            sortArray(data, low, middle1, comparator);
            sortArray(data, middle2, high,comparator);

            //merge two arrays together
            result += merge(data, low , middle1, middle2, high,comparator);

        }
        return result;
    }
    private static  <E > int merge(List<E> data, int left, int middle1, int middle2, int right, Comparator<E> comparator ) {
        int result =0;
        int leftIndex = left;
        int rightIndex = middle2;
        int combinedIndex = left;
        int size = data.size();
        ArrayList<E> combined = new ArrayList<>(size);
        for(int i=0; i < size; i++){
            combined.add(data.get(0));
        }

        while (leftIndex <= middle1 && rightIndex <= right) {
            if (comparator.compare(data.get(leftIndex), data.get(rightIndex))  <= 0) {

                combined.add(combinedIndex, data.get(leftIndex));
                combinedIndex++;
                leftIndex++;
                result++;
            } else {
                combined.add(combinedIndex, data.get(rightIndex));
                combinedIndex++;
                rightIndex++;
                result++;
            }
        }
        //if left array is empty
        if(leftIndex == middle2) {
            while (rightIndex <= right) {
                combined.add(combinedIndex, data.get(rightIndex));
                combinedIndex++;
                rightIndex++;

            }
        }
        else{
            while(leftIndex <= middle1) {
                combined.add(combinedIndex, data.get(leftIndex));
                combinedIndex++;
                leftIndex++;

            }
        }

        for(int i =left; i<= right; i++){
            data.set(i, combined.get(i));
        }

        return result;
    }
}

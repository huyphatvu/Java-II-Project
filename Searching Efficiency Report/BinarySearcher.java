import java.util.List;
import java.util.Comparator;

public class BinarySearcher implements Searcher {
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
        int low = 0;
        int high = data.size() -1;
        int mid = (high+low+1)/2;
        int result[] = new int[2];

        result[0] =-1;//return -1 if not found
        result[1] =0;

        while((low<=high) && (result[0]==-1)) {
            mid = (low+high+1)/2;
            if(comparator.compare(key, data.get(mid)) == 0){
                result[0] = mid;
            }
            else if(comparator.compare(key, data.get(mid)) < 0){
                high = mid -1; //search left
                result[1]++;//count runtime
            }
            else {
                low = mid +1; //search right
                result[1]++;//count runtime

            }

        }
        return result;
    }
}

import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class SelectionSorter implements Sorter {
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
    public <E > int sort(List<E> data, Comparator<E> comparator){

        int result =0;
        for(int i = 0; i < data.size(); i++){
            int smallest = i;

            //loop to find the smallest element
            int index = i+1;

            while(index <data.size()){
                if(comparator.compare(data.get(index),data.get(smallest)) < 0) {
                    smallest = index;
                }
                result++;
                index++;
            }

            E temp = data.get(i);
            data.set(i, data.get(smallest));
            data.set(smallest, temp);


        }
        return result;
    }
}

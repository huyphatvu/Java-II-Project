/**
 * Created by Huy Vu on 4/9/2017.
 */
public class Test {
    public static void main(String[] args){

    }
    public int search(int[] array, int key){
        int low = 0;
        int high = array.length-1;
        int mid;

        while(low <= high){
            mid = (low+high)/2;

            if(key == array[mid]) {
                return mid;
            } else if(key < array[mid]){
                high = key -1;
            }else {
                low = key+1;
            }
        }
        return -1;
    }
    public void selectionSort(int[] data){
        for(int i = 0; i < data.length; i++){
            int smallest=i;

            for(int index =i +1; index < data.length; index++){
                if(data[smallest]> data[index])
                    smallest=index;
            }

            int temp = data[smallest];
            data[smallest] = data[i];
            data[i]=temp;
        }
    }
    public void insertionSort(int[ ]data){
        for(int next =1; next <data.length;next++){
            int insert = data[next];
            int moveItemIndex = next;
            while(moveItemIndex > 0 && data[moveItemIndex-1]> insert){
                data[moveItemIndex] = data[moveItemIndex-1];
                moveItemIndex--;
            }
            data[moveItemIndex] = insert;
        }
    }
    public static void mergeSort(int[] data, int low, int high) {
        if ((high - low) >= 1) {
            int middle1 = (low + high) / 2;
            int middle2 = middle1 + 1;

            mergeSort(data, low, middle1);
            mergeSort(data, middle2, high);

            merge(data, low, middle1, middle2, high);
        }
    }
        public static void merge(int[] data, int left, int middle1, int middle2, int right){
        int leftIndex = left;
        int rightIndex  = middle2;
        int[] combined = new int[data.length];
        int combinedIndex = left;
        while(leftIndex <= middle1 && rightIndex <=right){
            if(data[leftIndex]<= data[rightIndex]){
                combined[combinedIndex++]= data[leftIndex++];
            }else {
                combined[combinedIndex++] =data[rightIndex++];
            }
        }

        if(leftIndex == middle2){
                while(combinedIndex<=right){
                    combined[combinedIndex++] = data[rightIndex++];
                }
            }
            else  {
                while(combinedIndex<=middle1){
                    combined[combinedIndex++] = data[leftIndex++];
                }
            }
            for(int i =0; i< data.length; i++){
                data[i] = combined[i];
            }
    }
}

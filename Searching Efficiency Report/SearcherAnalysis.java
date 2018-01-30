import java.util.ArrayList;


/**
 * Created by Huy Vu on 4/4/2017.
 */
public class SearcherAnalysis {
    public static void main(String[] args){
        //LinearSearcher
        LinearSearcher linearSearcher = new LinearSearcher();
        System.out.println("Testing LinearSearcher Class");
        analysis(10, linearSearcher);
        analysis(20, linearSearcher);
        analysis(50, linearSearcher);
        analysis(100, linearSearcher);
        analysis(500, linearSearcher);
        analysis(1000, linearSearcher);
        System.out.println();

        //BinarySearcher
        System.out.println("Testing BinarySearcher Class");
        BinarySearcher  binarySearcher  = new BinarySearcher ();
        analysis(10, binarySearcher);
        analysis(20, binarySearcher);
        analysis(50, binarySearcher);
        analysis(100, binarySearcher);
        analysis(500, binarySearcher);
        analysis(1000, binarySearcher);
    }

    public static void analysis(int number, Searcher theSearcher){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < number; i++){
            list.add(i);
        }
        printReturn(list, theSearcher, number);
    }
    public static void printReturn(ArrayList<Integer> list, Searcher theSearcher, int number){
        int result =theSearcher.search(list, number)[1];

        System.out.printf("%d \n",result);

    }
}

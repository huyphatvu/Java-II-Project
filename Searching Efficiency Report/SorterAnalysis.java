import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * Created by Huy Vu on 4/4/2017.
 */
public class SorterAnalysis {
    public static void main(String[] args){
        System.out.println("Data has already sorted:\n");
        boolean isRandom = false;
        boolean isReversed = false;
        //selectionSorter
        System.out.println("Testing SelectionSorter Class");
        SelectionSorter  selectionSorter  = new SelectionSorter ();
        analysis(10, selectionSorter, isRandom, isReversed);
        analysis(20, selectionSorter, isRandom, isReversed);
        analysis(50, selectionSorter, isRandom, isReversed);
        analysis(100, selectionSorter, isRandom, isReversed);
        analysis(500, selectionSorter, isRandom, isReversed);
        analysis(1000, selectionSorter, isRandom, isReversed);
        System.out.println();
        //insertionSorter
        InsertionSorter insertionSorter = new InsertionSorter();
        System.out.println("Testing InsertionSorter Class");
        analysis(10, insertionSorter, isRandom, isReversed);
        analysis(20, insertionSorter, isRandom, isReversed);
        analysis(50, insertionSorter, isRandom, isReversed);
        analysis(100, insertionSorter, isRandom, isReversed);
        analysis(500, insertionSorter, isRandom, isReversed);
        analysis(1000, insertionSorter, isRandom, isReversed);
        System.out.println();

        //MergeSorter
        System.out.println("Testing MergeSorter Class");
        MergeSorter  mergeSorter  = new MergeSorter ();
        analysis(10, mergeSorter, isRandom, isReversed);
        analysis(20, mergeSorter, isRandom, isReversed);
        analysis(50, mergeSorter, isRandom, isReversed);
        analysis(100, mergeSorter, isRandom, isReversed);
        analysis(500, mergeSorter, isRandom, isReversed);
        analysis(1000, mergeSorter, isRandom, isReversed);
        System.out.println();

        //QuickSorter
        System.out.println("Testing QuickSorter Class");
        QuickSorter  quickSorter  = new QuickSorter ();
        analysis(10, quickSorter, isRandom, isReversed);
        analysis(20, quickSorter, isRandom, isReversed);
        analysis(50, quickSorter, isRandom, isReversed);
        analysis(100, quickSorter, isRandom, isReversed);
        analysis(500, quickSorter, isRandom, isReversed);
        analysis(1000, quickSorter, isRandom, isReversed);
        System.out.println();
        System.out.println();


        /********************************/
        System.out.println("Data has sorted in reverse order:\n");
        isRandom = false;
        isReversed = true;
        //selectionSorter
        System.out.println("Testing SelectionSorter Class");

        analysis(10, selectionSorter, isRandom, isReversed);
        analysis(20, selectionSorter, isRandom, isReversed);
        analysis(50, selectionSorter, isRandom, isReversed);
        analysis(100, selectionSorter, isRandom, isReversed);
        analysis(500, selectionSorter, isRandom, isReversed);
        analysis(1000, selectionSorter, isRandom, isReversed);
        System.out.println();
        //insertionSorter

        System.out.println("Testing InsertionSorter Class");
        analysis(10, insertionSorter, isRandom, isReversed);
        analysis(20, insertionSorter, isRandom, isReversed);
        analysis(50, insertionSorter, isRandom, isReversed);
        analysis(100, insertionSorter, isRandom, isReversed);
        analysis(500, insertionSorter, isRandom, isReversed);
        analysis(1000, insertionSorter, isRandom, isReversed);
        System.out.println();

        //MergeSorter
        System.out.println("Testing MergeSorter Class");

        analysis(10, mergeSorter, isRandom, isReversed);
        analysis(20, mergeSorter, isRandom, isReversed);
        analysis(50, mergeSorter, isRandom, isReversed);
        analysis(100, mergeSorter, isRandom, isReversed);
        analysis(500, mergeSorter, isRandom, isReversed);
        analysis(1000, mergeSorter, isRandom, isReversed);
        System.out.println();

        //QuickSorter
        System.out.println("Testing QuickSorter Class");

        analysis(10, quickSorter, isRandom, isReversed);
        analysis(20, quickSorter, isRandom, isReversed);
        analysis(50, quickSorter, isRandom, isReversed);
        analysis(100, quickSorter, isRandom, isReversed);
        analysis(500, quickSorter, isRandom, isReversed);
        analysis(1000, quickSorter, isRandom, isReversed);
        System.out.println();
        System.out.println();
        /********************************/
        System.out.println("Data has randomly sorted:\n");
        isRandom = true;
        isReversed = false;
        //selectionSorter
        System.out.println("Testing SelectionSorter Class");

        analysis(10, selectionSorter, isRandom, isReversed);
        analysis(20, selectionSorter, isRandom, isReversed);
        analysis(50, selectionSorter, isRandom, isReversed);
        analysis(100, selectionSorter, isRandom, isReversed);
        analysis(500, selectionSorter, isRandom, isReversed);
        analysis(1000, selectionSorter, isRandom, isReversed);
        System.out.println();
        //insertionSorter

        System.out.println("Testing InsertionSorter Class");
        analysis(10, insertionSorter, isRandom, isReversed);
        analysis(20, insertionSorter, isRandom, isReversed);
        analysis(50, insertionSorter, isRandom, isReversed);
        analysis(100, insertionSorter, isRandom, isReversed);
        analysis(500, insertionSorter, isRandom, isReversed);
        analysis(1000, insertionSorter, isRandom, isReversed);
        System.out.println();

        //MergeSorter
        System.out.println("Testing MergeSorter Class");

        analysis(10, mergeSorter, isRandom, isReversed);
        analysis(20, mergeSorter, isRandom, isReversed);
        analysis(50, mergeSorter, isRandom, isReversed);
        analysis(100, mergeSorter, isRandom, isReversed);
        analysis(500, mergeSorter, isRandom, isReversed);
        analysis(1000, mergeSorter, isRandom, isReversed);
        System.out.println();

        //QuickSorter
        System.out.println("Testing QuickSorter Class");

        analysis(10, quickSorter, isRandom, isReversed);
        analysis(20, quickSorter, isRandom, isReversed);
        analysis(50, quickSorter, isRandom, isReversed);
        analysis(100, quickSorter, isRandom, isReversed);
        analysis(500, quickSorter, isRandom, isReversed);
        analysis(1000, quickSorter, isRandom, isReversed);
    }

    public static void analysis(int number, Sorter theSorter, boolean isRandom, boolean isReverse){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < number; i++){
            list.add(i);
        }
        if(isReverse){
            Collections.sort(list, Collections.reverseOrder());
        }
         if(isRandom){
            Collections.shuffle(list);
        }  
            printReturn(list, theSorter, number);

    }
    public static void printReturn(ArrayList<Integer> list, Sorter theSorter, int number){
        int result =theSorter.sort(list);

        System.out.printf("%d \n",result);

    }
}

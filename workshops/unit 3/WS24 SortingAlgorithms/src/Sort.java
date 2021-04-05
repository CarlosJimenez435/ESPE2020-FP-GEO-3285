
import ws24.sortingalgorithms.WS24SortingAlgorithms;


 
public class Sort {
    public static void sort(int[] integers) {
        //for (int i = 0; i < integers.length - 1; i++) {
        //
        //}
        int n = integers.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (integers[j] > integers[j + 1]) {
                    //swap
                    temp = integers[j];
                    integers[j] = integers[j + 1];
                    integers[j + 1] = temp;
                }
                System.out.print("sorting --> ");
               WS24SortingAlgorithms.printArray(integers);
            }
            System.out.println("");
        }
    
}
}


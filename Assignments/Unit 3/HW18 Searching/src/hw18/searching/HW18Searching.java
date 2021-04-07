
package hw18.searching;

public class HW18Searching {
    
    public static int searching (int integers[], int x) {
        
        int n = integers.length;
        for (int i = 0;  i < n; i++){
            if (integers[i] == x){
                
            }
        }
        return -1;
    }
 public static int search (int integers2[], int left, int right, int y) {
     
     if(right >= left ){
         
         int middle = left + (right - left)/2;
         
         if (integers2[middle] == y)
         return middle;
         
        if (integers2[middle] > y)
        
         return search(integers2, left, middle - 1, y);
         
         return search (integers2, middle + 1, right, y );
         
     }
     return -1;
 }
}


import java.util.Scanner;

public class BinarySearch {
    
   public static void main (String args[]){
       Scanner keyboard = new Scanner (System.in);
       System.out.println("Insert the number you want to find:");
       int array[], num;
       boolean growing = true;
       
       array = new int[6];
       do{
           System.out.println("Enter the array");
            for (int i = 0;  i < 6; i++){
                System.out.println("Insert the number you want to find");
                
                array[i]= keyboard.nextInt();
                
            }
            for (int i = 0;  i < 6; i++){
             if (array[i] < array[i+1]){
                 growing = true;
             }   
             if (array[i] > array[i+1]){
                 growing = false;
                 break;
             }
            }
            
            if (growing == false){
                System.out.println("The arrangement is messy");
            }
       }while(growing == false);
       
       System.out.println("Enter the number want to find");
       num = keyboard.nextInt();
       int i =0;
       while (i<6 && array [i]<num){
           i++;
       }
       if (i == 6){
           System.out.println("Error");
       }
       else{
           if(array[i] == num){
               System.out.println("Number found" +i);
           }
           
       }
           
    }
}

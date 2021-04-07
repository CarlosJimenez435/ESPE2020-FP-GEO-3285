
package hw19searchingform;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Hw19SearchingForm {

    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner (System.in);
        
        int tam;
        System.out.println("Enter the number of elements: ");
        
        tam = keyboard.nextInt();
        int array[] = new int[tam];
        
        System.out.println("Enter the : " + tam + " Integer values :");
        
        for(int i = 0; i < tam; i++ )
        {
            array[i] = keyboard.nextInt();
            
        }
       int aux = 0;
       for (int j = 0; j < tam; j++ )
       {
           for (int i = 0; i < tam -1; i++ )
           {
               if (array[i] > array[i+1])
               {
                   aux = array[i];
                   array[i] = array[i+1];
                   array [i+1] = aux;
             
               }
           }
            
       }
       int n = 0;
        System.out.println("The ordered numbers are : " );
        while ( n < tam)
            
        {
            System.out.println(array[n]);
            n++;
           
        }

    }
    
}




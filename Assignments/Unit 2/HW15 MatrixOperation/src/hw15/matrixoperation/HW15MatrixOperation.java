
package hw15.matrixoperation;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class HW15MatrixOperation {

    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     
     int Matrix[][], Numrows,Numcolumns, SumRows,SumColumns;
     
     Numrows = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of Rows: "));
     Numcolumns = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of Columns: "));
     
     
     Matrix = new int [Numrows][ Numcolumns];
     
        System.out.println("Enter the matrix: ");
        
        for( int i=0; i<Numrows; i++){
      
         for( int j=0; j<Numcolumns; j++){  
          
             System.out.println("Matrix["+i+"]["+j+"]: "); 
             Matrix[i][j] = keyboard.nextInt();
             
             
             
             
             
         } 
            
    }
        System.out.println("\n The matrix is: ");  
        for( int i=0; i<Numrows; i++){
          for( int j=0; j<Numcolumns; j++){
              System.out.println(Matrix[i][j]+"");
              
          }  
            System.out.println("");
        }
        //Sumar las filas:
        for( int i=0; i<Numrows; i++){
            
           SumRows = 0;
        for( int j=0; j<Numcolumns; j++){
            
        }   
            System.out.println("\nThe sum of Row ["+i+"]is:" +SumRows);
        }
        System.out.println("");
        //Sumar Columnas:
        for( int j=0; j<Numcolumns; j++){
            SumColumns = 0;
            for( int i=0; i<Numrows; i++){
              SumColumns += Matrix[i][j];   
            }
            System.out.println("\nThe sum of Columns ["+j+"]is:" +SumColumns);
            
            
        }
        System.out.println("");   
    }
    
}

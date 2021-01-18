
package exam.unit.pkg1;
import java.io.*;
import java.util.*;

public class ExamUnit1 {

    public static void main(String[] args) {
                   Scanner input = new Scanner(System.in);
   
    boolean Exit = false;
    int Option;
    
    
    
    while(!Exit){
        
        System.out.println("Multiplication tables");
        
        System.out.println("1.- Multiplication tables");
       
        System.out.println("2.- Exit");
        
        
        System.out.println("Choose an option:  ");
        Option= input.nextInt();
        
        switch(Option){
            case 1:
                System.out.println("Table of 6:");
                
               for(int multiplying =1; multiplying < 11; multiplying++){
                   
                   System.out.println();
                   
               for(int multiplier = 1; multiplier < 11; multiplier++){
                   
                   System.out.printf("%2d X %2d = %3d\t",multiplying,multiplier, (multiplying * multiplier));
               }
               }
                break;
                
                
                case 2:
                    System.out.println("Exit:");
                    Exit = true;
                break;
                
                default:
                System.out.println("Choose a valid Option");
        }
    }
       System.out.println("Good bye");
       sn.next();
       
    }
    }
                
                
                
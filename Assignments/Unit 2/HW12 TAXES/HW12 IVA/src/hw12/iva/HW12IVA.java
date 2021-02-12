
package hw12.iva;

import java.util.Scanner;

public class HW12IVA {

    public static void main(String[] args) {
       //IVA
       Scanner keyboard = new Scanner (System.in);
       boolean mainLoop = true;
       int option = 0;
       while (option > 2){
       
    }
    do {
        System.out.println("Choose an option");
    System.out.println("1.- If your product has IVA, choose this option :");
    System.out.println("2.- If your product does NOT have IVA, choose this option : ");

    System.out.println("Enter your option");
    option = keyboard.nextInt();
    
    switch (option){
       case 1:
            System.out.println("Enter the value of the product");
   
            float ValueProduct = keyboard.nextInt();
            float IVA = PrintValueTax(ValueProduct);
            
            System.out.println("The IVA form this value is: " + IVA);
             break;
             
       case 2:
           System.out.println("Thanks for using this service" );
         System.exit(0);
        break;
        
       default:
           System.out.println("This option is incorrect");
           break;
    }
    
   }  while (option != 2); 
    }   
    

   public static float PrintValueTax(float ValueProduct) {
       
       float IVA;
       IVA = (float)(ValueProduct * 0.12);
       return (float) IVA;
   }
       
   }
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    



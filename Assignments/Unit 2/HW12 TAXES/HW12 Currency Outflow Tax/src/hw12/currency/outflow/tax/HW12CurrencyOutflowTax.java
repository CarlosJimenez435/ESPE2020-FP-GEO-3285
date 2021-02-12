
package hw12.currency.outflow.tax;

import java.util.Scanner;

public class HW12CurrencyOutflowTax {

    public static void main(String[] args) {
       //Currency Outflow tax
       
       Scanner keyboard = new Scanner(System.in);
       boolean mainLoop = true;
       int option = 0;
       while (option > 2){
           
       }
         do{
               
    
     System.out.println("Choose an option");
     System.out.println("Insert currency output method: ");
     System.out.println("1.- Credit card or debit card");
     System.out.println("2.- Using virtual currency");
     System.out.println("3.- Exit");
     
     option = keyboard.nextInt();
     
     switch (option){
         
     case 1: 
     
         System.out.println("Enter the amount of money");         
         float Money = keyboard.nextFloat();
         float Tax = PrintTaxPercentage(Money);   
         
         System.out.println("The tax for this amount of money is: " + Tax + "%");
         break;
         
         
         case 2:    
         
         System.out.println("Enter the amount of money");         
         float Money2= keyboard.nextFloat();
         float Tax2 = PrintTaxPercentage(Money2);  
         
         System.out.println("The tax for this amount of money is: " + Tax2 + "%");
         break;
         
         
         case 3:
         
         System.out.println("Thanks for using this service");         
         System.exit(0);
         break;
         
         default:
             System.out.println("Tis option si invalid");
             break; 
             
     }
         }  while (option != 3);
                 
             
         }

         
         
    public static float PrintTaxPercentage(float Money) {
        float Tax = 0.0F;
        float Value = 0.000F;
        
        if (Money > 5000.00) {
            Tax = 5;
            Value = (float) (Money*0.05);
        }else{
            Tax = 0;
            Value = (float)(Money);
        }
       
        System.out.println("The value is "+ Value + " since ");
        return Tax;
        
    }

    public static float PrintTaxPercentage2(float Money2) {
        float Tax2 = 0.0F;
        float Value2 = 0.000F;
        
        if (Money2 > 100.00) {
            Tax2 = 5;
            Value2 = (float) (Money2*0.05);
        }else{
            Tax2 = 0;
            Value2 = (float)(Money2);
        }
       
        System.out.println("The value is "+ Value2 + " since ");
        return Tax2;
    }
}
    
       
    
               
           
       

    
      
    
        
        
    
        
    
             
    
   

    
    
    
     
         
     
         
         
     
     
    
    
    

    
    
    

    



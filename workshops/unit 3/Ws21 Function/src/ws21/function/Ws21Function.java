
package ws21.function;
import java.util.Scanner;
public class Ws21Function {

    public static void main(String[] args) {
    System.out.println("Autor: Carlos Jiménez ");
        prices();

            
            
        }
              public static void prices(){
              
       String name;
       double price;
       int amount;
       double subTotal;
       double Total;
       double Total2;
       double Taxes;
       double iva = 0.12;
       double discount; 
       
           Scanner cant = new Scanner(System.in);
              System.out.println("What do you want to calculate from the printer");
        name = cant.next();
        
        System.out.println("What is the price of a 3d print: "  + name+    " ." );
        price = cant.nextDouble();
        
        System.out.println("¿How many 3d prints will you need? " + name + " : ");
        amount = cant.nextInt();
        
        subTotal = price * amount;
        Taxes = subTotal * iva;       
        Total = subTotal + iva;
        
        if(Total > 400 ){    
            
            Total2 = Total*0.12 +(Total);
            
            System.out.println("your invoice is:"
                    + " \n product:  "+name
                    + " \n price:  "+ price
                    + " \n amunt:  "+ amount
                    + " \n taxes:  "+ Taxes
                    + " \n Total:  "+ Total
                    + " \n discount:  "+(Total2*0.12)
                    + " \n The total price is:  " +Total2 );
            
            
                                                    
              }else{
            System.out.println("your invoice is:"
                    + " \n product:  "+name
                    + " \n price:  "+ price
                    + " \n amunt:  "+ amount
                    + " \n taxes:  "+ Taxes
                    + " \n Total:  "+ Total);
            
        }
              
                  
                  
                
              } 
        }
       
       

            
           
        
       
        
        
    
    


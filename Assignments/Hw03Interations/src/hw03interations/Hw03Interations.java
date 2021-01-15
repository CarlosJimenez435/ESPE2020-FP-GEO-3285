
package hw03interations;

import java.util.Scanner;

public class Hw03Interations {

    public static void main(String[] args) {
        //Prime numbers less than a number 'n'//
        
       Scanner lector = new Scanner(System.in);
       
       int n;
       
       while(true){
           
           System.out.println("Insert positive number:");
           n = lector.nextInt();
           
           if(n>0){
               
                       for(int i=2;i<n;i++){
                           
                           int growing = 2;
                           
                           boolean IsPrime = true;
                           
                           while(IsPrime && growing <i){
                               
                               if(i % growing == 0){
                                   
                                   IsPrime = false;
                                   
                               }
                               else{
                                   
                                   growing++;
                                   
                               }
                               
                           }
                           
                           if (IsPrime){
                               
                           System.out.println(i+" Is a prime number.");
                       }
                      
                       
                       }
                        {break;}
           }       
           
           else{
               
               System.out.println("The number entered is not correct."+"Try again");
               
           }
        
    } 
       
       
       
//Multiplication tables with the number 22
System.out.println("1 Use \"While\" Number of a list");{
        
        int i ;
        i= 0;
        System.out.println("This is a while loop from 1 to 22");
        
        while  (i <22) {
            System.out.println("i-->" +(i+1));
            i+=1;
        }
        
        System.out.println("2 Use \"For\" in multiplication "
                + "Table whit a number list");
        System.out.println("Multiplication tables :22 ");
        
        int stop = 12;
        int product = 0;
        int table = 22;
        for(int k=1 ; k<=stop ; k++){
            product = table * k;
            System.out.println("22 * " + k + " = " + product);
        }
    }
    
}

    }
    


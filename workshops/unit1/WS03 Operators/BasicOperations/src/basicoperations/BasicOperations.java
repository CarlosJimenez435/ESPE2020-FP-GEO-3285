
package basicoperations;

import java.util.Scanner;
public class BasicOperations {

    
    public static void main(String[] args) {
    
       Scanner entrada = new Scanner (System.in);
       
       int sum;
       int rest;
       int mult;
       int divi;
       int addend1;
       int addend2;
       
       
               
       System.out.println("the first number");
       addend1 = entrada.nextInt();
       System.out.println("the second number");
       addend2 = entrada.nextInt();
       
       sum = addend1+addend2;
       rest = addend1-addend2;
       mult = addend1*addend2;
       divi = addend1/addend2;
       
        System.out.println("the result of the sum"+sum);
        System.out.println("the result of the rest"+rest);
        System.out.println("the result of the mult"+mult);
        System.out.println("the result of the divi"+divi);
        
    }
    
}

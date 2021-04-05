
package ws22modularity;

import Utils.BasicOperations;
import java.util.Scanner;

public class WS22Modularity {

    public static void main(String[] args) {
        float operand1;
        float operand2;
        float result;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("  Enter two numbers:   ");
        operand1 = keyboard.nextFloat();
        operand2 = keyboard.nextFloat();
        
        
        System.out.println("----------ADDITION--------");
        
        result = BasicOperations.addTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " + " + operand2 +" = " + result);
        
        
        
        
        
        System.out.println("-----SUBSTRACT-----");
        
        result = BasicOperations.substractTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " - " + operand2 +" = " + result);
        
        
        System.out.println("-----MULTIPLICATION-----");
        
        result = BasicOperations.multiplicationTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " * " + operand2 +" = " + result);
        
        
        
        System.out.println("-----DIVISION-----");
        
        result = BasicOperations.divisionTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " / " + operand2 +" = " + result);
        
        
    }
    
}

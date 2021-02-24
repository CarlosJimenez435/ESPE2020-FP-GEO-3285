
package recursion.example;

import java.util.Scanner;

public class RecursionExample {

public static void main(String[] args){
    
    Scanner enter = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = enter.nextInt();
    Recursion recursion = new Recursion();
    
    int factorial = recursion.Factorial(num);
    System.out.println("The factrorial of: " + num + " is " + factorial);
}

    
}

    
       
    





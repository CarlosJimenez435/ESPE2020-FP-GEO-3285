
package hw08.factorialnumber;

import java.util.Scanner;

public class HW08FactorialNumber {

  
    public static void main(String[] args) {
        
    Scanner keyboard = new Scanner(System.in);

System.out.println("Enter the number:");
int num = keyboard.nextInt();

    }
public static double factorial(int n){
    double aux = 1;
    for (int i = 2; i <= n; i++){
        aux *= i;
    }
    return aux;
    
            
}

}
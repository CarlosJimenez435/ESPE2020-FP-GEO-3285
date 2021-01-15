
package ws07menus;

import java.util.Scanner;

public class WS07Menus {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean mainloop = true;
    int option;
    
    do {
        System.out.println("Calculator");
        System.out.println("1.- Additio");
        System.out.println("2.- Subtraction");
        System.out.println("3.- Multiplication");
        System.out.println("4.- Division");
        System.out.println("5.- EXIT");
        
        System.out.println("Enter your choose menu option -->");
        option = input.nextInt();
        
        switch(option){
            
            case 1:
            int addend1;
            int addend2;
            int sum;
            System.out.println("Enter addend1 -->");
            addend1 = input.nextInt();
            System.out.println("Enter addend2 -->");
            addend2 = input.nextInt();
            sum = addend1 + addend2;
            System.out.println("The sum is -->" + sum);
            break;
            
            case 2:
                System.out.println("The sibtraction is");
                break;
                
            case 3:
                System.out.println("The multiplication is");
                break;
                
            case 4:
                System.out.println("The divisio is");
                break;
                
            case 5:
                System.out.println("Thanks come back soon");
                System.exit(0);
                break;
                
        }          
                
    } while(option < 6 );
    
    }
    }
 
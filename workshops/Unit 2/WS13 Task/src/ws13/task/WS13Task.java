
package ws13.task;

import java.util.Scanner;

public class WS13Task {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner (System.in);
        int option;
     do{
         System.out.println("Choose the figure for which you want to calculate the area:");         
         System.out.println("1.- Triangle.");        
         System.out.println("2.- Circle.");
         System.out.println("3.- Trapeze.");
       
         System.out.println("--------------------------------------------------------------------------------");
         System.out.println("To calculate the physical formulas of:");
         System.out.println("4.- Amount of movement:");
         System.out.println("5.- Potential energy:");
         System.out.println("6.- Kinetic energy:");
         System.out.println("7.- Exit.");
        option = keyboard.nextInt();
         
         double base = 0.0, height = 0.0, area =0.0,radio =0.0, pi = 3.1415, areacirc = 0.0, BMajor = 0.0,BMinor = 0.0, heightTrap = 0.0,
                  mass = 0.0, velo =0.0, massEp = 0.0, grav =0.0, heightEp =0.0 ,massEk =0.0, VeloEk =0.0 ;  
         
         if(option == 1){
             System.out.println("Enter the base of triangle:");
             base = keyboard.nextDouble();
             
             System.out.println("Enter the height of triangle: ");
             height = keyboard.nextDouble();
             area = (base*height)/2;
             System.out.println("The area of triangle is : " + area);
             
         }
         else{
             if(option == 2){
                 System.out.println("Enter the radio of circle:");
                 radio = keyboard.nextDouble();
                 areacirc = pi*radio*radio;
                 System.out.println("The area of circle is: " + areacirc);
             }
             else{
                 
                 if (option == 3 ){
                     
                     System.out.println("Enter the Major base: ");
                     BMajor = keyboard.nextDouble();
                     System.out.println("Enter the Minor base: ");
                     BMinor = keyboard.nextDouble();
                     System.out.println("Enter the heigh of trpeze: ");
                      heightTrap = keyboard.nextDouble();
                      Double areaTrap = ((BMajor + BMinor) * heightTrap)/2;
                      System.out.println("The area of trapeze is: " + areaTrap);
                 }
                 else{
                     if (option == 4){
                         System.out.println("Enter the mass:");
                         mass = keyboard.nextDouble();
                         System.out.println("Enter the velocity:");
                         velo = keyboard.nextDouble();
                         Double Ammout = (mass * velo);
                         System.out.println("The Amount of movement is: " + Ammout + "kgm/s ");
                     }
                     else{
                         if (option == 5){
                             System.out.println("Enter the mass for EP :");
                             massEp = keyboard.nextDouble();
                             System.out.println("Enter the value of gravity");
                             grav = keyboard.nextDouble();
                             System.out.println("Enther the heigh for EP");
                             heightEp = keyboard.nextDouble();
                             Double Potential = (massEp*grav*heightEp);
                             System.out.println("The Potential energy is: " + Potential + " Jouls");
                                     
                             
                         }
                         else{
                             if (option == 6){
                                 System.out.println("Enter the mass for Ek :");
                             massEk = keyboard.nextDouble();
                             System.out.println("Enter the value Velocity");
                             VeloEk = keyboard.nextDouble();
                             Double Kinetic = (massEk*VeloEk*VeloEk);
                             System.out.println("The Potential energy is: " + Kinetic + " Jouls");
                             
                             }
                         }
                     }
                 }     
             }
         }
     }while(option<7);   
        System.out.println("Thanks for use this service");
    }
    
}

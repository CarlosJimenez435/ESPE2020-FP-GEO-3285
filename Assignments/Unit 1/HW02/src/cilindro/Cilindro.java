
package cilindro;

import java.util.Scanner;

public class Cilindro {
     //Enter start
    
    public static void main(String[] args) {
        
        Scanner enter = new Scanner (System.in);
        
        double r,h, atotcilindro = 0,volcilindro = 0;
        
        System.out.println("Program for cylinder area and volume");
        System.out.println("");
        
        
        System.out.println("Insert cylinder radius:");
        r = enter.nextDouble();
        System.out.println("");
        
        
        System.out.println("Insert cylinder height:");
        h = enter.nextDouble();
        System.out.println("");
        
        
        //Final Enter
        
        //Process Initial
              
               
        atotcilindro = ((2)*(3.1415)*(r))*(h+r);   
        volcilindro = (3.1415)*(r*r)*(h);
        
        //Final process
        
        System.out.println("The area of cylinder is:"+atotcilindro+"cm3");
        System.out.println("The volume of the cylinder is:"+volcilindro+"cm3");
        
       
        
        
    }
    
}


package hw11recursion;

import java.util.Scanner;

public class HW11Recursion {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      
        boolean mainLoop = true;
        
        int num = 0;

        do {
            System.out.println("Hi, you can choose an option: ");
            System.out.println("1. Flow rate by speed and time");
            System.out.println("2. Rotational displacement of a "
                    + "landslide using : Width of the break surface, length of"
                    + " the break surface and depth of the break surface by "
                    + "perpendicularity to the original topography "
                    + "of the terrain.");
            System.out.println("0.- Exit");

            System.out.println("Put your number of option:");
            num = (int) input.nextFloat();

            switch (num) {

                case 1:
                    System.out.println("Put the calculated velocity (m^3/hr): ");

                    float F = 0;
                    float V = input.nextFloat();

                    System.out.println("Put the calculated time: ");

                    float T = input.nextFloat();
                    PrintFlow(F, V, T);

                    break;

                case 2:

                    System.out.println("Put the width of the break surface: ");

                    float Width = input.nextFloat();

                    System.out.println("Put the length of the break surface: ");
                    float Length = input.nextFloat();

                    System.out.println("Put the depth of the break surface by "
                            + "perpendicularity to the original topography "
                            + "of the terrain: ");

                    float Depth = input.nextFloat();

                    float pi;

                    pi = (float) 3.1415926535897932;

                    PrintRotational(Width, Length, Depth, pi);
                    break;

                case 0:
                    System.out.println(" See on the next time ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("You choose a invalid option\n\n");
                    break;
                    

            }
        } while (num != 0);
             
    }

    private static void PrintFlow(float F, float V, float T) {

        F = V / T;

        System.out.println(" Your flow is whit speed: " + V + " and "
                + " T : " + T + " is :" + F);
    }

    private static void PrintRotational(float Width, float Length, float Depth, float pi) {

        float Displacement = (((pi) * (Width * Depth * Length)) / (6));

        System.out.println("Your rotational displacement is: " + Displacement);

    }

  
    
    
  }
    
    


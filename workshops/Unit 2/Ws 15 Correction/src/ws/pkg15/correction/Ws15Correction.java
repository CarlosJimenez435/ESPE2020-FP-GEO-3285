
package ws.pkg15.correction;

import java.util.Scanner;


public class Ws15Correction {

    public static void main(String[] args) {
         int hardwareStoreProducts = 0;
        String[] products;
        float[] tools;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Plase Enter the number  of products ->");
        hardwareStoreProducts = scanner.nextInt();

        products = new String[hardwareStoreProducts];
        tools = new float[hardwareStoreProducts];

        for (int i = 0; i < hardwareStoreProducts; i++) {
            scanner.nextLine();
            System.out.println("Please Enter the name of product " + i + " ->");
            products[i] = scanner.nextLine();
            System.out.println("Please enter " + products[i] + " prices ->");
            tools[i] = scanner.nextFloat();
        }

        System.out.println(" Product ->  \t    price  ");

        for (int i = 0; i < hardwareStoreProducts; i++) {
            System.out.println(products[i] + " -> \t" + tools[i]);
        }

    }
}
    
    
    


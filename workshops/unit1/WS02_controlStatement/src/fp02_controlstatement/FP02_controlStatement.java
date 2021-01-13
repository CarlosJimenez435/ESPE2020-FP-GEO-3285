/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp02_controlstatement;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class FP02_controlStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner touch = new Scanner(System.in);       
        int n;
        System.out.println("in");
        n = touch.nextInt();     
        if(n%2==0){
            System.out.println(n+"even number.");
        }else {
            System.out.println(n+"not an even number.");
           
        }
    }
    }
    


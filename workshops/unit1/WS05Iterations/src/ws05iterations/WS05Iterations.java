/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws05iterations;

/**
 *
 * @author USER
 */
public class WS05Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       int i;
       i = 0;
       
       System.out.println("This a while loop from 1 to 0");
       while(i<10){
           System.out.println("i-->"+(i+1));
           
           i++;
           
             
       }
      
       for(int j=1 ;j<10;j+=2){
           System.out.println("odd number -->" + j);
           
           
       }
       System.out.println("first 5 even numbers");
       i=2;
       while (i<=10){
             System.out.println(i+"--> is even");
             
             i+=2;
             
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

import java.util.Scanner;

public class HW04Menus {

    
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
   
    boolean Exit = false;
    int Option;
    
    while(!Exit){
        
        System.out.println("Book menu");
        System.out.println("1.- Read in pdf format");
        System.out.println("2.- Download book");
        System.out.println("3.- Read the book on the website");
        System.out.println("4.- Buy this book");
        System.out.println("5.- Share this book");
        System.out.println("6.- See other books");
        System.out.println("7.- Exit");
        
        System.out.println("Choose an option:  ");
        Option= input.nextInt();
        
        switch(Option){
            case 1:
                System.out.println("Read in pdf format:");
                break;
                
                
                case 2:
                    System.out.println("Download book:");
                break;
                
                case 3:
                    System.out.println("Read the book on the website:");
                break;
                
                case 4:
                    System.out.println("Buy this book:");
                break;
                
                case 5:
                    System.out.println("Share this book:");
                break;
                
                case 6:
                    System.out.println("See other books:");
                break;
                
                case 7:
                    Exit = true;
                break;
                default:
                System.out.println("Choose a valid Option");
        }
    }
       System.out.println("THANK YOU, COME BACK SOON");
       sn.next();
       
    }
    }
    


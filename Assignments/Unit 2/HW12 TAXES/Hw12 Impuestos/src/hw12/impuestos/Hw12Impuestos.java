
package hw12.impuestos;

import java.util.Scanner;

public class Hw12Impuestos {

    public static void main(String[] args) {
        //income tax

        System.out.println("Table of income tax for natural persons");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insert your annual income: ");
        float AnnualIncome = input.nextFloat();
        float ExcessFractionTax = PrintTaxPercentage(AnnualIncome);
       
        System.out.println("The %ExcessFractionTax is:" + ExcessFractionTax );
        
    }

    public static float PrintTaxPercentage(float AnnualIncome) {
         float ExcessFractionTax = 0.0F;
        float Value = 0.0000F;

        
        
        if (AnnualIncome < 11212) {
            ExcessFractionTax = 0;
            Value = AnnualIncome;
                
            
        } else if (AnnualIncome >= 11212) {
            if (AnnualIncome < 14285) {
                ExcessFractionTax = 5;
                Value = (float) (AnnualIncome * 0.05);
            
            } else if (AnnualIncome >= 14285) {
                if (AnnualIncome < 17854) {
                    ExcessFractionTax = 10;
                    Value = (float) (AnnualIncome * 0.1);

                } else if (AnnualIncome >= 17854) {
                    if (AnnualIncome < 21442) {
                        ExcessFractionTax = 12;
                        Value = (float) (AnnualIncome * 0.12);

                    } else if (AnnualIncome >= 21442) {
                        if (AnnualIncome < 42874) {
                            ExcessFractionTax = 15;
                            Value = (float) (AnnualIncome * 0.15);

                        } else if (AnnualIncome >= 42874) {
                            if (AnnualIncome < 64297) {
                                ExcessFractionTax = 20;
                                Value = (float) (AnnualIncome * 0.20);

                            } else if (AnnualIncome >= 64297) {
                                if (AnnualIncome < 85729) {
                                    ExcessFractionTax = 25;
                                    Value = (float) (AnnualIncome * 0.25);

                                } else if (AnnualIncome >= 85729) {
                                    if (AnnualIncome < 114288) {
                                        ExcessFractionTax = 30;
                                        Value = (float) (AnnualIncome * 0.30);

                                    } else if (AnnualIncome >= 114288) {
                                        ExcessFractionTax = 35;
                                        Value = (float) (AnnualIncome * 0.35);

                                    }

                                }

                            }
                        }

                    }
                }
            }
        }
        
        System.out.println("");
        
        System.out.println("The value to pay is: " + Value + " since ");
        
        return ExcessFractionTax;
    }
}
           
               
             

package ws12.libraries;

public class WS12Libraries {

    private static float absoluteValue;

    public static void main(String[] args) {
     
        
//Math Library
      
      //if we have the math library
      //We import and use it
      
      float squareRoot = 0.0F;
      float number = 0.0F;
      float power = 0.0F;
      float base = 0.0F;
      float exponent = 0.0F;
      
      number = 9; //squaereRoot = -> 3
      squareRoot = (float)Math.sqrt(number);
      System.out.println("The square root of : " + number + " is -> " + squareRoot);
     
      number = 49; //squaereRoot = -> 7
      squareRoot = (float)Math.sqrt(number);
      System.out.println("The square root of : " + number + " is -> " + squareRoot);
      
      number = 5; //squaereRoot = -> 
      squareRoot = (float)Math.sqrt(number);
      System.out.println("The square root of : " + number + " is -> " + squareRoot);
      
      base = 3;
      exponent = 2;
      //power = 9?
     power = (float)Math.pow(base ,exponent);
      System.out.println("The power of : " + base + " is -> " + power);
      
      base = 2;
      exponent = 4;
      //power = 16?
      power = (float)Math.pow(base ,exponent);
      System.out.println("The power of : " + base + " is -> " + power);
            
      base = 78;
      exponent = 5;
      // calculator 78^5
      //2.887174358
      power = (float)Math.pow(base ,exponent);
      System.out.println("The power of : " + base + " is -> " + power);
      

  
        //if we don´t have the library, what would we do?
        //we should create the feature, the library
        //out own algorithm to compute the square root
         absoluteValue = getAbsoluteValue(number);
         
         number = -5;
       
         absoluteValue  = getAbsoluteValue(number);
         System.out.println("Absolute value of: " + number + " is " +absoluteValue);
    }
    public float computePower(float base, float exponent){
       float power;
        power = 1.0F;
        
        for (int i = 1; i <=(int)exponent ; i++){
            
        }
    
    return power;
    }
    private static float getAbsoluteValue(float number){
        if (number < 0){
            number = number * -1;
            
        }else{
            
        }
        return number;
    }
            
}

        
   



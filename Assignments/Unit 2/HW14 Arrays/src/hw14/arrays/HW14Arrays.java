
package hw14.arrays;

public class HW14Arrays {

    public static void main(String[] args) {
        
        String[] MostPopularCellphones = {"Samsung", "Xiaomi","Iphone", "Huawei"};
        
        String[] LowPopularCellphones = {"Nokia", "Alcatel","Motorola"};
        
        
        System.out.println("MostPopularCellphones");
        for (String Cellphone : MostPopularCellphones ){
            System.out.println("Name of Most Popular Cellphones: " + Cellphone);
                              
        }
        
        System.out.println("LowPopularCellphones");
        for (String Cellphone : LowPopularCellphones ){
             System.out.println("Name of Most Popular Cellphones: " + Cellphone);
        }
           
        
    }
    
}


package ws04.logicaloperators;

public class WS04LogicalOperators {

    public static void main(String[] args) {
        int x = 20;
        if (x != 20) {
            System.out.println("x is equals to 10");
        } else {
            System.out.println("x is NOT equal to 10");
        }

        boolean y = x != 10;
        System.out.println("x != 10 --> " + (y));
        System.out.println("x == 10 --> " + (x == 20));
        System.out.println("x = 5 -->   " + (x = 10));
        System.out.println("x > 5 -->  " + (x > 10));
        System.out.println("x >= 5 --> " + (x >= 10));

        boolean comparison = false;
        boolean comparison2 = false;
        boolean comparison3 = false;
        comparison = x != 62;
        System.out.println("comparison -> " + comparison);

        comparison2 = x >= 22;
        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        System.out.println("comparison2 -> " + comparison2);

        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);

        boolean p;
        boolean q;

        p = true;
        q = true;
        System.out.println(" ( " + p + " v " + q + " ) " + (p || q));

        p = true;
        q = false;
        System.out.println(" ( " + p + " v " + q + " ) " + (p || q));
        
        p = false;
        q = true;
        System.out.println(" ( " + p + " v " + q + " ) " + (p || q));
        
        p = false;
        q = false;
        System.out.println(" ( " + p + " v " + q + " ) " + (p || q));
    }
    
}

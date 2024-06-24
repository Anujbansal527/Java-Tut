
import java.math.BigDecimal;
import java.math.BigInteger;

public class math {
    public static void main(String[] args) {
        
        //min
        System.err.println(Math.min(10,20));
    
        //max
        System.err.println(Math.max(50,60));

        //pow
        System.err.println(Math.pow(2,3));

        //sqrt
        System.err.println(Math.sqrt(16));

        BigInteger a = new BigInteger("441641544444544");
        BigInteger b = new BigInteger("444885844444544");
        
        System.err.println(a.add(b));
        System.err.println(a.compareTo(b));
        System.err.println(a.abs());
        System.err.println(a.and(b));
        System.err.println(a.max(b));
    
        /*
         * BigInteger functions ..........
         */

         BigDecimal bd = new BigDecimal(45.144546656666);
        /* bigdecimal methods */
    }
}

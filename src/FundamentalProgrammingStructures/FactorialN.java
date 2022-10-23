package FundamentalProgrammingStructures;

import java.math.BigInteger;

public class FactorialN {
    public static void main(String[] args) {
        BigInteger product = BigInteger.ONE;
        for (int n = 1; n <= 1000; n++) {
            product = BigInteger.valueOf(n).multiply(product);
        }
        System.out.println(product);
    }
}

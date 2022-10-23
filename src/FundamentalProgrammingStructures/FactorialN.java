package FundamentalProgrammingStructures;

import java.math.BigInteger;

public class FactorialN {
    public static void main(String[] args) {
        BigInteger product = BigInteger.ONE;
        for (int n = 1; n <= 5; n++) {
            product = product.multiply(BigInteger.valueOf(n));
        }
        System.out.println(product);
    }
}

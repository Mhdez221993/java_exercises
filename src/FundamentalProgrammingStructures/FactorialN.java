package FundamentalProgrammingStructures;

import java.math.BigInteger;

/*
Write a program that computes the factorial n! = 1 × 2 × ... × n, using
BigInteger. Compute the factorial of 1000.
 */
public class FactorialN {
    public static void main(String[] args) {
        BigInteger product = BigInteger.ONE;
        for (int n = 1; n <= 5; n++) {
            product = product.multiply(BigInteger.valueOf(n));
        }
        System.out.println(product);
    }
}

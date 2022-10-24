package FundamentalProgrammingStructures;

import java.math.BigInteger;
import java.util.Scanner;

/*
Write a program that reads in two integers between 0 and 4294967295,
stores them in int variables, and computes and displays their unsigned
sum, difference, product, quotient, and remainder. Do not convert them to
long values.
 */

public class ComputeIntValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please introduce to integers value between 0 and 4294967295");

        int a = (int) in.nextLong();

        int b = (int) in.nextLong();

        int unsignedSum = Integer.sum(a, b);

        int unsignedQuotient = Integer.divideUnsigned(a, b);

        int unsignedProduct = a * b;

        int unsignedDifference = a - b;

        int unsignedRemainder = Integer.remainderUnsigned(a, b);

        System.out.println(Integer.toUnsignedString(unsignedSum));

        System.out.println(Integer.toUnsignedString(unsignedQuotient));

        System.out.println(Integer.toUnsignedString(unsignedProduct));

        System.out.println(Integer.toUnsignedString(unsignedDifference));

        System.out.println(Integer.toUnsignedString(unsignedRemainder));
    }
}

package Programs.NumberPrograms;

/*
A positive integer is called a spy number if the sum and product of its digits are equal.
In other words, a number whose sum and product of all digits are equal is called a spy number.
 */

import java.util.Scanner;

public class SpyNumber {
    static boolean isSpy(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int remainder = n % 10;
            sum += remainder;
            product *= remainder;
            n /= 10;
        }

        return  (sum == product);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check: ");

        int n = in.nextInt();

        if (isSpy(n))
            System.out.println(n + " is spy");
        else
            System.out.println(n + " is not spy");
    }
}

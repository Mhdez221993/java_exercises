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

        System.out.print("Enter lower range: ");
        int lower = in.nextInt();

        System.out.print("Enter upper range: ");
        int upper = in.nextInt();

        for (int i = lower; i <= upper; i++) {
            if (isSpy(i))
                System.out.print(i + " ");

        }

    }
}

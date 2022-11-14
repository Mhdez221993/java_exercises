package Programs.NumberPrograms;

import java.util.Scanner;

/*
A positive integer whose sum of digits of its square is equal to the number itself is called a neon number.
 */
public class NeonNumber {
    static boolean isNeon(int n) {
        int sum = 0;
        int sqrt = n * n;

        while (sqrt  > 0) {
            int remainder = sqrt % 10;
            sum += remainder;
            sqrt /= 10;
        }

        return  (sum == n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a range to check: ");
        int upperBound = in.nextInt();

        for (int i = 0; i <= upperBound; i++) {
            if (isNeon(i))
                System.out.println(i + " ");
        }
    }
}

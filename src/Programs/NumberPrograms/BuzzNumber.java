package Programs.NumberPrograms;

/*
Buzz number is another special number in Java
that ends with digit 7 or
divisible by 7.
Unlike Prime and Armstrong numbers, the Buzz number is not so popular and asked by the interviewers.
 */

import java.util.Scanner;

public class BuzzNumber {
    static boolean isBuzz(int n) {
        // check if n is divisible by 7 or last digit of n is equal to 7
        if (n % 7 == 0 || n % 10 == 7)
            return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the range to check: ");

        int bound = in.nextInt();

        for (int i = 1; i <= bound; i++) {
            if (isBuzz(i))
                System.out.print(i + " ");
        }
    }
}

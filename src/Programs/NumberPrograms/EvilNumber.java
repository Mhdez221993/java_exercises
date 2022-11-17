package Programs.NumberPrograms;

/*
The Evil number is another special positive whole number in Java that has an even number of 1's in its binary equivalent.
Unlike Prime and Armstrong numbers, Evil number is not so popular and asked by the interviewers.

The numbers which are not evil are called odious numbers.
 */

import java.util.Scanner;

public class EvilNumber {
    static long convertToBinary(int n) {
        long binaryNumber = 0;

        int remainder = 0;
        int j = 1;
        while (n > 0) {
            remainder = n % 2;
            binaryNumber += remainder * j;
            n /= 2;
            j = j * 10;
        }

        return binaryNumber;
    }

    static boolean isEvil(int n) {
        long binaryNumber = convertToBinary(n);

        // find total number of 1's in binary number
        int count = 0;

        while (binaryNumber > 0) {
            if (binaryNumber % 10 == 1)
                count++;

            binaryNumber /= 10;
        }

        return (count % 2 == 0);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter range: ");

        int bound = in.nextInt();

        for (int i = 1; i <= bound; i++)
            if (isEvil(i))
                System.out.print(i + " ");
    }
}

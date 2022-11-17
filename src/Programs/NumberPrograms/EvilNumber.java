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
        int j = 0;
        while (n > 0) {
            remainder = n % 2;
            binaryNumber += remainder * j;
            n /= 2;
            j = j * 10;
        }

        return binaryNumber;
    }

    static boolean isEvil(int n) {
        long binary = convertToBinary(n);

        int countOnesInN = 0;

        for (int i = 0; i < nToString.length(); i++) {
            if (nToString.charAt(i) == '1')
                countOnesInN++;
        }

        return (countOnesInN % 2 == 0);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check: ");

        int n = in.nextInt();

        if (isEvil(n))
            System.out.println("Is Evil");
        else
            System.out.println("Is not Evil");
    }
}

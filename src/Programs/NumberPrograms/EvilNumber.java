package Programs.NumberPrograms;

/*
The Evil number is another special positive whole number in Java that has an even number of 1's in its binary equivalent.
Unlike Prime and Armstrong numbers, Evil number is not so popular and asked by the interviewers.

The numbers which are not evil are called odious numbers.
 */

import java.util.Scanner;

public class EvilNumber {
    static boolean isEvil(int n) {
        String nToString = Integer.toString(n, 2);

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

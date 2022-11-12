package Programs.NumberPrograms;

/*
Multiplying a number by two and three separately, the number obtained by writing the results obtained with the given number will be called a fascinating number.
If the result obtained after concatenation contains all digits from 1 to 9, exactly once.

In other words, we can also say that a number (n) may be a fascinating number if it satisfies the following two conditions:

    If the given number is a 3 or more than three-digit

    If the value getting after concatenation contains all digits from 1 to 9, exactly once.
 */

import java.util.Arrays;
import java.util.Scanner;

public class FascinatingNumber {
    static boolean isFascinating(int n) {
        int digit = 0;

        // concatenating num, n2, and n3
        String str = n + "" + n*2 + n*3;

        int digitsArray[] = new int[10];

        // checks all digits from 1 to 9 are present or not
        for (int i = 0; i < str.length(); i++) {
            // convert ith character into an integer
            digit = str.charAt(i) - '0';

            // check arr[digit] element and ignore 0s
            if (digit == 0 || digitsArray[digit] == 0)
                digitsArray[digit]++;
            else
                return false;
        }

        //checks the numbers that are missing
        for (int i = 1; i < digitsArray.length; i++) {
            if (digitsArray[i] == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lowerRange = in.nextInt();

        System.out.print("Enter upper range: ");
        int upperRange = in.nextInt();

        for (int i = lowerRange; i <= upperRange; i++) {
            if (isFascinating(i))
                System.out.print(i + " ");
        }
    }
}

package Programs.NumberPrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
A positive n digit number X is called a Keith number (or repfigit number) if it is arranged in a special number sequence generated using its digits.
The special sequence has first n terms as digits of x and other terms are recursively evaluated as the sum of previous n terms.
For example, 197, 19, 742, 1537, etc.

Steps to Find Keith Number

    Read or initialize a number (X).

    Separate each digit from the given number (X).

    Add all the n-digits. It gives the next term of the series.

    Again, add the last n-terms of the series to find the next term.

    Repeat step 4 until we get the term the same as the number we have taken.
 */

public class KeithNumber {
    static boolean isKeithNumber(String input) {
        int numLen = input.length();

        long[] series = new long[numLen];

        for (int i = 0; i < numLen; i++) {
            series[i] = Long.valueOf(input.substring(i, i + 1));
        }

        long next_term = 0;
        long number = Long.valueOf(input);

        while (next_term < number) {
            next_term = 0;

            for (int i = 0; i < numLen; i++) {
                next_term += series[i];

                if (i < numLen - 1)
                    series[i] = series[i + 1];
                else
                    series[i] = next_term;
            }
        }

        return next_term == number;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of digits the series mush have: ");
        int numLen = in.nextInt();

        if (numLen < 2)
        {
            System.out.println("The number mush have at least 2 digits.");
            return;
        }

        long lowBound = (long) Math.pow(10, numLen - 1);

        long upperBound = (long) Math.pow(10, numLen);

        for (long i = lowBound; i < upperBound; i++) {
            if (isKeithNumber(String.valueOf(i)))
                System.out.print(i + " ");
        }

        in.close();
    }
}

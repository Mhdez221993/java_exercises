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
    static boolean isFascinating(int number) {
        int n2 = number * 2;
        int n3 = number * 3;

        // concatenating num, n2, and n3
        String concatNum = number + "" + n2 + n3;
        boolean found = true;

        // checks all digits from 1 to 9 are present or not
        for (char c = '1'; c <= '9'; c++) {
            int count = 0;

            // loop counts the frequency of each digit
            for (int i = 0; i < concatNum.length(); i++) {
                char ch = concatNum.charAt(i);

                // compares the character of concatNum with i
                if (ch == c)
                    count++;
            }

            // returns true if any of the condition returns true
            if (count > 1 || count == 0) {
                found = false;
                break;
            }
        }

        return found;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce a number to check: ");

        int n = in.nextInt();

        if (isFascinating(n))
            System.out.println(n + " is fascinating");
        else
            System.out.println(n + " is not fascinating");
        // Print "not a fascinating number" if any digit is missing or appeared multiple times. Else, print "fascinating number".
    }
}

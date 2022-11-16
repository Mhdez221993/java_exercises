package Programs.NumberPrograms;

/*
Duck number is another special positive non-zero number that contains zero in it.
The digit zero should not be presented at the starting of the number.
Zero can be present at any of the positions except the beginning of the number.
 */

import java.util.Scanner;

public class DuckNumber {
    static boolean isDuck(int n) {

        while (n > 0) {
            if (n % 10 == 0)
                return true;

            n /= 10;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a range: ");

        int bound = in.nextInt();

        for (int i = 1; i <= bound; i++) {
            if (isDuck(i))
                System.out.print(i + " ");
        }

    }
}

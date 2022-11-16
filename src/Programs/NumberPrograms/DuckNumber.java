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
        System.out.print("Enter a number to check: ");

        int n = in.nextInt();

        if (isDuck(n))
            System.out.println("Is Duck");
        else
            System.out.println("Is not Duck");
    }
}

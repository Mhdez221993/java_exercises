package Programs.BasicPrograms;

/*
Palindrome number in java: A palindrome number is a number that is same after reverse.
For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
It can also be a string like LOL, MADAM etc.
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String reverse = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string/number to check if it is a palindrome: ");

        String original = in.nextLine();

        for (int i = original.length() - 1; i >= 0; i--)
            reverse += original.charAt(i);

        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");

    }
}

package FundamentalProgrammingStructures;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a program that reads a string and prints all of its nonempty
substrings.
 */

public class PrintNonemptyStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please introduce a message");

        String str = in.nextLine();

        String[] strToArray = str.split("\\s+");

        for (int i = 0; i < strToArray.length; i++) {
            System.out.println(strToArray[i]);
        }
    }
}

package FundamentalProgrammingStructures;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;

/*
Write a program that reads a line of text and prints all characters that are
not ASCII, together with their Unicode values.
 */

public class NonASCIIValues {
    public static void main(String[] args) {
        System.out.println("Please introduce an argument like a text");
        Scanner in = new Scanner(System.in);

        String input = in.nextLine().replaceAll(" ", "");

        System.out.println(input);

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int codePoint = input.codePointAt(i);
            if(ch < 128) {
                System.out.println(ch + " code point is: " + codePoint);
            }
        }
    }
}

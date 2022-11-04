package Programs.BasicPrograms;

import java.util.Scanner;

public class HowToPrintASCIIValue {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner in = new Scanner(System.in);

        char chr = in.next().charAt(0);

        int asciiValue = (int) chr;

        System.out.println("ASCII value of " +chr+ " is: "+asciiValue);
    }
}

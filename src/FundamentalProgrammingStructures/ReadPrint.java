package FundamentalProgrammingStructures;

// Write a program that
// reads an integer and
// prints it in
// binary,
// octal, and
// hexadecimal.
// Print the reciprocal as a hexadecimal floating-point number.

import java.util.Scanner;

public class ReadPrint {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("To start converting please introduce a number");
        int n = in.nextInt();

        String nToBinary = Integer.toBinaryString(n);

        String nToOctal = Integer.toOctalString(n);

        String nToHexadecimal = Integer.toString(n, 17);

        float hexToFloat = Float.parseFloat(nToHexadecimal);

        System.out.println(nToBinary);

        System.out.println(nToOctal);

        System.out.println(nToHexadecimal);

        System.out.println(hexToFloat);
    }
}

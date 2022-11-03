package Programs.BasicPrograms.PrintPattern;

import java.util.Scanner;

public class NumberPattern_6 {
    static void printNumberPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j-- )
                System.out.print(j+" ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows you want to print: ");

        int n = in.nextInt();

        printNumberPattern(n);
    }
}

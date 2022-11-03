package Programs.BasicPrograms.PrintPattern;

import java.util.Scanner;

public class NumberPattern_7 {
    static void printNumberPattern(int n) {
        for (int i = 1; i <= n; i++ ) {
            for (int j = i; j >= 1; j--)
                System.out.print(j + " ");

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

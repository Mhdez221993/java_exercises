package Programs.BasicPrograms.PrintPattern;

import java.util.Scanner;

public class NumberPattern_5 {
    static void printNumberPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++ )
                System.out.print(i+" ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want to print: ");

        int n = sc.nextInt();

        printNumberPattern(n);
    }
}

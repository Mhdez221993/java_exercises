package Programs.BasicPrograms.PrintPattern;

import java.util.Scanner;

public class NumberPattern_21 {
    static void printNumberPatter(int n) {
        int min;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }

            for (int j = n - 1; j >= 1; j--) {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }

            System.out.println();
        }

        for (int i = n -1; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }

            for (int j = n - 1; j >= 1; j--) {
                min = i < j ? i : j;
                System.out.print(n - min + 1 + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n: ");

        int n = in.nextInt();

        printNumberPatter(n);
    }
}

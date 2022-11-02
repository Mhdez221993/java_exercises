package Programs.BasicPrograms.PrintPattern;

import java.util.Scanner;

public class ReversePyramidStarPattern {
    static void printPatter(String pattern, int rows) {

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <= i; j++)
                System.out.print(" ");

            for (int j = 0; j < (rows - i); j++)
                System.out.print(pattern);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows you want to print: ");

        int rows = in.nextInt();

        printPatter("* ", rows);
    }
}

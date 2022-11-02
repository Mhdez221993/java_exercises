package Programs.BasicPrograms.PrintPattern;

import java.util.Scanner;

public class DiamondShapePattern {
    static void printPatter(String pattern, int rows) {
        int space = rows - 1;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print(" ");

            space--;

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print(pattern);

            System.out.println("");
        }

        space = 1;

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print(" ");

            space++;

            for (int j = 1; j <= 2*(rows-i) -1; j++)
                System.out.print(pattern);

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows you want to print: ");

        int rows = in.nextInt();

        printPatter("*", rows);
    }
}

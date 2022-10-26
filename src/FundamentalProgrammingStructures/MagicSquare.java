package FundamentalProgrammingStructures;

/*
Write a program that reads a two-dimensional array of integers and
determines whether it is a magic square (that is, whether the sum of all
rows, all columns, and the diagonals is the same). Accept lines of input
that you break up into individual integers, and stop when the user enters a
blank line. For example, with the input
16 3 2 13
5 10 11 8
9 6 7 12
4 15 14 1
(Blank line)
your program should respond affirmatively.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        String[][] array = twoDimensionalArray();

        boolean result = isMagicSquare(array);

        System.out.println(Arrays.deepToString(array));

    }

    public static String[][] twoDimensionalArray(){
        Scanner in = new Scanner(System.in);

        String[][] square = new String[4][4];

        for (int i = 0; i < 4; i++){
            String input = in.nextLine();

            String[] row = input.split(" ");

            square[i] = row;
        }

        return square;
    }

    public static boolean isMagicSquare(String[][] square) {
        return true;
    }
}

// program not finished yet

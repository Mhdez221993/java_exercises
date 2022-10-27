package FundamentalProgrammingStructures;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

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

public class MagicSquare {
    public static void main(String[] args) {
        int[][] twoDArray = read2dArrayOfInt();

        boolean isMagic = determineIfIsMagic(twoDArray);

        System.out.println(isMagic);
    }

    static int[][] read2dArrayOfInt(){
        // Accept a line of input
        Scanner in = new Scanner(System.in);

        System.out.println("Please introduce a line of integers");

        int[][] twoDArray = new int[0][];

        while(true) {
            String line = in.nextLine().trim();

            if(line.length() < 1) break;

            // convert and array from type String to type int
            int[] lineToInt = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

            twoDArray = Arrays.copyOf(twoDArray, twoDArray.length + 1);

            twoDArray[twoDArray.length -1] = lineToInt;

        }

        return twoDArray;
    }

    static boolean determineIfIsMagic(int[][] twoDArray) {
        int[] sumDiagonal = sumOfDiagonal(twoDArray, twoDArray.length);

        if(sumDiagonal[0] - sumDiagonal[1] != 0) return false;

        int[] sumCol = sumOfCols(twoDArray, twoDArray[0].length, twoDArray.length);

        int[] sumRow = sumOfRows(twoDArray, twoDArray[0].length, twoDArray.length);

        for (int i = 0; i < sumRow.length; i++) {
            if(sumRow[i] != sumCol[i]) return false;
        }


        return true;
    }

    static int[] sumOfCols(int[][] twoDArray, int col, int row) {
        int[] sum = new int[col];

        for(int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                sum[i] += twoDArray[j][i];
            }
        }

        return sum;
    }

    static int[] sumOfRows(int[][] twoDArray, int col, int row) {
        int[] sum = new int[col];

        for(int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                sum[i] += twoDArray[i][j];
            }
        }

        return sum;
    }

    static int[] sumOfDiagonal(int[][] twoDArray, int N) {
        int sumOfDiagonal1 = 0;
        int sumOfDiagonal2 = 0;

        for(int i = 0; i < twoDArray.length; i++) {
            sumOfDiagonal1 += twoDArray[i][i];

            sumOfDiagonal2 += twoDArray[i][N - (i+1)];
        }

        return new int[] {sumOfDiagonal1, sumOfDiagonal2};
    }
}

// program not finished yet

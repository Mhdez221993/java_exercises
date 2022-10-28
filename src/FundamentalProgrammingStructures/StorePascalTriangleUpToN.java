package FundamentalProgrammingStructures;

/*
Write a program that stores Pascal’s triangle up to a given n in an
ArrayList<ArrayList<Integer>>.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StorePascalTriangleUpToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nRows = in.nextInt();

        ArrayList<ArrayList<Integer>> pascalTriangles = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> row = new ArrayList<Integer>();

        for (int i = 0; i < nRows; i++) {
            row.add(0, 1);

            for (int j = 1; j < row.size() - 1; j++)
                row.set(j, row.get(j) + row.get(j + 1));

            pascalTriangles.add(new ArrayList<Integer>(row));
        }

        System.out.println(Arrays.toString(pascalTriangles.toArray()));
    }
}

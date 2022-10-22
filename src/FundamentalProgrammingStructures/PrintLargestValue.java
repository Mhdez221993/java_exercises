package FundamentalProgrammingStructures;

import java.util.Scanner;

public class PrintLargestValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please introduce 3 numbers this program will help you find the largest one");

        int a = in.nextInt();

        int b = in.nextInt();

        int c = in.nextInt();

        int max = Math.max(a, b);

        max = Math.max(max, c);

        System.out.println(max);
    }
}

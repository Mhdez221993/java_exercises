package FundamentalProgrammingStructures;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a switch statement that, when given a string with a compass
direction "N", "S", "E", or "W", adjusts the variables x and y. For
example, "W" should decrement x by 1.
 */

public class AdjustCompassDirection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        int x = 0;
        int y = 0;

        switch (str) {
            case "n" -> y = 1;
            case "e" -> x = 1;
            case "w" -> y = -1;
            case "s" -> x = -1;
            default -> {y = 0; x = 0;}
        };

        System.out.println(Arrays.toString(new int[]{x, y}));
    }
}

package FundamentalProgrammingStructures;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a switch expression that, when given a string with a compass
direction "N", "S", "E", or "W", yields an array of x- and y-offsets. For
example, "W" should yield new int[] { -1, 0 }.
 */

public class CompassDirection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine().toLowerCase();

        int[] n = {0, 1};
        int[] s = {0, -1};
        int[] w = {-1, 0};
        int[] e = {1, 0};
        int[] nonDirection = {0, 0};

        int[] direction = switch (str) {
            case "n" -> n;
            case "s" -> s;
            case "w" -> w;
            case "e" -> e;
            default -> nonDirection;
        };

        System.out.println(Arrays.toString(direction));
    }
}

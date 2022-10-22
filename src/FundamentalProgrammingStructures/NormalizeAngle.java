package FundamentalProgrammingStructures;

import java.util.Scanner;

/*
Write a program that reads an integer angle (which may be positive or
negative) and normalizes it to a value between 0 and 359 degrees. Try it
first with the % operator, then with floorMod.
 */

public class NormalizeAngle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Let's start normalizing angle values");

        int n = in.nextInt();

        int normalizedWithMod = ((n) % 356 + 356) % 356;

        int normalizedWithModFloor = Math.floorMod(n, 356);

        System.out.println(normalizedWithMod);

        System.out.println(normalizedWithModFloor);

    }
}

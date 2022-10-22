package FundamentalProgrammingStructures;

import java.util.Scanner;

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

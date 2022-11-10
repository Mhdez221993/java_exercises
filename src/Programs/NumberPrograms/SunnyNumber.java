package Programs.NumberPrograms;

/*
A number is called a sunny number if the number next to the given number is a perfect square.
In other words, a number N will be a sunny number if N+1 is a perfect square.
 */

import java.util.Scanner;

public class SunnyNumber {
    static boolean isSunny(int n) {
        // Find the square root of num+1.
        // If the square root is an integer, the given number is sunny, else not a sunny number.
        if (Math.sqrt(n+1) % 1 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read or initialize a number (num).
        System.out.print("Introduce the first number: ");
        int from = in.nextInt();

        System.out.print("Introduce the second number: ");
        int to = in.nextInt();

        for (int i = from; i <= to; i++) {
            // Add 1 to the given number i.e. num+
            if (isSunny(i))
                System.out.println(i + " ");
        }

    }
}

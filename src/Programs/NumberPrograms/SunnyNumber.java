package Programs.NumberPrograms;

/*
A number is called a sunny number if the number next to the given number is a perfect square.
In other words, a number N will be a sunny number if N+1 is a perfect square.
 */

import java.util.Scanner;

public class SunnyNumber {
    static boolean isSunny(int n) {
        // Find the square root of num+1.
        double sqrt = (int)Math.sqrt(n);

        // If the square root is an integer, the given number is sunny, else not a sunny number.
        return  (sqrt - Math.floor(sqrt) == 0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce a number: ");

        // Read or initialize a number (num).
        int n = in.nextInt();

        // Add 1 to the given number i.e. num+
        if (isSunny(n+1))
            System.out.println("The number "+n+" is Sunny");
        else
            System.out.println("The number "+n+" is not Sunny");
    }
}

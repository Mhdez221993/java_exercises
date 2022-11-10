package Programs.NumberPrograms;

/*
A number is called a sunny number if the number next to the given number is a perfect square.
In other words, a number N will be a sunny number if N+1 is a perfect square.
 */

import java.util.Scanner;

public class SunnyNumber {
    static boolean isSunny(int n) {
        // Add 1 to the given number i.e. num+1.
        int sunny = n + 1;

        if (sunny < 0)
            return false;

        // Find the square root of num+1.
        int sqrt = (int)Math.sqrt(sunny);

        return  (sqrt * sqrt) == sunny;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce a number: ");

        // Read or initialize a number (num).
        int n = in.nextInt();

        if (isSunny(n))
            System.out.println("The number "+n+" is Sunny");
        else
            System.out.println("The number "+n+" is not Sunny");
    }
}

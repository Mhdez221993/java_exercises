package Programs.NumberPrograms;

import java.util.Scanner;

/*
A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.
 */
public class PetersonNumber {
    static int[] factorial = new int[] { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    static boolean isPeterson(int n) {
        int sum = 0;
        int temp = n;
        while (n > 0) {
            // Find the last digit (d) of the given number.
            int lastDigit = n%10;
            // Find the factorial (fact) of the digit.
            // Add the factorial (fact) to a variable
            sum += factorial[lastDigit];
            n /= 10;
        }
        // Repeat steps 2 to 4 until the given number becomes 0.
        // Compare the sum with n. If both are equal, the given number is Peterson, else not.
        return  temp == sum;
    }

    public static void main(String[] args) {
        // Read or initialize a number (n).
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce a number: ");
        int n = in.nextInt();

        if (isPeterson(n))
            System.out.println("The number "+ n + " is a Peterson");
        else
            System.out.println("The number "+ n + " is not Peterson");
    }
}

package Programs.NumberPrograms;

/*
A number is called a tech number if the given number has an even number of digits and the number can be divided exactly into two parts from the middle.
After equally dividing the number, sum up the numbers and find the square of the sum.
If we get the number itself as square, the given number is a tech number, else, not a tech number.
For example, 3025 is a tech number.
 */

import java.util.Scanner;

public class TechNumber {
    static boolean isTech(int n) {
        // Find the number of digits of the given number (num).
        int counter = 0;
        int num = n;
        while (num > 0) {
            num /= 10;
            counter++;
        }


        // If the number of digits is not even, the number (num) is not even.
        if (counter % 2 == 0) {
            // Else, split the given number into two parts (num1 and num2), equally. Note that each part must contain an equal number of digits.
            int firstHalf = n % (int) Math.pow(10, counter / 2);
            int secondHalf = n / (int) Math.pow(10, counter/ 2);

            // Sum up the numbers (num1+num2) and store the result in a variable
            // Find the square of the variable sum and store it in a variable square.
            int squareSum = (firstHalf  + secondHalf) * (firstHalf + secondHalf);

            // Compare the num with the square of the sum if they are equal print Tech Number, else print Not a Tech Number.
            return n == squareSum;
        }


        return  false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please introduce a number to check: ");

        // Read or initialize a number (num).
        int n = in.nextInt();

        if (isTech(n))
            System.out.println(n + " is a tech number");
        else
            System.out.println(n + " is not a tech number");
    }
}

package Programs.NumberPrograms;

/*
To reverse a number, follow the steps given below:

    First, we find the remainder of the given number by using the modulo (%) operator.

    Multiply the variable reverse by 10 and add the remainder into it.

    Divide the number by 10.

    like this 98756 will be 65789
 */

import java.util.Arrays;
import java.util.Scanner;

public class HowToReverseANumber {
    static int withWhileLoop(int number) {
        int remainder = 0;
        int reverse = 0;

        while (number != 0) {
            remainder = number%10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return reverse;
    }

    static int withForLoop(int number) {
        int remainder = 0;
        int reverse = 0;

        for (;number > 0; number /= 10) {
            remainder = number%10;
            reverse = reverse * 10 + remainder;
        }

        return reverse;
    }

    static int withRecursion(int number, int reverse) {
        if (number <= 0)
            return reverse;

        return withRecursion(number / 10, reverse * 10 + (number%10));
    }

    public static void main(String[] args) {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean isNegative = n < 0 ? true : false;

        if(isNegative)
            n *= -1;

        int[] arr = {withWhileLoop(n), withForLoop(n), withRecursion(n,0)};

        if (isNegative)
            Arrays.stream(arr).map(value -> value*1);


        System.out.println("The reverse of the given number using while loop is: " + arr[0]);

        System.out.println("The reverse of the given number using for loop is: " + arr[1]);

        System.out.println("The reverse of the given number using recursion is: " + arr[2]);

    }
}

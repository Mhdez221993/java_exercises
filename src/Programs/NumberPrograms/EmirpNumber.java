package Programs.NumberPrograms;

/*
A number is called an emirp number if we get another prime number on reversing the number itself.
In other words, an emirp number is a number that is prime forwards or backward.
It is also known as twisted prime numbers.
 */

import java.util.Scanner;

public class EmirpNumber {

    static boolean isEmirNumber(int n) {
        if (!isPrime(n))
            return false;

        int reverse = 0;
        while (n > 0) {
            int remainder = n % 10;
            reverse = remainder * 10 + remainder;
            n /= 10;
        }

        return isPrime(reverse);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = in.nextInt();

        if (isEmirNumber(n))
            System.out.println(n + " is emir");
        else
            System.out.println(n + " is not emir");
    }
}
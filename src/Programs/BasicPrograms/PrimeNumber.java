package Programs.BasicPrograms;

/*
Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only.
In other words, prime numbers can't be divided by other numbers than itself or 1.
For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 */

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < (n/2); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return  true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int start = in.nextInt();

        System.out.print("Enter second number: ");
        int end = in.nextInt();

        System.out.println("List of primes between "+ start + " and "+ end);

        for (int i = start; i < end; i++){
            if (isPrime(i))
                System.out.print(i+" ");
        }
    }
}

package Programs.BasicPrograms;

/*
Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only.
In other words, prime numbers can't be divided by other numbers than itself or 1.
For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 */

public class PrimeNumber {
    static void isPrime(int myPrime) {
        int flag = 0;
        int halfPrime = myPrime / 2;

        if (myPrime == 0 || myPrime == 1)
            System.out.println(myPrime + " is not prime number");
        else {
            for (int i = 2; i < halfPrime; i++) {
                if (myPrime % i == 0) {
                    System.out.println(myPrime + " is not prime number");
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0)
            System.out.println(myPrime + " is prime number");
    }

    public static void main(String[] args) {
        int n = 17; // prime to be checked
        isPrime(n);
    }
}

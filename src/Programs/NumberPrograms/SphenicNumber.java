package Programs.NumberPrograms;

/*
A positive integer n is called a sphenic number
if the product of factors of the given number (n)
is exactly three
and all factors are prime.

42 is a sphenic number because it has exactly three prime factors 2, 3, and 7 and the product of these factors gives the number itself.
 */

import java.util.Scanner;

public class SphenicNumber {
    static boolean isSphenic(int n) {
        // get all factors of n
        int factorsOfN[] = getFactorsOfN(n);

        // count how many prime holds the factors array
        int counter = 0;

        for (int i = 0; i < factorsOfN.length; i++) {
            if (isPrime(factorsOfN[i]))
                counter++;
        }

        // if the amount of prime factors of n is not equal to 3 return false
        return counter == 3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check: ");

        int n = in.nextInt();

        if (isSphenic(n))
            System.out.println("Is Sphenic");
        else
            System.out.println("Is not Sphenic");
    }
}

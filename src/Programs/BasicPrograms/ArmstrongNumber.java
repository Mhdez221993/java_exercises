package Programs.BasicPrograms;

import java.util.Scanner;

/*
An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
It is also known as pluperfect, or Plus Perfect, or Narcissistic number. It is an OEIS sequence A005188.
Let’s understand it through an example.

Armstrong Number Example
1: 1^1 = 1

2: 2^1 = 2

153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153

125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
 */
public class ArmstrongNumber {
    static boolean isArmstrong(int n) {
        int digits = 0;
        int temp = n;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = n;
        int sumOfPowers = 0;
        int remainder = 0;

        while (temp > 0) {
            remainder = temp % 10;
            sumOfPowers += (Math.pow(remainder, digits));
            temp /= 10;
        }
        return sumOfPowers == n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the limit: ");

        int n = in.nextInt();

        System.out.println("Armstrong Numbers up to "+ n + " are:");

        for (int i = 0; i <= n; i++)
            if (isArmstrong(i))
                System.out.print(i+" ");
    }
}

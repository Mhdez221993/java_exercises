package Programs.BasicPrograms;

/*
Palindrome number in java: A palindrome number is a number that is same after reverse.
For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
It can also be a string like LOL, MADAM etc.
 */

public class Palindrome {
    public static void main(String[] args) {
        int remainder;
        int sum = 0;
        int temp;

        int n = 454; // it is the number varialb to be checked for palindrome

        temp = n;

        while (n > 0) {
            remainder = n % 10;

            sum = (sum * 10) + remainder;

            n = n / 10;
        }

        if (temp == sum)
            System.out.println("palindrome number");
        else
            System.out.println("not palindrome");

    }
}

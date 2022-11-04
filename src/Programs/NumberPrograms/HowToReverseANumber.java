package Programs.NumberPrograms;

/*
To reverse a number, follow the steps given below:

    First, we find the remainder of the given number by using the modulo (%) operator.

    Multiply the variable reverse by 10 and add the remainder into it.

    Divide the number by 10.

    like this 98756 will be 65789
 */

public class HowToReverseANumber {
    static void withWhileLoop(int number) {
        int remainder = 0;
        int reverse = 0;

        while (number != 0) {
            remainder = number%10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        System.out.println("The reverse of the given number using while loop is: " + reverse);
    }

    static void withForLoop(int number) {
        int remainder = 0;
        int reverse = 0;

        for (;number > 0; number /= 10) {
            remainder = number%10;
            reverse = reverse * 10 + remainder;
        }

        System.out.println("The reverse of the given number using for loop is: " + reverse);
    }

    static int withRecursion(int number, int reverse) {
        if (number <= 0)
            return reverse;

        return withRecursion(number / 10, reverse * 10 + (number%10));
    }

    public static void main(String[] args) {
        withWhileLoop(12345);
        withForLoop(12345);

        int n = withRecursion(12345,0);
        System.out.println("The reverse of the given number using recursion is: " + n);

    }
}

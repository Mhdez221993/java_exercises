package Programs.BasicPrograms;

// Let's see the factorial program in java using recursion.

public class FactorialUsingRecursion {
    static int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        int fact;

        int n = 5;

        fact = factorial(n);

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}

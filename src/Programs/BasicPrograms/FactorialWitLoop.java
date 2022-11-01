package Programs.BasicPrograms;

/*
Factorial Program in Java: Factorial of n is the product of all positive descending integers.
4! = 4*3*2*1 = 24
Factorial of n is denoted by n!. For example:
5! = 5*4*3*2*1 = 120
 */

public class FactorialWitLoop {
    public static void main(String[] args) {
        int factorial = 1;

        int number = 5;

        for (int i = 1; i <= number; i++ )
            factorial *= i;

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

package Programs.BasicPrograms;

import java.util.Random;

/*
Random numbers are the numbers that use a large set of numbers and selects a number using the mathematical algorithm.
It satisfies the following two conditions:

    The generated values uniformly distributed over a definite interval.

    It is impossible to guess the future value based on current and past values.
 */
public class GenerateRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        double n = random.nextDouble();

        System.out.println("1s Random Number "+ n);
    }
}

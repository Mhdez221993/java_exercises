package Programs.BasicPrograms;

import java.util.Random;

/*
Random numbers are the numbers that use a large set of numbers and selects a number using the mathematical algorithm.
It satisfies the following two conditions:

    The generated values uniformly distributed over a definite interval.

    It is impossible to guess the future value based on current and past values.
 */
public class GenerateRandomNumber {
    public  static void randomInts(int num, int origin, int bound) {
        Random random = new Random();

        random.ints(num, origin, bound).forEach(i -> System.out.print(i + " "));
    }

    public static void main(String[] args) {
        randomInts(5, 1, 20);
    }
}

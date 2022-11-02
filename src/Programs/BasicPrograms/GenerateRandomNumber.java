package Programs.BasicPrograms;

/*
Random numbers are the numbers that use a large set of numbers and selects a number using the mathematical algorithm.
It satisfies the following two conditions:

    The generated values uniformly distributed over a definite interval.

    It is impossible to guess the future value based on current and past values.
 */
public class GenerateRandomNumber {
    public static void main(String[] args) {
        int min = 5;
        int max = 10;
        int random = (int)(Math.random() * (max - min + 1) + min);

        System.out.println("1s Random Number "+ random);
    }
}

package Programs.BasicPrograms;

/*
In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
The first two numbers of fibonacci series are 0 and 1.
 */

public class FibonacciSeries {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int next;

        System.out.print(first + " " + second);

        for (int i = 2; i < 20; i++) {
            next = first + second;

            first = second;
            second = next;

            System.out.print(" " + next);
        }
    }
}

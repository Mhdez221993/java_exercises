package Programs.BasicPrograms;

public class FibonacciSeriesRecursive {
    static int first = 0;
    static int second = 1;
    static int next;

    static void printFibonacci(int count) {
        if (count > 0) {
            next = first + second;

            first = second;

            second = next;

            System.out.print(" " + next);
            printFibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        int count = 20;

        System.out.print(first + " " + second); //printing 0 and 1

        printFibonacci(count - 2); //n-2 because 2 numbers are already printed
    }
}

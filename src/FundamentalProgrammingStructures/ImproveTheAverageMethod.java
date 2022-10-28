package FundamentalProgrammingStructures;

import java.util.Arrays;
import java.util.Scanner;

/*
Improve the average method so that it is called with at least one
argument.
 */
public class ImproveTheAverageMethod {
    public static void main(String[] args) {
//        double average = sum / count
        Scanner in = new Scanner(System.in);

        String[] array = in.nextLine().trim().split(" ");

        double[] arrOfInt = Arrays.stream(array).mapToDouble(Double::parseDouble).toArray();

        double calculateAverage = average(arrOfInt);

        System.out.println(calculateAverage);
    }

    public static double average(double ...args) {
        double sum = 0;
        int count = 0;

        for(double val: args) {
            sum += val;
            count++;
        }

        double result = sum / count;

        return  result;
    }
}

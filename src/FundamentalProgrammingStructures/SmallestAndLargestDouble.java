package FundamentalProgrammingStructures;

/*
Write a program that prints the smallest and largest positive double
values. Hint: Look up Math.nextUp in the Java API.
 */
public class SmallestAndLargestDouble {
    public static void main(String[] args) {
        double smallest = Math.nextUp(0);

        double largest = Double.MAX_VALUE;

        System.out.println(smallest);

//        System.out.println(Double.longBitsToDouble(0x0010000000000000L));

        System.out.println(largest);
    }
}

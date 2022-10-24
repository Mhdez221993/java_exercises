package FundamentalProgrammingStructures;

/*
What happens when you cast a double to an int that is larger than the
largest possible int value? Try it out.
 */
public class CastDoubleToInt {
    public static void main(String[] args) {
        double n = 4294967292.50;

        int doubleToInt = (int) n;

        System.out.println(doubleToInt);
    }
}

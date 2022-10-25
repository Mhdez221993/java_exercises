package FundamentalProgrammingStructures;

import java.util.Random;
import java.util.UUID;

/*
Write a program that produces a random string of letters and digits by
generating a random long value and printing it in base 36.
 */
public class RandomLetterDigitsBase36 {
    public static void main(String[] args) {
        Random generator = new Random();
        long l = generator.nextLong() * 1;
        String base36 = Long.toString(l, 36);
        System.out.println(base36);
    }
}

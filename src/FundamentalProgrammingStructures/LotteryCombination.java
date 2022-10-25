package FundamentalProgrammingStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
Write a program that prints a lottery combination, picking six distinct
numbers between 1 and 49. To pick six distinct numbers, start with an
array list filled with 1...49. Pick a random index and remove the
element. Repeat six times. Print the result in sorted order.
 */
public class LotteryCombination {
    public static void main(String[] args) {
        ArrayList<Integer> options = new ArrayList<>();

        for(int i = 1; i <= 49; i++) options.add(i);

        Random generator = new Random();

        int[] combination = new int[6];

        for(int i = 0; i < 6; i++) {
            int index = generator.nextInt(49);

            combination[i] = options.get(index);
            options.remove(index);
        }

        Arrays.sort(combination);

        System.out.println(Arrays.toString(combination));
    }
}

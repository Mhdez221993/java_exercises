package FundamentalProgrammingStructures;

// A year is leap, if it is divisible by 4 and 400. But, not by 100

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Java program to verify if it is a leap year, please introduce a years");

        int year = in.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Common Year");
    }
}

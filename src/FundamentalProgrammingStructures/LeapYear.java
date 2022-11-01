package FundamentalProgrammingStructures;

// A year is leap, if it is divisible by 4 and 400. But, not by 100

public class LeapYear {
    public static void main(String[] args) {
        int year = 20220;

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Common Year");
    }
}

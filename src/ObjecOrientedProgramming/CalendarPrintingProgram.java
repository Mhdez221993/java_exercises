package ObjecOrientedProgramming;

/*
Change the calendar printing program so it starts the week on a Sunday.
Also make it print a newline at the end (but only one).
 */

import java.time.LocalDate;

public class CalendarPrintingProgram {

    public static void main(String[] args) {
        final int DAYS_PER_WEEK = 7;

        enum Weekday { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  };

        Weekday startDay = Weekday.SUNDAY;

        System.out.println(startDay);
    }
}

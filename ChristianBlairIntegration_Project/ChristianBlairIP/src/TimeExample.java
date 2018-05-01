
// Christian Blair
// Using Java.time classes provided, The current local date and time are able 
// to be printed! 

import java.time.*;

public class TimeExample {
    private static void dateTimes() {
        // dates, e.g. 2014-02-18

        // the current date
        LocalDate currentDate = LocalDate.now();

        // 2014-02-10
        LocalDate tenthFeb2014 = LocalDate.of(2014, Month.FEBRUARY, 10);

        // months values start at 1 (2014-08-01)
        LocalDate firstAug2014 = LocalDate.of(2014, 8, 1);

        // the 65th day of 2010 (2010-03-06)
        LocalDate sixtyFifthDayOf2010 = LocalDate.ofYearDay(2010, 65);

        // times, e.g. 19:12:30.733

        LocalTime currentTime = LocalTime.now(); // current time
        LocalTime midday = LocalTime.of(12, 0); // 12:00
        LocalTime afterMidday = LocalTime.of(13, 30, 15); // 13:30:15

        // 12345th second of day (03:25:45)
        LocalTime fromSecondsOfDay = LocalTime.ofSecondOfDay(12345);

        // dates with times, e.g. 2014-02-18T19:08:37.950
        LocalDateTime currentDateTime = LocalDateTime.now();

        // 2014-10-02 12:30
        LocalDateTime secondAug2014 = LocalDateTime.of(2014, 10, 2, 12, 30);

        // 2014-12-24 12:00
        LocalDateTime christmas2014 = LocalDateTime.of(2014, Month.DECEMBER, 24,
                12, 0);

        // By default LocalDate and LocalTime will use the system clock in the
        // default time zone
        // We can change this by providing a timezone or an alternative clock
        // implementation

        // current (local) time in Los Angeles
        LocalTime currentTimeInLosAngeles = LocalTime
                .now(ZoneId.of("America/Los_Angeles"));

        // current time in UTC time zone
        LocalTime nowInUtc = LocalTime.now(Clock.systemUTC());

        System.out.println("date/time creation: currentDate: " + currentDate);
        /*
         * System.out.println("date/time creation: tenthFeb2014: " +
         * tenthFeb2014);
         * System.out.println("date/time creation: firstAug2014: " +
         * firstAug2014);
         * System.out.println("date/time creation: sixtyFifthDayOf2010: " +
         * sixtyFifthDayOf2010);
         */
        System.out.println("date/time creation: currentTime: " + currentTime);
        /*
         * System.out.println("date/time creation: midday: " + midday);
         * System.out.println("date/time creation: afterMidday: " +
         * afterMidday);
         * System.out.println("date/time creation: fromSecondsOfDay: " +
         * fromSecondsOfDay);
         * System.out.println("date/time creation: currentTimeInLosAngeles: " +
         * currentTimeInLosAngeles);
         * System.out.println("date/time creation: currentDateTime: " +
         * currentDateTime);
         * System.out.println("date/time creation: secondAug2014: " +
         * secondAug2014);
         * System.out.println("date/time creation: christmas2014: " +
         * christmas2014);
         */
    }

    public static void main(String[] args) {
        dateTimes();
    }
}

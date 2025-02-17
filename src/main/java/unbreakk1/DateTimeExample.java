package unbreakk1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTimeExample
{
    public static void main(String[] args)
    {
        // Step 1:
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Step 2:
        LocalDate dateAfterTwoWeeks = currentDate.plusWeeks(2);
        System.out.println("Date after adding 2 weeks: " + dateAfterTwoWeeks);

        // Step 3:
        LocalDate specifiedFutureDate = LocalDate.of(2023, 12, 25); // Example future date: December 25, 2023

        if (currentDate.isBefore(specifiedFutureDate))
            System.out.println("The current date is before " + specifiedFutureDate);
        else if (currentDate.isAfter(specifiedFutureDate))
            System.out.println("The current date is after " + specifiedFutureDate);
         else
            System.out.println("The current date is equal to " + specifiedFutureDate);

        // Step 4:
        LocalDate arbitraryDate1 = LocalDate.of(2023, 10, 1);
        LocalDate arbitraryDate2 = LocalDate.of(2023, 10, 25);

        long daysBetween = ChronoUnit.DAYS.between(arbitraryDate1, arbitraryDate2);
        System.out.println("The difference in days between " + arbitraryDate1 + " and " + arbitraryDate2 + " is " + daysBetween + " days.");
    }
}

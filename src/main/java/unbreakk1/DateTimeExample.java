package unbreakk1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateTimeExample
{
    private static final String DATE_COMPARISON_PREFIX = "The current date is ";
    private static final LocalDate SPECIFIED_FUTURE_DATE = LocalDate.of(2026, 12, 25);

    public static void main(String[] args)
    {
        // step1:
        LocalDate currentDate = LocalDate.now();
        System.out.println(DATE_COMPARISON_PREFIX + currentDate); // 2025-02-17

        // step2:
        LocalDate dateAfterTwoWeeks = currentDate.plusWeeks(2);
        System.out.println("Date after adding 2 weeks: " + dateAfterTwoWeeks); // 2025-03-03

        // step3:
        compareWithSpecifiedFutureDate(currentDate);

        // step4:
        LocalDate arbitraryDate1 = LocalDate.of(2023, 10, 1);
        LocalDate arbitraryDate2 = LocalDate.of(2023, 10, 25);

        long daysBetween = ChronoUnit.DAYS.between(arbitraryDate1, arbitraryDate2);
        System.out.println("The difference in days between " + arbitraryDate1 + " and " + arbitraryDate2 + " is " + daysBetween + " days.");
    }

    private static void compareWithSpecifiedFutureDate(LocalDate currentDate)
    {
        String result = getComparisonMessage(currentDate);
        System.out.println(result);
    }

    private static String getComparisonMessage(LocalDate currentDate)
    {
        return switch (currentDate.compareTo(DateTimeExample.SPECIFIED_FUTURE_DATE)) {
            case -1 -> DATE_COMPARISON_PREFIX + "before " + DateTimeExample.SPECIFIED_FUTURE_DATE;
            case 1 -> DATE_COMPARISON_PREFIX + "after " + DateTimeExample.SPECIFIED_FUTURE_DATE;
            default -> DATE_COMPARISON_PREFIX + "equal to " + DateTimeExample.SPECIFIED_FUTURE_DATE;
        };
    }
}




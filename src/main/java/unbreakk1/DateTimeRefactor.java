package unbreakk1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateTimeRefactor
{
    private static final LocalDate SPECIFIED_FUTURE_DATE = LocalDate.of(2023, 12, 25);
    private static final LocalDate ARBITRARY_DATE_1 = LocalDate.of(2023, 10, 1);
    private static final LocalDate ARBITRARY_DATE_2 = LocalDate.of(2023, 10, 25);

    public static void main(String[] args)
    {
        printCurrentDate();
        printDateAfterTwoWeeks();
        compareWithSpecifiedFutureDate(LocalDate.now());
        calculateDaysBetweenDates();
    }

    private static void printCurrentDate()
    {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
    }

    private static void printDateAfterTwoWeeks()
    {
        LocalDate dateAfterTwoWeeks = LocalDate.now().plusWeeks(2);
        System.out.println("Date after adding 2 weeks: " + dateAfterTwoWeeks);
    }

    private static void compareWithSpecifiedFutureDate(LocalDate currentDate)
    {
        int comparison = currentDate.compareTo(DateTimeRefactor.SPECIFIED_FUTURE_DATE);
        String result = switch (comparison)
        {
            case -1 -> "The current date is before " + DateTimeRefactor.SPECIFIED_FUTURE_DATE;
            case 1 -> "The current date is after " + DateTimeRefactor.SPECIFIED_FUTURE_DATE;
            default -> "The current date is equal to " + DateTimeRefactor.SPECIFIED_FUTURE_DATE;
        };
        System.out.println(result);
    }

    private static void calculateDaysBetweenDates()
    {
        long daysBetween = ChronoUnit.DAYS.between(DateTimeRefactor.ARBITRARY_DATE_1, DateTimeRefactor.ARBITRARY_DATE_2);
        System.out.println("The difference in days between " + DateTimeRefactor.ARBITRARY_DATE_1 + " and " + DateTimeRefactor.ARBITRARY_DATE_2 + " is " + daysBetween + " days.");
    }

}

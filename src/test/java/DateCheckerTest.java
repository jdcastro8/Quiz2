import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateCheckerTest {

    @Test
    public void testJanuaryHas31Days() {
        DateChecker checker = new DateChecker();
        assertTrue(checker.has31Days(Month.JANUARY),
                "January should have 31 days");
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {
            "JANUARY",
            "MARCH",
            "MAY",
            "JULY",
            "AUGUST",
            "OCTOBER",
            "DECEMBER"
    })
    public void testMonthsWith31Days(Month month) {
        DateChecker checker = new DateChecker();
        assertTrue(checker.has31Days(month),
                month + " should have 31 days");
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {
            "APRIL",
            "JUNE",
            "SEPTEMBER",
            "NOVEMBER"
    })
    public void testMonthsWith30Days(Month month) {
        DateChecker checker = new DateChecker();
        assertFalse(checker.has31Days(month),
                month + " should not have 31 days");
    }

    @Test
    public void testFebruaryDoesNotHave31Days() {
        DateChecker checker = new DateChecker();
        assertFalse(checker.has31Days(Month.FEBRUARY),
                "February should not have 31 days");
    }

    @Test
    public void testNullMonthThrowsException() {
        DateChecker checker = new DateChecker();

        assertThrows(IllegalArgumentException.class, () -> {
            checker.has31Days(null);
        }, "A null month should throw an IllegalArgumentException");
    }

    @ParameterizedTest
    @EnumSource(Month.class)
    public void testAllMonths(Month month) {
        DateChecker checker = new DateChecker();

        boolean expected = switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> true;
            case FEBRUARY, APRIL, JUNE, SEPTEMBER, NOVEMBER -> false;
        };

        assertEquals(expected, checker.has31Days(month),
                "Incorrect result for " + month);
    }

}
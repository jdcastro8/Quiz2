import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateCheckerTest {

    @Test
    public void testJanuaryHas31Days() {
        DateChecker checker = new DateChecker();
        assertTrue(checker.has31Days(Month.JANUARY));
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
        assertTrue(checker.has31Days(month));
    }

}
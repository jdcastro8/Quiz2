public class DateChecker {

    public boolean has31Days(Month month) {
        if (month == null) {
            throw new IllegalArgumentException("Month cannot be null");
        }

        return switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> true;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> false;
            case FEBRUARY -> false;
        };
    }

}
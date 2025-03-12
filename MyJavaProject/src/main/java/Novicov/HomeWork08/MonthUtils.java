package Novicov.HomeWork08;

public final class MonthUtils {
    public static final Month JANUARY = new Month("January", 31, 22);
    public static final Month FEBRUARY = new Month("February", 28, 20);
    public static final Month MARCH = new Month("March", 31, 22);
    public static final Month APRIL = new Month("April", 30, 21);
    public static final Month MAY = new Month("May", 31, 22);
    public static final Month JUNE = new Month("June", 30, 21);
    public static final Month JULY = new Month("July", 31, 22);
    public static final Month AUGUST = new Month("August", 31, 22);
    public static final Month SEPTEMBER = new Month("September", 30, 21);
    public static final Month OCTOBER = new Month("October", 31, 22);
    public static final Month NOVEMBER = new Month("November", 30, 21);
    public static final Month DECEMBER = new Month("December", 31, 22);

    public static final Month[] ALL_MONTHS = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    public static Month[] getQuarter(int quarter) {
        return switch (quarter) {
            case 1 -> new Month[]{JANUARY, FEBRUARY, MARCH};
            case 2 -> new Month[]{APRIL, MAY, JUNE};
            case 3 -> new Month[]{JULY, AUGUST, SEPTEMBER};
            case 4 -> new Month[]{OCTOBER, NOVEMBER, DECEMBER};
            default -> throw new IllegalArgumentException("Invalid quarter: " + quarter);
        };
    }

    public static Month[] getFirstHalfYear() {
        return new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE};
    }

    public static Month[] getSecondHalfYear() {
        return new Month[]{JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    }

    public static Month[] getYear() {
        return ALL_MONTHS.clone();
    }
}

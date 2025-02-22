package Novicov.HomeWork08;

public class MonthUtils {
    public static final Month JANUARY = new Month("January", 31, 22);
    public static final Month FEBRUARY = new Month("February", 28, 20);
    public static final Month MARCH = new Month("March", 31, 22);
    public static final Month APRIL = new Month("April", 30, 21);
    public static final Month MAY = new Month("May", 31, 21);
    public static final Month JUNE = new Month("June", 30, 22);
    public static final Month JULY = new Month("July", 31, 23);
    public static final Month AUGUST = new Month("August", 31, 23);
    public static final Month SEPTEMBER = new Month("September", 30, 22);
    public static final Month OCTOBER = new Month("October", 31, 22);
    public static final Month NOVEMBER = new Month("November", 30, 21);
    public static final Month DECEMBER = new Month("December", 31, 22);

    public static final Month[] YEAR = {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
            JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    };

    public static Month[] getAllMonths() {
        return YEAR.clone();
    }
}
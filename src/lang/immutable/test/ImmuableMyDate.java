package lang.immutable.test;

public class ImmuableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmuableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public ImmuableMyDate withYear(int newYear){
        return new ImmuableMyDate(newYear,month,day);
    }


    public ImmuableMyDate withMonth(int newmonth) {
        return new ImmuableMyDate(year,newmonth,day);
    }

    public ImmuableMyDate withDay(int newday) {
        return new ImmuableMyDate(year,month,newday);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

}
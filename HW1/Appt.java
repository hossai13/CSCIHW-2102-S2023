package HW1;

public class Appt {
    private int day;
    private int month;
    private int year;
    private String desc;

    public Appt(int day, int month, int year, String desc) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.desc = desc;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDesc() {
        return desc;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean occursOn(int day, int month, int year) {
        if (day == this.getDay() && month == this.getMonth() && year == this.getYear()) {
            return true;
        } else {
            return false;
        }
    }
}

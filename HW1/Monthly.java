package HW1;

public class Monthly extends Appt {
    public Monthly(int day, int month, int year, String desc) {
        super(day, month, year, desc);
    }

    public boolean occursOn(int day, int month, int year) {
        if (this.getMonth() == month) {
            return true;
        } else {
            return false;
        }
    }
    
}
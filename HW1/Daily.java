package HW1;

public class Daily extends Appt{
    public Daily(int day, int month, int year, String desc) {
        super(day, month, year, desc);
    }
    
    public boolean occursOn(int day, int month, int year){
        if (this.getMonth() == month && this.getYear() == year){
            return true;
        }
        else{
            return false;
        }
    }
}
    


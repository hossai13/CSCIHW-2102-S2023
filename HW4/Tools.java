package HW4;
import java.util.Random;

public class Tools {
    //random number generator (1-9) for L1
    public static int randomNum() {
        Random rand = new Random();
        int num = rand.nextInt(10);
        return num;
    }
}


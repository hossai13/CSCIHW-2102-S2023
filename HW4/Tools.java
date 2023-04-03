package HW4;
import java.util.Random;

public class Tools {
    public static int randomNum() {
        Random rand = new Random();
        int num = rand.nextInt(9) + 1;
        return num;
    }
}


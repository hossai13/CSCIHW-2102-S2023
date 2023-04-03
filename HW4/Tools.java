package HW4;
import java.util.Random;

public class Tools {
    public static int score1;
    public static int score2;
    public static int score3;


    public static int randomNum() {
        Random rand = new Random();
        int num = rand.nextInt(9) + 1;
        return num;
    }

}


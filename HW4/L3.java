package HW4;
import java.util.Scanner;

public class L3 extends Tools{
    public L3 (){
        System.out.println("\nLEVEL 3:");
        int attempt = 0;
    
        Scanner input = new Scanner(System.in);
    
        int num1 = Tools.randomNum();
        int num2 = Tools.randomNum();
        int answer = num1 - num2;
    
        if (answer >= 0) {
            System.out.println("Q: " + num1 + " - " + num2 + " = ?");
        }
        else if (answer < 0) {
            num1 = Tools.randomNum();
            num2 = Tools.randomNum();
            answer = num1 - num2;
            attempt = 0;
        }

        int response = input.nextInt();
        if (response == answer){
            score3++;
            attempt = 0;
            if (score3 < 5){
                for (int i = 0; i < 5; i++){
                    i = score3; 
                    num1 = Tools.randomNum();
                    num2 = Tools.randomNum();
                    answer = num1 - num2;
                    if (answer >= 0){
                        System.out.println("\nQ: " + num1 + " - " + num2 + " = ?");
                        response = input.nextInt();
                        if (response == answer){
                            score3++;
                            attempt = 0;
                        }
                        else {
                            System.out.println("TRY AGAIN!");
                            attempt++;
                            if (attempt < 2){
                                System.out.println("ATTEMPT: " + attempt + "\nQ: " + num1 + " - " + num2 + " = ?");
                                response = input.nextInt();
                                if (response == answer) {
                                    score3++;
                                    attempt = 0;
                                    System.out.println("GOOD JOB!");
                                }
                                else{
                                    System.out.println("\nATTEMPT: 2/2 \nGAME OVER!");
                                    attempt++;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            System.out.println("TRY AGAIN!");
            attempt++;
            if (attempt < 2){
                System.out.println("ATTEMPT: " + attempt + "\nQ: " + num1 + " - " + num2 + " = ?");
                response = input.nextInt();
                if (response == answer) {
                    score3++;
                    attempt = 0;
                    System.out.println("GOOD JOB!");
                }
                else{
                    if (answer >= 0) {
                        System.out.println("Q: " + num1 + " - " + num2 + " = ?");
                    }
                    else if (answer < 0) {
                        num1 = Tools.randomNum();
                        num2 = Tools.randomNum();
                        answer = num1 - num2;
                        attempt = 0;
                    }
                    attempt++;
                    System.out.println("ATTEMPT: 2/2 \n\nGAME OVER!");
                    int score = score1 + score2 + score3;
                    System.out.println("FINAL SCORE: " + score);
                    System.out.println("End of Math Games");
                    System.exit(0);
                }
            }
        }
    }
}  
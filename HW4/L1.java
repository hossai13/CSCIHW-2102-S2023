package HW4;
import java.util.Scanner;

public class L1 extends Tools {
    public L1 () {
        System.out.println("\nLEVEL 1:");
        int score = 0;
        int attempt = 0;
    
        Scanner input = new Scanner(System.in);
    
        int num1 = Tools.randomNum();
        int num2 = Tools.randomNum();
        int answer = num1 + num2;
    
        if (answer < 10) {
            System.out.println("Q: " + num1 + " + " + num2 + " = ?");
        }
        else if (answer >= 10){
            num1 = Tools.randomNum();
            num2 = Tools.randomNum();
            answer = num1 + num2;
            attempt = 0;
        }
    
        int response = input.nextInt();
        if (response == answer){
            score++;
            attempt = 0;
            if (score < 5){
                for (int i = 0; i < 5; i++){
                    i = score; 
                    num1 = Tools.randomNum();
                    num2 = Tools.randomNum();
                    answer = num1 + num2;
                    if (answer < 10){
                        System.out.println("\nQ: " + num1 + " + " + num2 + " = ?");
                        response = input.nextInt();
                        if (response == answer){
                            score++;
                            attempt = 0;
                        }
                        else {
                            System.out.println("TRY AGAIN!");
                            attempt++;
                            if (attempt < 2){
                                System.out.println("ATTEMPT: " + attempt + "\nQ: " + num1 + " + " + num2 + " = ?");
                                response = input.nextInt();
                                if (response == answer) {
                                    score++;
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
    }
}      
                   
               
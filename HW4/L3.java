package HW4;
import java.util.Scanner;

public class L3 extends Tools{
    public L3 (){
        System.err.println("Start Level 3");
        int score = 0;

        int num1 = Tools.randomNum();
        int num2 = Tools.randomNum();
        int answer = num1 - num2;

        Scanner input = new Scanner(System.in);
        int response = input.nextInt();
        int attempt = 0;

        if (answer >= 0) {
            System.out.println("What is " + num1 + " - " + num2 + "?");
        }
        if (response == answer) {
            score++;
            attempt = 0;
            if (score < 5) 
            {
                num1 = Tools.randomNum();
                num2 = Tools.randomNum();
                answer = num1 - num2;
                System.out.println("What is " + num1 + " - " + num2 + "?");
            } 

        } else {
            System.out.println("WRONG!");
            attempt++;
            if (attempt < 2) {
                System.out.println("What is " + num1 + " - " + num2 + "?");
            } else {
                System.out.println("END GAME");
            }
        }
    }
    //2. Display "welcome to level 3"
           //score = 0
           
	//3. num1 = random number generator (1-9)
	//4. num2 = random number generator (1-9)
	//5. answer = num1 - num2
	//6. Check is answer >= 0? Yes or No
		//7-1. if yes, Display question 
           	    // example: what is num1+num2?
		    // 8. response = student's answer
		    // 9  if(response == answer)?
		   	//10. if yes, score++, attempt =0
				//if (score < 5)
					//repeat 3 to 9
				//else
				  // 	end game	
		      //	11. if no: 
				//display wrong 
				//attempt++ 
			//	if (attempt < 2)
                        	//	repeat 7-1 to 9	     	
                               // else
					//end game
                //7-2. if no, repeat step 3 to 6
}

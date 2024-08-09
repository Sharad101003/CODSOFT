import java.util.Scanner;

public class NumberGuessGame {
    static int score = 0;
    public static void numberGame(){ 
        //random number
        double temp = Math.random();
        int randomNumber = (int)(temp*(100-1)+1);    
        
        int k=5;    //fixed 5 chances or max attempts
        int userNumber,choice=0;

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<k;i++){
            System.out.println("Enter the " + (i+1) + " attempt");
            userNumber = sc.nextInt();
            
            if(userNumber == randomNumber){
                System.out.println("Congratulation! You Guessed the Number");
                score++;
            }
            else if(userNumber < randomNumber && k != 4){    //4 -> for maxAttempt 0-4
                System.out.println("The Guess Number is less than random number");
            }
            else if(userNumber > randomNumber && k != 4){    //4 -> for maxAttempt 0-4
                System.out.println("The Guess Number is greater than random number");
            } 

            if(i == 4){
                System.out.println("You lose");
                System.out.println("The Random Number is " + randomNumber);
            }
            if(i == 4 || userNumber == randomNumber){
                System.out.println("Do you want to continue?");
                System.out.println("Press 1 for yes\nPress 0 for no");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        numberGame();
                        break;
                    case 0:
                        System.out.println("GAME IS OVER");
                        System.out.println("Your Score : " + score);
                        break;
                    default :
                        System.out.println("Invalid output");
                        break;
                }
                break;
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        System.out.println("WELCOME");
        System.out.println("This is Number Guessing Game");
        System.out.println("You have 5 chance to Guess Number between 1 to 100");
        numberGame();
    }
}

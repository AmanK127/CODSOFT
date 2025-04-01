import java.util.*;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Number Game.");
        System.out.print("Rules: \n" +
                "1:The game has 5 rounds.\n" +
                "2:The player has to guess the number between 0 to 9 both inclusive.\n" +
                "3:If the guess matches the computer generated number you win.\n" +
                "4:Each win gives you 1 point.\n\n" +
                "Let's Begin:\n\n");

        int rounds = 1;
        int totalScore = 0;

        while(rounds<=5){
            System.out.println("Round "+rounds+":\n");
            System.out.print("Enter your guess: ");
            int num = sc.nextInt();
            int comp = random();
            System.out.println("Your Choice: "+num+"\t\t Computer's Choice: "+comp);
            if(num==comp){
                totalScore++;
                System.out.println("Congrats! You win this round.");
                System.out.println("Your Score: +1");
            }
            else{
                System.out.println("Sorry! Better luck next time.");
                System.out.println("Your Points: +0");
            }
            System.out.println();

            rounds++;
        }

        System.out.println("Total Score: "+totalScore);
    }

    public static int random(){
        Random obj = new Random();
        return obj.nextInt(10);

    }
}

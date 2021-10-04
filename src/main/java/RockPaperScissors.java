import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rn = new Random();
        int rounds = 0;
        Boolean play = true;
        Boolean valid = false;

        while (!valid) {
            System.out.println("How many rounds would you like to play? (Max. 10): ");
            if (input.hasNextInt()) {
                rounds = input.nextInt();
                input.nextLine();
                if ((rounds > 10) || (rounds < 1)) {
                    System.out.println("Error: Input out of range. Try again.");
                    System.out.println("");
                } else {
                    valid = true;
                }
            } else {
                System.out.println("Error: Invalid input. Try again.");
                input.nextLine();
            }
        }

        while (play){
            int wins = 0;
            int ties = 0;
            int loss = 0;

            for (int i=1; i<=rounds; i++){
                System.out.println("Round "+i+"!!!");

                int choice=0;
                valid = false;
                while (!valid) {
                    System.out.println("Make your choice: Rock (1), Paper (2) or Scissors (3)?");
                    if (input.hasNextInt()) {
                        choice = input.nextInt();
                        input.nextLine();
                        if ((choice > 3) || (choice < 1)) {
                            System.out.println("Error: Input out of range. Try again.");
                            System.out.println("");
                        } else {
                            valid = true;
                        }
                    } else {
                        System.out.println("Error: Invalid input. Try again.");
                        input.nextLine();
                    }
                }

                int comp = rn.nextInt(3)+1;
                if (choice==1&&comp==2 || choice==2&&comp==3 || choice==3&&comp==1){
                    System.out.println("You lose!");
                    loss++;
                } else if(choice==comp){
                    System.out.println("It's a tie!");
                    ties++;
                } else{
                    System.out.println("You win!");
                    wins++;
                }
            }

            System.out.println("Number of ties: "+ties);
            System.out.println("Number of wins: "+wins);
            System.out.println("Number of losses: "+loss);

            if (wins > loss){
                System.out.println("Congratulations! You are the winner!");
            } else if(wins < loss){
                System.out.println("Bad luck! You are the loser!");
            } else{
                System.out.println("It's a tie! We both won! Or both lost...");
            }

            Boolean askPlay = true;
            while (askPlay){
                System.out.println("Would you like to play again? (y/n)");
                String playAgain = input.nextLine();
                if (playAgain.equals("y")){
                    play = true;
                    askPlay = false;
                } else if (playAgain.equals("n")){
                    System.out.println("Thanks for playing!");
                    System.exit(0);
                } else{
                    System.out.println("Error: Invalid input. Try again.");
                }
            }

        }

    }

}

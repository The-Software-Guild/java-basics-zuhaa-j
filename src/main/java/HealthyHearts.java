import java.util.Scanner;
import java.math.*;

public class HealthyHearts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age=0;

        Boolean valid = false;
        while (!valid){
            System.out.println("What is your age?");
            if (input.hasNextInt()){
                age = input.nextInt();
                input.nextLine();
                valid = true;
            } else{
                System.out.println("Error: Invalid input. Try again.");
                input.nextLine();
            }
        }


        int maxHeart = 220 - age;
        double targetLow = 0.5*maxHeart;
        double targetHigh = 0.85*maxHeart;

        System.out.println("Your maximum heart rate should be "+maxHeart+" beats per minute.");
        System.out.println("Your target HR Zone is "+Math.round(targetLow)+" - "+Math.round(targetHigh)
        +" beats per minute.");

    }

}

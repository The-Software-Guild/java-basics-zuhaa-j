import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {
        Random rn = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("What is your dog's name? ");
        String name = input.nextLine();

        System.out.println("Well then I have this highly reliable report on "
        +name+"'s prestigious background right here.");
        System.out.println(" ");
        System.out.println(name+" is:");

        int a=0,b=0,c=0,d=0,e=0;
        Boolean notComplete = true;
        while (notComplete){
            a = rn.nextInt(101);
            b = rn.nextInt(101);
            c = rn.nextInt(101);
            d = rn.nextInt(101);
            e = rn.nextInt(101);

            if ((a+b+c+d+e)==100){
                notComplete = false;
            }
        }

        System.out.println(a+"% Labrador");
        System.out.println(b+"% Beagle");
        System.out.println(c+"% Golden Retriever");
        System.out.println(d+"% Dalmatian");
        System.out.println(e+"% Pomeranian");
        System.out.println(" ");
        System.out.println("Wow, that's QUITE the dog!");
    }

}

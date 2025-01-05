
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many random numbers should be printed? ");

        int times = Integer.parseInt(scanner.nextLine());

         Random randy = new Random(); // create Random object 

        for (int i = 0; i < times; i++) {
            // Draw and print a random number
            int randomNumber = randy.nextInt(11); // to include 10
            System.out.println(randomNumber);
        }


    }

}

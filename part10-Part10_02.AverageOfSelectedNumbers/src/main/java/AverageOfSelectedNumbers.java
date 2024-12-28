
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        boolean t =  true;
        double avgP;
        double avgN;
        
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while(t){
  
            String input = scanner.nextLine();

            if (input.equals("end")){
                t = false;
                break;
            } 

            list.add(input);

        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");


        String input = scanner.nextLine();

            if (input.equals("p")){
                avgP = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();

                System.out.println("Average of the positive numbers: " + avgP);

            } 

            if (input.equals("n")){
                avgN = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number <= 0)
                .average()
                .getAsDouble();

                System.out.println("Average of the negative numbers: " + avgN);

            } 
    }
}
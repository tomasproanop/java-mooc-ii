
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        boolean t =  true;
        double avg;
        

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

        avg = list.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();
        
        System.out.println("average of the numbers: " + avg);
    }

}
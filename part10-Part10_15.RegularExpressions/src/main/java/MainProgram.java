import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise

        Checker ch = new Checker();

        Scanner scanner = new Scanner(System.in);
   
        System.out.println("Enter a string: ");

        String input = scanner.nextLine();

        if (ch.isDayOfWeek(input)){
           System.out.println("The form is correct."); 
        } else {
            System.out.println("The form is incorrect."); 
        }

        if (ch.allVowels(input)){
            System.out.println("The form is correct."); 
         } else {
             System.out.println("The form is incorrect."); 
         }

         if (ch.timeOfDay(input)){
            System.out.println("The form is correct."); 
         } else {
             System.out.println("The form is incorrect."); 
         }



    }
}

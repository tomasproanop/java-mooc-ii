
import java.util.Scanner;

// Write a program that asks user for input until the user inputs 0. 
// After this, the program prints the average of the positive numbers 
// (numbers that are greater than zero).
// If no positive number is inputted, the program prints 
// "Cannot calculate the average"

// Below a few examples of the program's output
// Sample output

// 3
// 5
// 1
// -3
// 0
// 3.0

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {

        int positiveCounter = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            int input = scanner.nextInt();

            if (input == 0){
                
                break;
            }

            if(input > 0){
                positiveCounter++;
                sum = sum + input;
            }
        
        }

        if (sum <= 0){
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double)sum / (double)positiveCounter;
            System.out.println(average);
        }
    }
}

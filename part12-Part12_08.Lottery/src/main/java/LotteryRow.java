
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful

        Random randy = new Random(); // create Random object 


        for (int i = 0; i < 7; i++) {
            // Draw and print a random number
            int randomNumber = randy.nextInt(40) + 1; // from 1 to 40
            //System.out.println(randomNumber);
            if (numbers.contains(randomNumber)){
                i--;
            } else {
                numbers.add(randomNumber);
            }
        }


    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        boolean boolNumb = numbers.contains(number);
        return boolNumb;
    }
}



import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean t = true;
        ArrayList<Integer> list = new ArrayList();
  
        while(t) {
           int number = Integer.parseInt(scanner.nextLine());
           if (number < 0) {
              t = false;
              break;
           }
  
           list.add(number);
        }
  
        ArrayList<Integer> numbers  = list.stream()
        .filter(numb -> numb >= 1 
                        && numb <= 5)
        .collect(Collectors.toCollection(ArrayList::new));

        numbers.forEach(s -> System.out.println(s)); 
     }
}


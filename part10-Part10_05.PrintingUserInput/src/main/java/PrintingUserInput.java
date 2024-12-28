
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] var0) {
        Scanner scanner = new Scanner(System.in);
        boolean t = true;
        ArrayList list = new ArrayList();
  
        while(t) {
           String string = scanner.nextLine();
           if (string.equals("")) {
              t = false;
              break;
           }
  
           list.add(string);
        }
  
        list.forEach(s -> System.out.println(s)); 
    }
}
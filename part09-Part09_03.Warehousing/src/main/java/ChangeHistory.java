
import java.util.ArrayList;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class ChangeHistory {

    //The storing of the change history could of course have been done using 
    // an ArrayList<Double> object in the class ProductWarehouse,
    // however, we want our own specialized tool for this purpose. 
    // The tool should be implemented by encapsulating the ArrayList<Double> object.

    private ArrayList<Double> list;
//Public constructors and methods of the ChangeHistory class:

    public ChangeHistory() {
        list = new ArrayList<>();

    }//creates an empty ChangeHistory object.

    public void add(double status) {
        list.add(status);
    }
    //adds provided status as the latest amount to remember in the change history.

    public void clear(){
        //for (Double status : list){
            list.clear();
        //}
    } //empties the history.

    public String toString() {
        return list.toString();
    } //returns the string representation of the change history. 
    //The string representation provided by the ArrayList class is sufficient.


    public double maxValue() {

        if(list.isEmpty()){
            return 0;
        }
        return max(list);
    }//returns the largest value in the change history. If the history is empty, the method should return zero.

    public double minValue() {


        if(list.isEmpty()){
            return 0;
        }
        return min(list);

    }//returns the smallest value in the change history. If the history is empty, the method should return zero.

    public double average() {

        if(list.isEmpty()){
            return 0;
        }

        int counter = 0;
        double sum = 0;

        for (Double elem : list){
            counter++;
            sum = sum + elem; 
        }

        double avg = sum / (double) counter;
        return avg;
    
    }//returns the average of the values in the change history. If the history is empty, the method should return zero.

    
}

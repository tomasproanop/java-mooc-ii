
import java.util.HashMap;


public class IOU {
    private HashMap<String, Double> hm;

    public IOU(){
        this.hm = new HashMap<>();
    }

    public void setSum(String toWhom, double amount)  {
        hm.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        // TODO Auto-generated method stub
        //The getOrDefault method of the HashMap searches for the key passed to it as a parameter from the HashMap. 

        return hm.getOrDefault(toWhom, 0.0);
    }

}

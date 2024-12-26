
import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> itemsList;
    private double capacity;

    public Box(double capacity){
        this.itemsList = new ArrayList<>();
        this.capacity = capacity;

    }
    @Override
    public double weight() {
        double sumWeight = 0;
        // calculate the total weight of the items in the box
        for(Packable item : itemsList){
            sumWeight += item.weight();
        }
        return sumWeight;
    }

    public void add(Packable itemToBePacked){
        if(this.weight() + itemToBePacked.weight() <= capacity){
            itemsList.add(itemToBePacked);
        }
    }
    public String toString(){
        return "Box: " + itemsList.size() + " items, total weight " + this.weight() + " kg";
    }

    
}

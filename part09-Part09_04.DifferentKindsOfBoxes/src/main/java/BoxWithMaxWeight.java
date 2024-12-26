import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (currentAmount() + item.getWeight() <= this.capacity){
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

    public int currentAmount() {
        int sum = 0;
        for (Item e : items) {
            sum += e.getWeight();
        }
        return sum;
    }
}

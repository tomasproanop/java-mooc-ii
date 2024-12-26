import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{

    private List<Movable> list;

    public Herd(){
        this.list = new ArrayList<>();

    }

    @Override
    public String toString(){
        String str = "";
        for (Movable movable : list){
            str += movable.toString().trim()  +"\n";
        }
        return str;
    }
    //Returns a string representation of the positions of the members of the herd, each on its own line.

    public void addToHerd(Movable movable){
        list.add(movable);

    }
    //Adds an object that implements the Movable interface to the herd.

    @Override
    public void move(int dx, int dy){
        for (Movable movable : list){
            movable.move(dx, dy);
        }
    }
    //Moves the herd with by the amount specified by the parameters. Notice that here you have to move each member of the herd.
}
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList> hm;

    public StorageFacility(){
        hm = new HashMap<>();
    }

    public void add(String unit, String item) {

        if (!hm.containsKey(unit)){
            hm.put(unit, new ArrayList<String>());
        }

        ArrayList<String> items = hm.get(unit);
        items.add(item);
    }
    //adds the parameter item to the storage unit that 
    //is also given as a parameter.

    public ArrayList<String> contents(String storageUnit) {
        if (!hm.containsKey(storageUnit)){
            return new ArrayList<String>();
        }
        return hm.get(storageUnit);
    }
    //returns a list that contains all the items in 
    //the storage unit indicated by the parameter. 
    // If there is no such storage unit or it contains no items, the method should return an empty list.


    public void remove(String storageUnit, String item) {
        if (!hm.containsKey(storageUnit)){
            return;
        }
        ArrayList<String> items = hm.get(storageUnit);
        items.remove(item);
        if (items.isEmpty()){
            hm.remove(storageUnit);
        }
    }
    //removes the given item from the given storage unit.
    // Only removes one item — if there are several items 
    // with the same name, the rest still remain. 
    // If the storage unit would be empty after the removal, the method also removes the unit.

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : hm.keySet()){
            if (!hm.get(unit).isEmpty()){
                units.add(unit);
            }
        }
        return units;
    }
    //returns the names of the storage units as a list. 
    // NB! Only the units that contain items are listed.


}

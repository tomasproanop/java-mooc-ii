import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry; 


    public VehicleRegistry() {
        registry = new HashMap<>();
    }


    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false; // License plate already exists, addition failed
        } else {
            registry.put(licensePlate, owner);
            return true; // License plate added successfully
        }
    }


    public String get(LicensePlate licensePlate) {
        return this.registry.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    //Add the following methods to the VehicleRegistry:

    public void printLicensePlates(){
        for (LicensePlate licensePlate : this.registry.keySet()) {
            System.out.println(licensePlate);
        }
    }//prints the license plates in the registry.

    public void printOwners() {

        // Create a list to store the owners
        List<String> owners = new ArrayList<>();

        // Iterate over the registry
        for (String owner : this.registry.values()) {
            // If the owner is not in the list, print the owner and add it to the list
            if (!owners.contains(owner)) {
                System.out.println(owner);
                owners.add(owner);
            }
        }

    }//prints the owners of the cars in the registry. Each name should only be printed once, even if a particular person owns more than one car.

//Useful tip! In the printOwners method, you can create a list used for remembering the owners that were already printed. If an owner is not on the list, their name is printed and they are added to the list; conversely, if an owner is on the list, their name isn't printed.
    
}

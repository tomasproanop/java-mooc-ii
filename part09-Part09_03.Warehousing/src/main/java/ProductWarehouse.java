
public class ProductWarehouse extends Warehouse {

    private String productName;

    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.productName= productName;
    }
    // - Creates an empty product warehouse. The name of the product and the capacity of the warehouse are provided as parameters.

    public String getName() {
        return productName;
    }//- Returns the name of the product.


    public void setName(String newName) {
        this.productName = newName;

    }//- sets a new name for the product.

    public String toString(){
        return productName + ": " + super.toString();
    }
    //- Returns the state of the object represented as a string like this Juice: balance = 64.5, space left 123.5



}

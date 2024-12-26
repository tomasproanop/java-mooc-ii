public class Item{
    /**
     * a constructor that creates an item corresponding to the 
     * product given as a parameter. 
     * qty tells us how many of the product are in the item, 
     * while unitPrice is the price of a single product.
     */
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.unitPrice * qty;

    }
    // return the price of the item. You get the items price by multiplying its unit price by its quantity(qty).
    public void increaseQuantity(){
        this.qty++;
    }
    //increases the quantity by one.
    @Override
    public String toString() {
        return this.product + ": " + this.qty;

    }
    //returns the string representation of the item. which must match the format shown in the example below.
}
    
    
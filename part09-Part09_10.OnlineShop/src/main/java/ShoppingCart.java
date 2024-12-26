
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> map;

    public ShoppingCart(){
        map = new HashMap<String,Item>();
    }


    public void add(String product, int price) {

        if(map.keySet().contains(product)){
            increaseQuantity(product);
        } else {
            map.put(product, new Item(product, 1, price));

        }
       
    }
    //adds an item to the cart that matches the product 
    //given as a parameter, with the price given as a parameter.
    public int price() {

        int totalPrice = 0;
        for (Item item: map.values()){
            totalPrice += item.price();
        }

        return totalPrice;
        
    }
    //returns the total price of the shopping cart.


    public void increaseQuantity(String product) {

        this.map.get(product).increaseQuantity();

    }

    public void print(){

        for (String e: map.keySet()){
            System.out.println(map.get(e).toString());
        }

    }
    
}

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;

    public Warehouse(){
        this.priceMap = new HashMap<String, Integer>();
        this.stockMap = new HashMap<String, Integer>();
    }


    public void addProduct(String product, int price, int stock) {
        priceMap.put(product, price);
        stockMap.put(product, stock);
    }

    //, which adds a product to the warehouse with the price and 
    // stock balance given as parameters.
    public int price(String product) {

        
        if(priceMap.containsKey(product)) {
            return priceMap.get(product);
        } else {
            return -99;
        }

        //alternative
        //return prices.getOrDefault(product, -99);
    }
//, which returns the price of the product it received as a parameter.
//  If the product hasn't been added to the warehouse, 
// the method must return -99.


    public int stock(String product) {
        if(stockMap.containsKey(product)) {
            return stockMap.get(product);
        } else {
            return 0;
        }

        //alternative
        //return stockBalanceMap.getOrDefault(product, 0);
    }
    //returns the current remaining stock of the product in the warehouse. If the product hasn't been added to the warehouse, the method must return 0.
    public boolean take(String product) {

        if (this.stock(product) > 0) {

            stockMap.put(product, stockMap.get(product) - 1);

            return true;
        }

        return false;
    }
    //reduces the stock remaining for the product it received as a parameter by one, and returns true if there was stock remaining. If the product was not available in the warehouse the method returns false. A products stock can't go below zero.
    
    public Set<String> products(){
        return priceMap.keySet();
    }
    
}

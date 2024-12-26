public class ProductWarehouseWithHistory extends ProductWarehouse {

    //private double initialBalance;
    private ChangeHistory list = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        list.add(initialBalance);
    }

    public String history() {
        return this.list.toString();
    }

    @Override
    public void addToWarehouse(double amount) {

        double result = 0;        
        result = super.getBalance() + amount;
        list.add(result);
        super.addToWarehouse(amount);
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double result = 0;
        result = super.getBalance() - amount;
        list.add(result);    
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis(){
        
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + list.toString());
        System.out.println("Largest amount of product: " + list.maxValue());
        System.out.println("Smallest amount of product:" + list.minValue());
        System.out.println("Average: " + list.average());
    }
}

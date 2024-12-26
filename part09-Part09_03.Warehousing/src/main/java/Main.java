

public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes

        // Counter counter = new Counter();
        // Counter superCounter = new SuperCounter();
        // int number = 3;
        // number = superCounter.subtractFromNumber(number);
        // number = superCounter.subtractFromNumber(number);
        // number = counter.addToNumber(number);
        // System.out.println(number);

        //1
        // ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        // juice.addToWarehouse(1000.0);
        // juice.takeFromWarehouse(11.3);
        // System.out.println(juice.getName()); // Juice
        // System.out.println(juice);           // balance = 988.7, space left 11.3

        //2
        // ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        // juice.addToWarehouse(1000.0);
        // juice.takeFromWarehouse(11.3);
        // System.out.println(juice.getName()); // Juice
        // juice.addToWarehouse(1.0);
        // System.out.println(juice);           // Juice: balance = 989.7, space left 10.299999999999955

        // 3

        // the usual:
        // ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        // juice.takeFromWarehouse(11.3);
        // System.out.println(juice.getName()); // Juice
        // juice.addToWarehouse(1.0);
        // System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

        // // etc

        // // however, history() still doesn't work properly:
        // System.out.println(juice.history()); // [1000.0]
        // // so we only get the initial state of the history set by the constructor...

        // 4
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        //System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juice.printAnalysis();
    }

}

public class Container {

    private int liters;

    public Container(){
        this.liters = liters;
    }


    public int contains() {
        return this.liters;
    }
    //which returns the amount of liquid in a container as an integer.

    public void add(int amount) {
        if (amount>0){
            if(liters+amount > 100){
                liters = 100;
            } else {
                this.liters = liters + amount;
            }
        }
    }
    //which adds the amount of liquid given as a parameter to the container. If the amount is negative, no liquid is added.

    public void remove(int amount){
        if (amount>0){
            if(liters-amount < 0){
                liters = 0;
            } else {
                this.liters = liters - amount;
            }
        }
    }
    @Override
    public String toString(){
        return liters + "/100"; 

    }
}

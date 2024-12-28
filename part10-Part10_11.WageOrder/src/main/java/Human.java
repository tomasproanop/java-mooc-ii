
public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

    //high to low

    @Override
    public int compareTo(Human humanComp) {
        // TODO Auto-generated method stub
        return humanComp.wage - this.wage;

    }

}

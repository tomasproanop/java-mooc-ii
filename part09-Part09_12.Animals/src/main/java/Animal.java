public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;

    }

    void eat(){
        System.out.println(name + " eats");

    }

    void sleep(){
        System.out.println(name + " sleeps");

    }

    String getName(){
        return name;
    };

    
}

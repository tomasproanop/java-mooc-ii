public class Organism implements Movable{

    private int x;
    private int y;

    public Organism(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // The class constructor that receives the x and y 
    // coordinates of the initial position as its parameters.
    @Override
    public String toString(){
        return "x: " + this.x + "; y: " + this.y;
    }
    // Creates and returns a string representation 
    // of the organism.
    // That representation should remind the following: 
    // "x: 3; y: 6". Notice that a semicolon is used to separate the coordinates.

    @Override
    public void move(int dx, int dy){
        this.x= this.x + dx;
        this.y= this.y + dy;
    }
    //Moves the object by the values it receives as parameters. 
    //The dx variable contains the change to coordinate x, 
    //and the dy variable ontains the change to the coordinate y. 
    //For example, if the value of dx is 5, the value of the object variable x should be incremented by five.

    
}

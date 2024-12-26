public class CD implements Packable{

    private String artist;
    private String name;
    private int releaseYear;
    private double weight;

    public CD(String artist, String name, int releaseYear){
        this.artist = artist;
        this.name = name;
        this.releaseYear = releaseYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString(){
        return artist + ": " + name + " (" + releaseYear + ")";
    }
    
}

public class TripleTacoBox implements TacoBox{

    private int tacos;

    public TripleTacoBox(){
        this.tacos = 3;

    }

    public void eat(){

        if (tacos > 0){
            tacos = tacos-1;
        }
    }

    public int tacosRemaining(){
        return this.tacos;
    }
 
}

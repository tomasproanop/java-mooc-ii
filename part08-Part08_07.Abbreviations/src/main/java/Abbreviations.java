
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> hm;

    public Abbreviations(){
        this.hm = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        hm.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (hm.containsKey(abbreviation)){
            return true;
        } else {
           return false;
        }
    }
    public String findExplanationFor(String abbreviation){
        if(hasAbbreviation(abbreviation)){
            return hm.get(abbreviation);
        } else {
            return null;
        }
    }
}

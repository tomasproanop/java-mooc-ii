
import java.util.HashMap;

public class Program {

    public static void printKeys(HashMap<String, String> hashmap){ 
        // give all keys from hashmap

        // iterate through all keys from hashmap 
        for (String key : hashmap.keySet()){
            // print each key
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text){ 
        // iterate through all keys from hashmap 
        for (String key : hashmap.keySet()){

            // if the key contains the string text, print it
            if (key.contains(cleanString(text))) {
                System.out.println(key);
            }
        }

    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        // iterate through all keys from hashmap 
        for (String key : hashmap.keySet()){

            // if the key contains the string text, print its value!
            if (key.contains(cleanString(text))) {
                System.out.println(hashmap.get(key));
            }
        }

    }

    public static String cleanString(String stringToClean) {

        if (stringToClean == null) {
            return "";
        }

        return stringToClean.toLowerCase().trim();

    }

    

    public static void main(String[] args) {
        // Test your program here!

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

}

package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SaveableDictionary {

    private HashMap<String, String> dict; 
    private String file;

    public SaveableDictionary(){
        this.dict = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this(); //calls first constructor
        this.file = file;

    }

    public boolean load() {

        try {
            Files.lines(Paths.get(this.file))
                    .map(l -> l.split(":"))
                    .forEach(parts -> {
                        this.dict.put(parts[0], parts[1]);
                        this.dict.put(parts[1], parts[0]);
                    });
            return true;

        } catch (IOException ex) {
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(new File(file));
            saveWords(writer);
            writer.close();
        } catch (Exception e) {

            return false;
        }
        return true;
    }

    public void add(String word, String translation){

        if (dict.containsKey(word)) {
            return;
        }

        dict.put(word, translation);
        dict.put(translation, word);

    }

    public String translate(String word) {
        return dict.get(word);
    }

    public void delete(String word) {
        String translation = translate(word);
        dict.remove(word);
        dict.remove(translation);

        // value
                // Iterator<Map.Entry<String, String>> iter = dict.entrySet().iterator();
        // while (iter.hasNext()) {
        //     Map.Entry<String, String> entry = iter.next();
        //     if (entry.getValue().equals(word)) {
        //         iter.remove(); // remove the entry using the iterator
        //     }
        // }

    }


    


    private void saveWords(PrintWriter writer) throws IOException {
        List<String> allreadySaved = new ArrayList<>();
        dict.keySet().stream().forEach(word -> {

            if (allreadySaved.contains(word)) {
                return;
            }

            String compoundString = word + ":" + dict.get(word);
            writer.println(compoundString);
            allreadySaved.add(word);
            allreadySaved.add(dict.get(word));
        });
    }  
}
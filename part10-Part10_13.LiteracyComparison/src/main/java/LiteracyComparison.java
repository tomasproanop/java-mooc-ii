import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {

    //    public static List<Entry> readFile(String file) {

    //     List<Entry> rows = new ArrayList<>();

    //     try {
    //         Files.lines(Paths.get(file))
    //         .map(row -> row.split(","))
    //         .filter(parts -> parts.length >= 5)
    //         .map(parts -> new Entry(parts[0], parts[1], parts[2], parts[3],Double.valueOf(parts[4])))
    //         .forEach(entry -> rows.add(entry));
    //     } catch (Exception e) {
    //         System.out.println("Error: " + e.getMessage());
    //     }
    //     return rows;
    // }


    
    public static void main(String[] args) {

        //readFile("literacy.csv");

        try {
            Files.lines(Paths.get("literacy.csv"))
            .map(row -> row.split(","))
            .filter(parts -> parts.length >= 5)
            // from the lowest to the highest ranked on the literacy rate. 
            .sorted((x, y) -> x[5].compareTo(y[5])) 
            // required format
            .forEach(row -> System.out.println(row[3] + " (" + row[4] + "), " + row[2].split(" ")[1].trim() + ", " + row[5]));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

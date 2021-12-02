import java.io.File;
import java.util.Scanner;

public class StringFinder {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Wrong number of input parameters!");
        } else {
            if (args[0].equals("search")) {
                searchFile(args[1], args[2]);
            } else {
                System.out.println("No valid method used");
            }
        }
    }

    /*
     * print lines where <pattern> is matched in <file>
     * Example: "search cat demo.txt"
     */
    private static void searchFile(String word, String filename) {
        try {
            File file = new File(filename);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String next = reader.nextLine();
                if (next.contains(word)) {
                    System.out.println(next);
                }
            }
            reader.close();
        } catch (Exception E) {
            System.out.println("Error while reading file");
        }
    }

}
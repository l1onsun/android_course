import java.io.*;
import java.util.HashMap;

public class LetterCounter {
    public LetterCounter() {
        letterRate = new HashMap<Character, Integer>();
    }

    public void addFile(String path) {
        try(Reader fileReader = new FileReader(path)) {
            Reader inputStream = new BufferedReader(fileReader);

            char[] input = new char[1];
            while (inputStream.read(input) != -1) {
                char c = input[0];
                if (letterRate.containsKey(c))
                    letterRate.put(c, letterRate.get(c) + 1);
                else
                    letterRate.put(c, 0);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeRate(String path){
        try (Writer fileWriter = new FileWriter(path)) {
            for (HashMap.Entry<Character, Integer> entry : letterRate.entrySet()) {
                fileWriter.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private HashMap<Character, Integer> letterRate;
}

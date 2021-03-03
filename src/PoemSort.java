//Занести стихотворение в список.
// Провести сортировку по возрастанию длин строк.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class PoemSort {

    public static void main(String[] args) {

        List<String> poem = new LinkedList<>();

        try (BufferedReader bufferedReader = new BufferedReader
                (new FileReader("data/Unforgiven"))) {
            String poemLine;
            while ((poemLine = bufferedReader.readLine()) != null) {
                    poem.add("\n" + poemLine);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(poem);

        poem.sort(Comparator.comparing(String::length));
        System.out.println(poem);
    }
}


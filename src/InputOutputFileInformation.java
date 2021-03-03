//Задания из раздела "Additional Unit" являются вспомогательными для курса "Коллекции".
//В процессе изучения разделов курса рекомендуется решить 3-5 задач из списка.
//1. Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.

import java.io.*;
import java.util.*;

public class InputOutputFileInformation {

    public static void main(String[] args) {

        ArrayList<String> infoForReadAndWrite = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader
                (new FileReader("data/InputInformation"))) {
            String lines;
            while (( lines = bufferedReader.readLine()) != null) {
                    infoForReadAndWrite.add("\n" + lines);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(infoForReadAndWrite);

        try (BufferedWriter bufferedWriter = new BufferedWriter
                (new FileWriter("data/InputInformation-reverse"))) {
            Collections.reverse(infoForReadAndWrite);
            for (String reverseLine : infoForReadAndWrite) {
                    bufferedWriter.write(reverseLine);
            }
        } catch (IOException exception) {
                exception.printStackTrace();
        }
    }
}



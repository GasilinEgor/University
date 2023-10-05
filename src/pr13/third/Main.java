package pr13.third;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "D:\\IntelliJ IDEA Community Edition 2022.2.3\\University\\src\\pr13\\third\\test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }
        } catch (IOException e) {
            System.out.println("No");
        }
    }
}

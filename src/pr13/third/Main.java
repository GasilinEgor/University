package pr13.third;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        String fileName = "D:\\IntelliJ IDEA Community Edition 2022.2.3\\University\\src\\pr13\\third\\test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            String[] words = line.split(" "), bestOrder = new String[0], newOrder;
            sort(words);
            for (String word : words) {
                newOrder = order(words, word);
                if (newOrder.length > bestOrder.length) {
                    bestOrder = newOrder;
                }
            }
            for (String word : bestOrder) {
                System.out.println(word);
            }
        } catch (IOException e) {
            System.out.println("No");
        }
    }

    public static void sort(String[] words) {
        String word;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].toLowerCase().compareTo(words[j].toLowerCase()) < 0) {
                    word = words[i];
                    words[i] = words[j];
                    words[j] = word;
                }
            }
        }
    }


    public static String[] order(String[] words, String word) {
        String[] newOrder = new String[0];
        boolean[] isUse = new boolean[words.length];
        isUse[find(words, word)] = true;
        newOrder = add(newOrder, word);
        for (int i = 0; i < words.length; i++) {
            if (!isUse[i]) {
                StringBuilder oldWord = new StringBuilder(word);
                StringBuilder newWord = new StringBuilder(words[i]);
                if (oldWord.substring(oldWord.length() -1 ).toLowerCase().equals(newWord.substring(0, 1).toLowerCase())) {
                    newOrder = add(newOrder, newWord.toString());
                    word = newWord.toString();
                    i = -1;
                }
            }
        }
        return newOrder;
    }


    public static int find(String[] words, String word) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }


    public static String[] add(String[] words, String word) {
        String[] newWords = new String[words.length + 1];
        System.arraycopy(words, 0, newWords, 0, words.length);
        newWords[words.length] = word;
        return newWords;
    }
}

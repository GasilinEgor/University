package pr2;
import java.util.Scanner;

public class HowMamy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        System.out.println(words.length);
    }
}

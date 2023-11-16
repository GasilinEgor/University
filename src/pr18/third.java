package pr18;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer");
        String intString = scanner.next();
        try {
            int i = Integer.parseInt(intString);
                System.out.println(2 / i);
        }
        catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }
}

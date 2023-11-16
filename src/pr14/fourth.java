package pr14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fourth {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\b\\w+@\\w+\\.\\w{1,3}\\b");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество почт: ");
        int count = scanner.nextInt();
        String str = scanner.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите почту: ");
            str = scanner.nextLine();
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

package pr14;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d\\s?\\+");
        System.out.print("Введите количество выражений: ");
        int count = scanner.nextInt();
        String str = scanner.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите выражение: ");
            str = scanner.nextLine();
            int status = 0;
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println("Верно");
                status = 1;
            }
            if (status == 0) {
                System.out.println("Неверно");
            }
        }
    }
}

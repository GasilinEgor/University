package pr14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([1-3]\\d|0[1-9])\\/(0[0-9]|1[0-2])\\/([2-9][0-9]{3}|19[0-9]{2})");
        System.out.print("Введите количество дат: ");
        int count = scanner.nextInt();
        String str = scanner.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите дату: ");
            str = scanner.nextLine();
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.println("Правильно");
            }
            else {
                System.out.println("Неправильно");
            }
        }
    }
}

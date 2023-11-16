package pr14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[0-9a-zA-Z_]{8}[0-9a-zA-Z_]*");
        Pattern pattern1 = Pattern.compile("[A-Z]");
        Pattern pattern2 = Pattern.compile("[a-z]");
        Pattern pattern3 = Pattern.compile("[0-9]");
        System.out.print("Введите пароль: ");
        String str = scanner.nextLine();
        int status = 0;
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            Matcher matcher1 = pattern1.matcher(str);
            while (matcher1.find()) {
                status = 1;
                break;
            }
            if (status == 0) {
                System.out.println("Плохой пароль!");
            }
            else {
                Matcher matcher2 = pattern2.matcher(str);
                while (matcher2.find()) {
                    status = 2;
                    break;
                }
                if (status == 1) {
                    System.out.println("Плохой пароль!");
                }
                else {
                    Matcher matcher3 = pattern3.matcher(str);
                    while (matcher3.find()) {
                        System.out.println("Хороший пароль!");
                        status = 3;
                        break;
                    }
                    if (status == 2) {
                        System.out.println("Плохой пароль!");
                    }
                }
            }
        }
        else {
            System.out.println("Плохой пароль!");
        }
    }
}

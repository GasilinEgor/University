package pr13.second;

import java.lang.StringBuilder;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        StringBuilder phone = new StringBuilder(scanner.next());
        int phoneLen = phone.length();
        System.out.print("Итоговый номер телефона: ");
        if (phone.charAt(0) == '+') {
            System.out.println(phone.substring(0, phoneLen - 10) + phone.substring(phoneLen - 10, phoneLen - 7) + "-" + phone.substring(phoneLen - 7, phoneLen - 4) + "-" + phone.substring(phoneLen - 4, phoneLen));
        }
        else {
            System.out.println("+7" + phone.substring(1, phoneLen - 10) + phone.substring(phoneLen - 10, phoneLen - 7) + "-" + phone.substring(phoneLen - 7, phoneLen - 4) + "-" + phone.substring(phoneLen - 4));
        }
    }
}

package pr19;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws INNException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свой ИНН: ");
        String inn = scanner.next();
        if (isGood(inn)) {
            System.out.println("Все хорошо");
        }
        else {
            throw new INNException("Неправильный ИНН: " + inn);
        }

    }


    public static boolean isGood(String inn) {
        return inn.length() == 10 || inn.length() == 12;
    }
}

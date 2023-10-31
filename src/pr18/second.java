package pr18;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer");
        String intString = scanner.next();
        try {
            int i = Integer.parseInt(intString);
            try {
                System.out.println(2 / i);
            }
            catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Неверный ввод");
        }
    }
}

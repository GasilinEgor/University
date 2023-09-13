package pr1;
import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Введите число");
        number = sc.nextInt();
        System.out.println("Факториал числа равен");
        System.out.print(factorial(number));
    }
    public static int factorial(int number) {
        if (number < 0)
        {
            return -1;
        }
        if (number == 0)
        {
            return 1;
        }
        else {
            return factorial(number - 1) * number;
        }
    }
}

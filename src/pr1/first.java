package pr1;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        double sum = 0;
        arr = new int[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Сумма равна: " + (int)sum);
        System.out.println("Среднее арифмитическое равно " + sum / n);
    }
}

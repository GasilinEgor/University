package pr1;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0, min, max, j = 1;
        min = arr[0];
        max = arr[0];
        while (j < arr.length)
        {
            if (arr[j] > max)
            {
                max = arr[j];
            }
            if (arr[j] < min)
            {
                min = arr[j];
            }
            sum += arr[j];
            j++;
        }
        System.out.println("Максимальный элемент в массиве равен " + max);
        System.out.println("Минимальный элемент в массиве равен " + min);
        System.out.println("Сумма элементов массива равна " + sum);
    }
}

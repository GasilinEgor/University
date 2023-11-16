package pr3.MathRandom;
import java.util.Scanner;
import java.util.Random;

public class Four {
    public static void main(String[] args) {
        int n = input();
        int[] arr = generate(n);
        System.out.println("Первый массив:");
        print(arr);
        int[] arr1 = copy(arr);
        System.out.println("\nВторой массив:");
        print(arr1);

    }


    public static int input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите размер массива: ");
        int n = scanner.nextInt();
        while (n < 1) {
            System.out.println("Введено некорректно значение!");
            System.out.print("введите размер массива: ");
            n = scanner.nextInt();
        }
        return n;
    }


    public static int[] generate(int n) {
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(0, n + 1);
        }
        return arr;
    }


    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static int[] copy(int[] arr) {
        int[] arr1 = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr1 = add(arr1, arr[i]);
            }
        }
        return arr1;
    }


    public static int[] add(int[] arr, int value) {
        int[] arr1 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        arr1[arr.length] = value;
        return arr1;
    }
}

package pr3.MathRandom;
import java.math.*;
import java.util.Random;
import java.util.Scanner;

public class DoubleRandom {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Введен некорректный размер массива!");
        }
        else {
            double[] arr = generate(n);
            sort(arr);
            print(arr);
        }
    }


    public static double[] generate(int n) {
        double[] arr = new double[n];
        Random random = new Random();
        for (int i = 0 ;i < n / 2; i++) {
            arr[i] = Math.random();
        }
        for (int i = n / 2; i < n; i++) {
            arr[i] = random.nextDouble();
        }
        return arr;
    }


    public static void print(double[] arr) {
        System.out.println("Массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void sort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }


    public static void swap(double[] arr, int index1, int index2) {
        double value = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = value;
    }
}

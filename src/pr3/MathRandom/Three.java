package pr3.MathRandom;
import java.util.Random;

public class Three {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 100);
            result.append(arr[i]).append(" ");
        }
        System.out.println(result);
        if (!isStonks(arr)) {
            System.out.println("Последовательность не является возрастающей");
        }
        else {
            System.out.println("Последовательность является возрастающей");
        }
    }


    public static boolean isStonks(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

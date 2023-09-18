package pr2;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = "";
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        for (int i = 0; i < n / 2; i++) {
            s = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = s;
        }
        for (int i = 0 ;i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

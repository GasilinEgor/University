package pr14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class first {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\d+\\s?(USD|RUB|EU))");
        Scanner scanner = new Scanner(System.in);
        String[] costs = new String[0];
        String cost;
        System.out.print("Введите количество цен: ");
        int count = scanner.nextInt();
        for (int i = -1; i < count; i++) {
            cost = scanner.nextLine();
            Matcher matcher = pattern.matcher(cost);
            while (matcher.find()) {
                System.out.println(cost);
            }
        }
    }


    public static String[] add(String[] arr, String line) {
        String[] newArr = new String[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = line;
        return newArr;
    }
}

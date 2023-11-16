package pr11;

import java.util.Date;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущую дату через точку в формате 01.01.1970");
        String string = scanner.next();
        String[] thisDate = string.split("\\.");
        int[] dates = new int[thisDate.length];
        for (int i = 0; i < thisDate.length; i++) {
            dates[i] = Integer.parseInt(thisDate[i]);
        }
        Date date = new Date(dates[2] - 1900, dates[1] - 1, dates[0]);
        Date date1 = new Date();
        long change = (long)(date.getTime() - date1.getTime()) / 3600 / 1000 / 24;
        if (change > 0) {
            System.out.println("Введенная дата больше текущей, разница - " + change);
        }
        else {
            System.out.println("Введенная дата меньше текущей, разница - " + change * -1);
        }
    }
}

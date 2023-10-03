package pr11;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println("Введите год");
        int year = scanner.nextInt();
        System.out.println("Введите месяц цифрой");
        int month = scanner.nextInt();
        System.out.println("Введите число");
        int day = scanner.nextInt();
        System.out.println("Введите количество часов");
        int hour = scanner.nextInt();
        System.out.println("Введите количество минут");
        int minute = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute);
        Date date = new Date(year - 1900, month - 1, day, hour, minute);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        System.out.println(simpleDateFormat.format(date.getTime()));
    }
}

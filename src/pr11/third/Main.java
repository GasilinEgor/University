package pr11.third;

import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd MMMM yyyy, EEEE");
        System.out.println("Введите имя студента");
        String name = scanner.next();
        System.out.println("Введите фамилию студента");
        String surname = scanner.next();
        System.out.println("введите дату рождения студента в формате dd.MM.yyyy");
        String string = scanner.next();
        String[] thisDate = string.split("\\.");
        int[] dates = new int[thisDate.length];
        for (int i = 0; i < thisDate.length; i++) {
            dates[i] = Integer.parseInt(thisDate[i]);
        }
        calendar.set(Calendar.YEAR, dates[2]);
        calendar.set(Calendar.MONTH, dates[1] - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dates[0]);
        Student student = new Student(name, surname, calendar);
        System.out.println("Введите 1, если хотите вывести дату в коротком формате и 2 если в длинном");
        int change = scanner.nextInt();
        if (change == 1) {
            System.out.println(student.toString(sdf));
        }
        else {
            System.out.println(student.toString(sdf1));
        }
    }
}

package pr11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class first {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm:ss");
        System.out.println(date);
        System.out.println("Разработчик: Гасилин Егор\nДата получения задания: 05.09.2023");
        System.out.println("Время получения задания: 16:30:02");
        System.out.println("Дата сдачи задания: " + simpleDateFormat1.format(date));
        System.out.println("Время сдачи задания: " + simpleDateFormat2.format(date));
    }
}

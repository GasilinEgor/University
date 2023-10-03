package pr11.third;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Student {
    private String name;
    private String surname;
    private Calendar date;


    Student(String name, String surname, Calendar date) {
        this.name = name;
        this.surname = surname;
        this.date = date;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public Calendar getDate() {
        return date;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setDate(Calendar date) {
        this.date = date;
    }


    public String toString(SimpleDateFormat sdf) {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + sdf.format(date.getTime()) +
                '}';
    }
}

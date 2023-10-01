package pr10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] iDNumber = new Student[0];
        iDNumber = setArray(iDNumber);
        outArray(iDNumber);
    }


    public static Student[] setArray(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите инфорацию о студенте через пробел: \nФамилия, имя, Специальность, курс, группа, средний балл");
        Student student = new Student(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextDouble());
        Student[] students1 = new Student[students.length + 1];
        System.arraycopy(students, 0, students1, 0, students.length);
        students1[students.length] = student;
        return students1;
    }


    public static void outArray(Student[] students) {
        for (Student student : students) {
            System.out.println("Студент " + student.getSurname() + " " + student.getName());
            System.out.println("Должность: " + student.getSpecialization());
            System.out.println(student.getYear() + " Курс, Группа " + student.getGroup());
            System.out.println("Средний балл: " + student.getMediumScores());
        }
    }


    public static void MergeSort() {}
}

package pr10;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] iDNumber1 = new Student[0], iDNumber2 = new Student[0], iDNumber = new Student[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            iDNumber1 = setArray(iDNumber1);
        }
        for (int i = 0; i < 3; i++) {
            iDNumber2 = setArray(iDNumber2);
        }
        System.out.println("Если хотите отсортировать по среднему баллу, введите 1, если по фамилии - 2");
        int change = scanner.nextInt();
        if (change == 1) {
            MergeSort(iDNumber1, new StudentComparator(1));
            MergeSort(iDNumber2, new StudentComparator(1));
            merge(iDNumber, iDNumber1, iDNumber2, new StudentComparator(1));
        }
        else {
            MergeSort(iDNumber1, new StudentComparator(2));
            MergeSort(iDNumber2, new StudentComparator(2));
            merge(iDNumber, iDNumber1, iDNumber2, new StudentComparator(2));
        }
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
            System.out.println("\nСтудент " + student.getSurname() + " " + student.getName());
            System.out.println("Должность: " + student.getSpecialization());
            System.out.println(student.getYear() + " Курс, Группа " + student.getGroup());
            System.out.println("Средний балл: " + student.getMediumScores());
        }
    }


    public static void MergeSort(Student[] list, Comparator<Student> comparator) {
        if (list.length <= 1) {
            return;
        }
        Student[] arr1 = Arrays.copyOfRange(list, 0, list.length / 2), arr2 = Arrays.copyOfRange(list, list.length / 2, list.length);
        MergeSort(arr1, comparator);
        MergeSort(arr2, comparator);

        merge(list, arr1, arr2, comparator);
    }


    public static void merge(Student[] list, Student[] arr1, Student[] arr2, Comparator<Student> comparator) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if ((comparator.compare(arr1[i], arr2[j])) > 0) {
                list[k] = arr1[i];
                i++;
            }
            else {
                list[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            list[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            list[k] = arr2[j];
            j++;
            k++;
        }
    }
}

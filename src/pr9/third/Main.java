package pr9.third;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students1 = {new Student("Егор", "Гасилин"),
                new Student("Леонид", "Егоров"),
                new Student("Егор", "Леонидов"),
                new Student("Александр", "Калмыков")
        };
        Student[] students2 = {new Student("НеЕгор", "НеГасилин"),
                new Student("ПочтиЛеонид", "ПочтиЕгоров"),
                new Student("ВозможноЕгор", "ВозможноЛеонидов"),
                new Student("АнтиАлександр", "АнтиКалмыков")
        };
        Student[] students = new Student[students1.length + students2.length];
        MergeSort(students1);
        MergeSort(students2);
        merge(students, students1, students2);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }


    public static void MergeSort(Comparable[] list) {
        if (list.length <= 1) {
            return;
        }
        Comparable[] arr1 = Arrays.copyOfRange(list, 0, list.length / 2),
                     arr2 = Arrays.copyOfRange(list, list.length / 2, list.length);
        MergeSort(arr1);
        MergeSort(arr2);

        merge(list, arr1, arr2);
    }


    public static void merge(Comparable[] list, Comparable[] arr1, Comparable[] arr2) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i].compareTo(arr2[j]) > 0) {
                list[k] = arr2[j];
                j++;
            }
            else {
                list[k] = arr1[i];
                i++;
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

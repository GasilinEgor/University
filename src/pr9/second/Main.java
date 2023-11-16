package pr9.second;

public class Main {
    public static void main(String[] args) {
        Student[] students = {new Student("Егор", "Гасилин", 7),
                new Student("Леонид", "Егоров", 5),
                new Student("Егор", "Леонидов", 8),
                new Student("Александр", "Калмыков", 3)
        };
        QuickSort(students, 0, students.length - 1);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }


    public static void QuickSort(Comparable[] list, int start, int end) {
        if (start < end) {
            int change = index(list, start, end);
            QuickSort(list, start, change - 1);
            QuickSort(list, change + 1, end);
        }
    }


    private static int index(Comparable[] list, int start, int end) {
        Comparable change = list[end];
        int z = start - 1;
        for (int i = start; i < end; i++) {
            if (list[i].compareTo(change) < 0) {
                z++;
                swap(list, i, z);
            }
        }
        swap(list, z + 1, end);
        return z + 1;
    }


    private static void swap(Comparable[] list, int index1, int index2) {
        Comparable change = list[index1];
        list[index1] = list[index2];
        list[index2] = change;
    }
}

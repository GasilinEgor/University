package pr9.first;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Егор", "Гасилин", 7),
                new Student("Леонид", "Егоров", 5),
                new Student("Егор", "Леонидов", 8),
                new Student("Александр", "Калмыков", 3)};
        InsertionSort(students);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }



    public static void InsertionSort(Comparable[] list) {
        Comparable swap;
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < i; j++) {
                if (list[i].compareTo(list[j]) < 0) {
                    swap = list[i];
                    list[i] = list[j];
                    list[j] = swap;
                }
            }
        }
    }
}

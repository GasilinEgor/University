package pr10;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    private int change;


    StudentComparator(int change) {
        this.change = change;
    }
    @Override
    public int compare(Student student1, Student student2) {
        if (change == 1) {
            return Double.compare(student1.getMediumScores(), student2.getMediumScores());
        }
        else {
            return student2.getSurname().compareTo(student1.getSurname());
        }
    }
}

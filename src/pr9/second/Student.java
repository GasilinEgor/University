package pr9.second;

public class Student implements Comparable<Student> {
    protected String name;
    protected String surname;
    protected int scores;


    Student(String name, String surname, int scores) {
        this.name = name;
        this.surname = surname;
        this.scores = scores;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public int getScores() {
        return scores;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setScores(int scores) {
        this.scores = scores;
    }


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", scores=" + scores +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.scores, student.scores);
    }
}

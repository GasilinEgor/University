package pr9.first;

public class Student implements Comparable<Student> {
    protected String name;
    protected String surname;
    protected int ID;


    Student(String name, String surname, int ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public int getID() {
        return ID;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setID(int ID) {
        this.ID = ID;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + ID +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.ID, student.ID);
    }
}

package pr9.third;

public class Student implements Comparable<Student> {
    protected String name;
    protected String surname;


    Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.surname.compareTo(student.surname);
    }
}

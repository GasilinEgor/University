package pr10;

import java.util.Comparator;

public class Student implements Comparator<Student> {


    protected String name;
    protected String surname;
    protected String specialization;
    protected int year;
    protected String group;
    protected double mediumScores;


    Student(String surname, String name, String specialization, int year, String  group, double mediumScores) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.year = year;
        this.group = group;
        this.mediumScores = mediumScores;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getSpecialization() {
        return specialization;
    }


    public int getYear() {
        return year;
    }


    public String getGroup() {
        return group;
    }


    public double getMediumScores() {
        return mediumScores;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public void setGroup(String group) {
        this.group = group;
    }


    public void setMediumScores(double mediumScores) {
        this.mediumScores = mediumScores;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialization='" + specialization + '\'' +
                ", year=" + year +
                ", group='" + group + '\'' +
                ", mediumScores=" + mediumScores +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}

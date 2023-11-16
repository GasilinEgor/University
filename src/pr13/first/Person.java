package pr13.first;

import java.lang.StringBuilder;
import java.util.Objects;

public class Person {
    private StringBuilder name;
    private StringBuilder surname;
    private StringBuilder fatherName;


    Person(StringBuilder surname, StringBuilder name, StringBuilder fatherName) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
    }


    Person(StringBuilder surname) {
        this.name = new StringBuilder("");
        this.surname = surname;
        this.fatherName =new StringBuilder("");
    }


    public StringBuilder getName() {
        return name;
    }


    public StringBuilder getSurname() {
        return surname;
    }


    public StringBuilder getFatherName() {
        return fatherName;
    }


    public void setName(StringBuilder name) {
        this.name = name;
    }


    public void setSurname(StringBuilder surname) {
        this.surname = surname;
    }


    public void setFatherName(StringBuilder fatherName) {
        this.fatherName = fatherName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }


    public StringBuilder print() {
        if (this.name.length() <= 1) {
            return this.surname;
        }
        else {
            return this.surname.append(" ").append(this.name.charAt(0)).append(". ").append(this.fatherName.charAt(0)).append(".");
        }
    }
}

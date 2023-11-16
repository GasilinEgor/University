package pr3.Format;
import java.util.Random;
import java.util.Arrays;

public class Zadanie {
    public static void main(String[] args) {
        Random random = new Random();
        String[] names = {"Fullname1", "Fullname2", "Fullname3", "Fullname4", "Fullname5"};
        Employee[] employees = new Employee[5];
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee(names[i], random.nextDouble() + random.nextInt(10000, 100000));
            employees[i] = employee;
        }
        Report.generateReport(employees);
    }
}


class Employee {
    private String fullname;
    private double salary;


    Employee() {
        this.fullname = "";
        this.salary = 0;
    }


    Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }


    public String getFullname() {
        return fullname;
    }


    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", salary=" + salary +
                '}';
    }
}


class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            String str = String.format("%10s : %10.2f", employee.getFullname(), employee.getSalary());
            System.out.println(str);
        }
    }
}

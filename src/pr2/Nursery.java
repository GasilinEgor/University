package pr2;
import java.util.Objects;
import java.util.Scanner;

public class Nursery {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[0];
        Scanner scanner = new Scanner(System.in);
        String command = "Добро пожаловать в питомник! Если Вы захотите выйти, напишите exit в главном меню";
        while (!Objects.equals(command, "exit")) {
            System.out.println("Главное меню" + "\n" + "Команды:");
            System.out.println("print - вывод информации о всех собаках");
            System.out.println("add - добавление собаки");
            System.out.print("Введите комманду: ");
            command = scanner.next();
            if (Objects.equals(command, "print")) {
                print(dogs);
            }
            else if (Objects.equals(command, "add")) {
                dogs = addDog(dogs);
            }
            else if (Objects.equals(command, "exit")) {
                System.out.println("Завершение программы");
            }
        }
    }


    public static Dog[] addDog(Dog[] dogs) {
        Scanner scanner = new Scanner(System.in);
        Dog[] dogs1 = new Dog[dogs.length + 1];
        for (int i = 0; i < dogs.length; i++) {
            dogs1[i] = dogs[i];
        }
        System.out.print("Введите кличку собаки: ");
        String name = scanner.next();
        System.out.print("Введите возраст собаки: ");
        int age = scanner.nextInt();
        Dog dog = new Dog(name, age);
        dogs1[dogs.length] = dog;
        return dogs1;
    }


    public static void print(Dog[] dogs) {
        System.out.println("Все собаки:");
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].toString());
        }
    }
}

class Dog {
    private String name;
    private double age;


    Dog() {
        this.name = "";
        this.age = 0;
    }


    Dog(String name, double age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public double getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAge(double age) {
        this.age = age;
    }


    public double peopleAge() {
        return this.age * 7;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

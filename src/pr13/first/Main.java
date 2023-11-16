package pr13.first;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(new StringBuilder("Гасилин"), new StringBuilder("Егор"), new StringBuilder("Денисович"));
        Person person1 = new Person(new StringBuilder("Гасилин"));
        System.out.println(person.print());
        System.out.println(person1.print());
    }
}

package pr20;

public class Main {
    public static void main(String[] args) {
        First<String, Integer, Double> first = new First<>("Egor", 0, 4.22);
        first.print();
    }
}

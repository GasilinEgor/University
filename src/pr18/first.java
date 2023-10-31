package pr18;

public class first {
    public static void main(String[] args) {
        try {
            System.out.println(2/0);
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
            System.out.println(e);
        }
        System.out.println(2.0 / 0.0);
    }
}

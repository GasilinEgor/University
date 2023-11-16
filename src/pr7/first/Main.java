package pr7.first;

public class Main {
    public static void main(String[] args) {
        String complexValue = "3 - 4i";
        MathFunc mathFunc = new MathFunc();
        System.out.println(mathFunc.abs_i(complexValue));
        System.out.println(mathFunc.getLength(5));
    }
}

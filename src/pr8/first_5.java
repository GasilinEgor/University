package pr8;

public class first_5 {
    public static void main(String[] args) {
        System.out.println(sum(1559));
        System.out.println(sum(19));
        System.out.println(sum(123456789));
    }


    public static int sum(int value) {
        if (value == 0) {
            return 0;
        }
        else {
            return value % 10 + sum(value / 10);
        }
    }
}

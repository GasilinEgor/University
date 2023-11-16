package pr8;

public class second_14 {
    public static void main(String[] args) {
        print(123456789);
    }


    public static void print(int value) {
        if (value < 10) {
            System.out.print(value);
        }
        else {
            print(value / 10);
            System.out.print(" " + value % 10);
        }
    }
}

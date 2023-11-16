package pr22;

import java.util.Stack;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение в ПОЗ: ");
        String val = scanner.nextLine();
        String[] values = val.split(" ");
        Stack<Integer> number = new Stack<>();
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals("+")) {
                Integer a = number.pop();
                Integer b = number.pop();
                number.add(b + a);
            } else if (values[i].equals("-")) {
                Integer a = number.pop();
                Integer b = number.pop();
                number.add(b - a);
            } else if (values[i].equals("/")) {
                Integer a = number.pop();
                Integer b = number.pop();
                if (a == 0) {
                    number.add(0);
                }
                else {
                    number.add(b / a);
                }
            } else if (values[i].equals("*")) {
                Integer a = number.pop();
                Integer b = number.pop();
                number.add(a * b);
            }
            else {
                number.add(Integer.parseInt(values[i]));
            }
        }
        System.out.println(number.pop());
    }
}

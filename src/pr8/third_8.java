package pr8;

public class third_8 {
    public static void main(String[] args) {
        polynomial("aba");
        polynomial("abba");
        polynomial("wasd");
        polynomial("asd");
    }


    public static void polynomial(String line) {
        if (line.length() < 2) {
            System.out.println("YES");
            return;
        }
        if (line.charAt(0) != line.charAt(line.length() - 1)) {
            System.out.println("NO");
            return;
        }
        line = line.substring(1, line.length() - 1);
        polynomial(line);
    }
}

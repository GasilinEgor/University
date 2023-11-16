package pr4_1.second;

public class Main_2 {
    public static void main(String[] args) {
        Circle_2 circle = new Circle_2(5.2);
        Rectangle_2 rectangle = new Rectangle_2(2.6, 7.2);
        Square_2 square = new Square_2(5.5);
        System.out.println(circle.getArea());
        System.out.println(rectangle.getPerimetr());
        System.out.println(rectangle.toString());
    }
}

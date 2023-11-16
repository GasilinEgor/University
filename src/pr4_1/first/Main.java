package pr4_1.first;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.2);
        Rectangle rectangle = new Rectangle(2.6, 7.2);
        Square square = new Square(5.5);
        System.out.println(circle.getArea());
        System.out.println(rectangle.getPerimetr());
        System.out.println(square.getType());
        System.out.println(rectangle.toString());
    }
}

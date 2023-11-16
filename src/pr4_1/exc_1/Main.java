package pr4_1.exc_1;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast
        //Circle to Shape System.out.println(s1); ОШИБКА
        System.out.println(s1.getArea());// which version?
        System.out.println(s1.getPerimeter());//which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); //ОШИБКА
        Circle c1 = (Circle)s1;// Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius()); //ОШИБКА
        //Shape s2 = new Shape(); ОШИБКА
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);//Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); ОШИБКА
        Rectangle r1 = (Rectangle)s3; //downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6);//Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); ОШИБКА
/*обратите внимание, что выполняем downcast Shape s4 к
Rectangle, который является суперклассом
Square(родителем), вместо Square */
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2); System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); ОШИБКА
        System.out.println(r2.getLength());
// Downcast Rectangle r2 к Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}

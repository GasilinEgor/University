package pr4_1.exc_1;

public class Circle extends Shape{
    protected double radius;


    Circle() {
        super();
        this.radius = 0;
    }


    Circle(double radius) {
        super();
        this.radius = radius;
    }


    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }


    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }


    @Override
    public String toString() {
        return "Circle_2{" +
                "radius=" + radius +
                '}';
    }
}

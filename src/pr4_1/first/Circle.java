package pr4_1.first;
import java.math.*;

public class Circle extends Shape {
    private double radius;


    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }


    @Override
    public String getType() {
        return super.getType();
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

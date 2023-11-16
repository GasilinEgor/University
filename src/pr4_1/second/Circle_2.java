package pr4_1.second;
import java.math.*;

public class Circle_2 extends Shape_2 {
    protected double radius;


    Circle_2() {
        super();
        this.radius = 0;
    }


    Circle_2(double radius) {
        super();
        this.radius = radius;
    }


    Circle_2(double radius, String color, boolean filled) {
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
    public double getPerimetr() {
        return 2 * Math.PI * this.radius;
    }


    @Override
    public String toString() {
        return "Circle_2{" +
                "radius=" + radius +
                '}';
    }
}

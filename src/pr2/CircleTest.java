package pr2;
import java.math.*;
import java.util.Objects;

public class CircleTest {
    public static void main(String[] args) {
        Circle2 circle2 = new Circle2(1.5, 5.5, 5.5);
        Circle2 circle21 = new Circle2(5.7, 1.2, 8.8);
        Circle2 circle22 = new Circle2(5.7, 1.2, 8.8);
        System.out.println(circle2.equals(circle21));
        System.out.println(circle2.equals(circle22));
        System.out.println(circle22.equals(circle21));
    }
}


class Circle2 {
    private double radius;
    private double centerX;
    private double centerY;


    Circle2() {
        this.radius = 0.0;
        this.centerX = 0.0;
        this.centerY = 0.0;
    }


    Circle2(double radius, double centerX, double centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }


    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }


    public double getRadius() {
        return radius;
    }


    public double getCenterX() {
        return centerX;
    }


    public double getCenterY() {
        return centerY;
    }


    public double getLength() {
        return 2 * this.radius * Math.PI;
    }


    public double getSquare() {
        return Math.PI * radius * radius;
    }


    public boolean equals(Circle2 circle2) {
        return Double.compare(circle2.radius, radius) == 0 && Double.compare(circle2.centerX, centerX) == 0 && Double.compare(circle2.centerY, centerY) == 0;
    }
}

package pr2;
import java.math.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Circle[] circles = new Circle[n];
        for (int i = 0; i < n; i++)
        {
            circles[i] = new Circle();
        }
    }
}


class Point {
    private double x;
    private double y;


    public Point()
    {
        this.x = 0;
        this.y = 0;
    }


    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }


    public void setX(double x) {
        this.x = x;
    }


    public void setY(double y) {
        this.y = y;
    }


    public void setXY(double x, double y) {
        setX(x);
        setY(y);
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


class Circle {
    private Point center;
    private double radius;


    Circle(double x, double y, double r)
    {
        this.center = new Point(x, y);
        this.radius = r;
    }


    Circle()
    {
        this.center = new Point();
        this.radius = 0;
    }


    public double getRadius() {
        return radius;
    }


    public Point getCenter() {
        return center;
    }


    public double getCenterX() {
        return this.center.getX();
    }


    public double getCenterY() {
        return this.center.getY();
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void setCenter(Point center) {
        this.center = center;
    }


    public void setCenterXY(double x, double y)
    {
        this.center.setXY(x, y);
    }


    public double getLength()
    {
        return Math.PI * 2 * this.radius;
    }


    public double getAquare()
    {
        return Math.PI * this.radius * this.radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "center=" + this.center.toString() +
                ", radius=" + this.radius +
                '}';
    }
}

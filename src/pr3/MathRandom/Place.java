package pr3.MathRandom;
import java.math.*;
import java.util.Arrays;
import java.util.Random;

public class Place {
    public static void main(String[] args) {
        Tester tester = new Tester();
        for (int i = 0; i < 7;i++) {
            Circle circle = new Circle();
            tester.add(circle);
        }
        System.out.println("Максимальная окружность:");
        System.out.println(tester.getCircles()[tester.max()]);
        System.out.println("Минимальная окружность:");
        System.out.println(tester.getCircles()[tester.min()]);
        System.out.println("Класс до сортировки:");
        tester.print();
        System.out.println("\nМассив после сортировки:");
        tester.sort();
        tester.print();
    }
}


class Point {
    private double x;
    private double y;


    Point() {
        this.x = 0.0;
        this.y = 0.0;
    }


    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void setY(double y) {
        this.y = y;
    }


    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }


    public double getX() {
        return x;
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
    private Point point;
    private double radius;


    Circle() {
        Random random = new Random();
        this.point = new Point();
        this.radius = random.nextDouble() + random.nextInt(0, 100);
    }


    Circle(double x, double y) {
        Random random = new Random();
        this.point = new Point(x, y);
        this.radius = this.radius = random.nextDouble() + random.nextInt(0, 100);
    }


    public double getRadius() {
        return radius;
    }


    public Point getPoint() {
        return point;
    }


    public double getLength() {
        return 2 * Math.PI * this.radius;
    }


    public double getSquare() {
        return Math.PI * Math.pow(this.radius, 2);
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void setPoint(Point point) {
        this.point = point;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "point=" + this.point.toString() +
                ", radius=" + radius +
                '}';
    }
}


class Tester {
    private Circle[] circles;
    private int size;


    Tester() {
        this.size = 0;
        this.circles = new Circle[size];
    }


    Tester(int size, Circle[] circles) {
        this.size = size;
        this.circles = circles;
    }


    public Circle[] getCircles() {
        return circles;
    }


    public int getSize() {
        return size;
    }


    public void setCircles(Circle[] circles) {
        this.circles = circles;
    }


    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Tester{" +
                "circles=" + Arrays.toString(circles) +
                ", size=" + size +
                '}';
    }


    public int max() {
        double maximum = this.circles[0].getSquare();
        int index = 0;
        for (int i = 1; i < getSize(); i++) {
            if (this.circles[i].getSquare() > maximum) {
                maximum = this.circles[i].getSquare();
                index = i;
            }
        }
        return index;
    }


    public int min() {
        double minimum = this.circles[0].getSquare();
        int index = 0;
        for (int i = 1; i < getSize(); i++) {
            if (this.circles[i].getSquare() < minimum) {
                minimum = this.circles[i].getSquare();
                index = i;
            }
        }
        return index;
    }


    public void sort() {
        for (int i = 0; i < getSize(); i++) {
            for (int j = i + 1; j < getSize(); j++) {
                if (this.circles[i].getRadius() > this.circles[j].getRadius()) {
                    swap(i, j);
                }
            }
        }
    }


    public void swap(int index1, int index2) {
        Circle circle = this.circles[index1];
        this.circles[index1] = this.circles[index2];
        this.circles[index2] = circle;
    }


    public void add(Circle circle) {
        Circle[] circles1 = new Circle[getSize() + 1];
        for (int i = 0; i < getSize(); i++) {
            circles1[i] = this.circles[i];
        }
        circles1[getSize()] = circle;
        setSize(getSize() + 1);
        setCircles(circles1);
    }


    public void print() {
        for (int i = 0; i < getSize(); i++) {
            System.out.println(this.circles[i].toString());
        }
    }
}
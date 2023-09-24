package pr4_1.first;

public class Rectangle extends Shape {
    private double length;
    private double width;


    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }


    @Override
    public double getArea() {
        return this.length * this.width;
    }


    @Override
    public double getPerimetr() {
        return (this.length + this.width) * 2;
    }


    @Override
    public String getType() {
        return super.getType();
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

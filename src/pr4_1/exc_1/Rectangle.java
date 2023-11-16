package pr4_1.exc_1;


public class Rectangle extends Shape {
    protected double width;
    protected double length;


    Rectangle() {
        super();
        this.width = 0;
        this.length = 0;
    }


    Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }


    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }


    public double getWidth() {
        return width;
    }


    public double getLength() {
        return length;
    }


    public void setLength(double length) {
        this.length = length;
    }


    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double getArea() {
        return this.width * this.length;
    }


    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }


    @Override
    public String toString() {
        return "Rectangle_2{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}

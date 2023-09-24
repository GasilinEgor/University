package pr4_1.first;

public class Square extends Shape {
    private double length;


    Square(double length) {
        super("Square");
        this.length = length;
    }


    @Override
    public double getArea() {
        return this.length * this.length;
    }


    @Override
    public double getPerimetr() {
        return this.length * 4;
    }


    @Override
    public String getType() {
        return super.getType();
    }


    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}

package pr4_1.exc_1;

public class Square extends Rectangle {
    Square() {
        super();
    }


    Square(double side) {
        super(side, side);
    }


    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }


    public double getSide() {
        return super.getLength();
    }


    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }


    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }


    @Override
    public void setLength(double side) {
        super.setLength(side);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}

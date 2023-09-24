package pr4_1.second;

public class Square_2 extends Rectangle_2 {
    Square_2() {
        super();
    }


    Square_2(double side) {
        super(side, side);
    }


    Square_2(double side, String color, boolean filled) {
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

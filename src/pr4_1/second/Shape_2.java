package pr4_1.second;

public abstract class Shape_2 {
    protected String color;
    protected boolean filled;


    Shape_2() {
        this.color = "Black";
        this.filled = false;
    }


    Shape_2(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public boolean isFilled() {
        return filled;
    }


    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public abstract double getArea();


    public abstract double getPerimetr();


    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

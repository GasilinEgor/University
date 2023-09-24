package pr4_1.first;

public class Shape {
    private String type;


    Shape(String type) {
        this.type = type;
    }


    public String getType() {
        return this.type;
    }


    public double getArea() {
        return 0;
    }


    public double getPerimetr() {
        return 0;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                '}';
    }
}

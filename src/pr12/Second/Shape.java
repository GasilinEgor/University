package pr5.Second;
import java.awt.*;

public abstract class Shape {
    protected Color color;
    protected int x, y;


    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }


    abstract void Draw(Graphics g);
}

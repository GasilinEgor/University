package pr5.Second;

import java.awt.*;

public class Circle extends Shape {
    protected int radius;

    public Circle(int x, int y, Color color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    void Draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.radius * 2, this.radius * 2);
    }
}

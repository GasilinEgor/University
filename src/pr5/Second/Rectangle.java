package pr5.Second;

import java.awt.*;

public class Rectangle extends Shape {
    protected int width;
    protected int height;
    public Rectangle(int x, int y, Color color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    void Draw(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
}

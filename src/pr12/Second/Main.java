package pr5.Second;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        JFrame frame = new JFrame("Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                for (int i = 0; i < 20; i++) {
                    int x = random.nextInt(100, 900);
                    int y = random.nextInt(100, 900);
                    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                    int sh = random.nextInt(0,3);
                    Shape shape;
                    switch (sh) {
                        case 1:
                            shape = new Rectangle(x, y, color, random.nextInt(5, 100), random.nextInt(5, 100));
                            break;
                        case 2:
                            shape = new Square(x, y, color, random.nextInt(5, 100));
                        default:
                            shape = new Circle(x, y, color, random.nextInt(5,100));
                    }
                    shape.Draw(g);
                }
            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }
}

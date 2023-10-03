package pr5.Third;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Third {
    private static final String url = "D:\\IntelliJ IDEA Community Edition 2022.2.3\\University\\src\\pr5\\Third\\img\\Ing.jpg";
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("ЯжИнженер");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        BufferedImage image = ImageIO.read(new File(url));
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setVisible(true);
    }
}

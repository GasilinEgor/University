package pr5.fourth;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fourth {
    public static void main(String[] args) throws IOException {
        final int[] i = {0};
        JFrame frame = new JFrame("Анимация");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);


        JPanel imagePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                    ImageIcon icon = new ImageIcon("D:/IntelliJ IDEA Community Edition 2022.2.3/University/src/pr5/fourth/img/Анимация" + i[0] + ".png");
                    Image image = icon.getImage();
                    g.drawImage(image, 0, 0, this);
                }
        };
        frame.add(imagePanel);
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Увеличиваем текущий кадр
                i[0]++;
                if (i[0] > 9) {
                    i[0] = 0;
                }
                imagePanel.repaint(); // Перерисовываем панель для отображения нового кадра
            }
        });

        timer.start();
        frame.setVisible(true);
    }
}

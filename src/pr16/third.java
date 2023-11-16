package pr16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class third extends JFrame {
    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);
    JMenuBar menuBar = new JMenuBar();
    JMenu color = new JMenu("цвет");
    JMenu font = new JMenu("шрифт");
    JMenuItem blue = new JMenuItem("синий");
    JMenuItem red = new JMenuItem("красный");
    JMenuItem black = new JMenuItem("черный");
    JMenuItem TNR = new JMenuItem("Times New Roman");
    JMenuItem MSSS = new JMenuItem("MS Sans Serif");
    JMenuItem CN = new JMenuItem("Courier New");

    third() {
        super("НеБлокнот");
        setSize(400, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(menuBar);
        color.add(blue);
        color.add(red);
        color.add(black);
        font.add(TNR);
        font.add(MSSS);
        font.add(CN);
        menuBar.add(color);
        menuBar.add(font);
        textArea.setFont(new Font("Times New Roman", 0, 14));
        add(scrollPane, BorderLayout.CENTER);
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });
        setVisible(true);
        TNR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Times New Roman", 0, 14));
            }
        });
        MSSS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("MS Sans Serif", 0, 14));
            }
        });
        CN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Courier New", 0, 14));
            }
        });
    }
    public static void main(String[] args) {
        new third();
    }
}

package pr16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class second extends JFrame {
    JPanel centerPanel = new JPanel();
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel westPanel = new JPanel();
    JPanel eastPanel = new JPanel();


    second() {
        super("Оласти");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        centerPanel.setSize(200, 200);
        northPanel.setSize(200, 100);
        southPanel.setSize(200, 100);
        westPanel.setSize(100, 200);
        eastPanel.setSize(100, 200);
        centerPanel.add(new JLabel("CENTER"));
        northPanel.add(new JLabel("NORTH"));
        southPanel.add(new JLabel("SOUTH"));
        westPanel.add(new JLabel("WEST"));
        eastPanel.add(new JLabel("EAST"));
        centerPanel.setBackground(Color.white);
        southPanel.setBackground(Color.red);
        northPanel.setBackground(Color.yellow);
        westPanel.setBackground(Color.green);
        eastPanel.setBackground(Color.cyan);
        add(centerPanel, BorderLayout.CENTER);
        add(northPanel,BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
        add(westPanel, BorderLayout.WEST);
        add(eastPanel, BorderLayout.EAST);
        centerPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(second.this,"Добро пожаловать в ЦАО!");
            }
        });
        setVisible(true);
        southPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(second.this,"Добро пожаловать в ЮАО!");
            }
        });
        setVisible(true);
        northPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(second.this,"Добро пожаловать в САО!");
            }
        });
        setVisible(true);
        westPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(second.this,"Добро пожаловать в ЗАО!");
            }
        });
        setVisible(true);
        eastPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(second.this,"Добро пожаловать в ВАО!");
            }
        });
        setVisible(true);
    }


    public static void main(String[] args) {
        new second();
    }
}

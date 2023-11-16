package pr15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class second extends JFrame {
    String[] countries = {"Australia", "China", "England", "Russia"};
    JComboBox<String> box = new JComboBox<>(countries);
    second() {
        super("Второе задание");
        setTitle("Задание");
        setLayout(new FlowLayout());
        setSize(400, 400);
        add(box);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        box.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) box.getSelectedItem();
                System.out.println("Выбрано: " + selectedOption);
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new second();
    }
}

package pr16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class first extends JFrame {
    JTextField textField = new JTextField(10);
    JButton button = new JButton("Проверить");
    JLabel label = new JLabel("Введите число от 1 до 20");
    int randomNumber = new Random().nextInt(1,21);
    int count = 3;

    first() {
        super("Первое задание");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        textField.setFont(new Font("font2", 0, 20));
        button.setFont(new Font("font", 0, 20));
        add(textField);
        add(button);
        add(label);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(textField.getText());
                    if (number == randomNumber) {
                        label.setText("Вы угадали!");
                        button.setEnabled(false);
                    }
                    else {
                        count--;
                        if (count > 0) {
                            label.setText("Неверно! Осталось " + count + " попыток, ");
                            if (number > randomNumber) {
                                label.setText(label.getText() + "искомое число меньше");
                            }
                            else {
                                label.setText(label.getText() + "искомое число больше");
                            }
                        }
                        else {
                            label.setText("Больше нет попыток, искомое число: " + randomNumber);
                            button.setEnabled(false);
                        }
                    }
                } catch (NumberFormatException ex) {
                    label.setText("Ошибочный ввод! Введите число правильно для продолжения");
                }
            }
        });
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new first();
    }
}

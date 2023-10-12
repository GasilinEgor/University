package pr15;

import javax.swing.*;
import java.awt.*;

public class fourth extends JFrame  {
    JTextField textField = new JTextField(50);
    JButton[] buttons = {
            new JButton("0"),
            new JButton("1"),
            new JButton("2"),
            new JButton("3"),
            new JButton("4"),
            new JButton("5"),
            new JButton("6"),
            new JButton("7"),
            new JButton("8"),
            new JButton("9")
    };
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonMultiply = new JButton("*");
    JButton buttonDivision = new JButton("/");
    JPanel buttonPanel = new JPanel();


    fourth() {
        super("Калькулятор");
        setTitle("Калькулятор");
        setSize(500, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(textField);
        buttonPanel.setLayout(new GridLayout(4, 4));
        for (JButton button : buttons) {
            buttonPanel.add(button);
        }
        setVisible(true);
    }


    public static void main(String[] args) {
        new fourth();
    }
}

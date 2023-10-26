package pr15;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fourth extends JFrame  {
    JTextField textField = new JTextField(12);
    JButton[] buttons = {
            new JButton("7"),
            new JButton("8"),
            new JButton("9"),
            new JButton("/"),
            new JButton("4"),
            new JButton("5"),
            new JButton("6"),
            new JButton("*"),
            new JButton("1"),
            new JButton("2"),
            new JButton("3"),
            new JButton("-"),
            new JButton("0"),
            new JButton("."),
            new JButton("="),
            new JButton("+"),
    };
    JPanel buttonPanel = new JPanel();


    fourth() {
        super("Калькулятор");
        textField.setFont(new Font("", 0, 20));
        buttonPanel.setLayout(new GridLayout(4, 4));
        setTitle("Калькулятор");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buttons[14].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String line = textField.getText();
                Pattern pattern = Pattern.compile("[0-9]+.[0-9]+");
                Matcher matcher = pattern.matcher(line);
                if (line.charAt(1) == '+') {
                    textField.setText((Integer.parseInt(line.charAt(0)) + Integer.parseInt(line.)));
                }
            }
        });
        add(textField);
        for (JButton button : buttons) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!button.getText().equals("=")) {
                        textField.setText(textField.getText() + button.getText());
                    }
                }
            });
            buttonPanel.add(button);
        }
        add(buttonPanel);
        setVisible(true);
    }


    public static void main(String[] args) {
        new fourth();
    }
}

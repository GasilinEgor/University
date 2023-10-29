package pr15;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
                Pattern pattern = Pattern.compile("\\d+\\.?\\d*");
                Pattern pattern1 = Pattern.compile("[+\\-*/]");
                Matcher matcher = pattern.matcher(line);
                Matcher matcher1 = pattern1.matcher(line);
                ArrayList<Double> numbers = new ArrayList<>();
                ArrayList<Character> znaki = new ArrayList<>();
                while (matcher.find()) {
                    numbers.add(Double.valueOf(matcher.group()));
                }
                while (matcher1.find()) {
                    znaki.add(matcher1.group().charAt(0));
                }
                int znak = find(znaki, '*');
                Calculate(numbers, znaki);
                String value = numbers.get(0).toString();
                textField.setText(value);
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


    public static int find(ArrayList<Character> arr, Character ch) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == ch) {
                return i;
            }
        }
        return -1;
    }


    public static void Calculate(ArrayList<Double> numbers, ArrayList<Character> signs) {
        Character[] allSigns = {'*', '/', '+', '-'};
        Double res;
        for (Character ch: allSigns) {
            int index = find(signs, ch);
            while (index != -1) {
                signs.remove(index);
                try {
                   res = result(numbers.get(index), numbers.get(index + 1), ch);
                } catch (Exception e) {
                    return;
                }
                numbers.set(index, res);
                numbers.remove(index + 1);
                index = find(signs, '-');;
            }
        }
    }


    public static Double result(Double a, Double b, Character ch) throws Exception {
        switch (ch) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new Exception("Деление на ноль!");
                }
                else {
                    return a / b;
                }
        }
        return a;
    }
}

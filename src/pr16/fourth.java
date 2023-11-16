package pr16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fourth extends JFrame {
    JTextField servise = new JTextField(20);
    JTextField login = new JTextField(20);
    JTextField password = new JTextField(20);
    JLabel serv = new JLabel("Servise: ");
    JLabel log = new JLabel("User name: ");
    JLabel pas = new JLabel("Password: ");
    JButton button = new JButton("Войти");
    JPanel panel = new JPanel();


    fourth() {
        super("Авторизация");
        setSize(600, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        panel.setLayout(new GridLayout(3, 2));
        panel.add(serv);
        panel.add(servise);
        panel.add(log);
        panel.add(login);
        panel.add(pas);
        panel.add(password);
        add(panel);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (servise.getText().equals("App") && login.getText().equals("GasilinEgor") && password.getText().equals("Qwerty12345")) {
                    JOptionPane.showMessageDialog(null, "Авторизация успешна!","Все отлично!", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Неверный логин или пароль или сервис!", "Верните аккаунт владельцу", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }


    public static void main(String[] args) {
        new fourth();
    }
}

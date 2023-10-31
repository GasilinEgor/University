package pr17.first;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MVCPatternDemo {
    public static void main(String[] args) {
        authorization();
        Student student = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        System.out.println("Before:");
        controller.updateView();
        controller.setStudentName("NonEgor");
        controller.setStudentRollNo("NonRoll");
        System.out.println("After:");
        controller.updateView();
    }


    public static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Egor");
        student.setRollNo("Roll");
        return student;
    }


    public static void authorization() {
        JFrame auth = new JFrame("Авторизация");
        JPanel panel = new JPanel();
        auth.setSize(400, 150);
        auth.setLayout(new FlowLayout());
        panel.setLayout(new GridLayout(3, 2));
        auth.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField login = new JTextField(15);
        JTextField password = new JTextField(15);
        JLabel loginText = new JLabel("Логин");
        JLabel passwordText = new JLabel("Пароль");
        JLabel label = new JLabel("");
        JButton authButton = new JButton("Авторизоваться");
        authButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String log = login.getText();
                String pass = password.getText();
                while (log.indexOf(" ") > 0) {
                    log = log.replace(" ", "");
                }
                while (pass.indexOf(" ") > 0) {
                    pass = pass.replace(" ", "");
                }
                if (log.equals("") || pass.equals("")) {
                    label.setText("Введите все данные!");
                }
                else {
                    auth.setVisible(false);
                    mainPage(log, pass);
                }
            }
        });
        panel.add(loginText);
        panel.add(login);
        panel.add(passwordText);
        panel.add(password);
        panel.add(authButton);
        panel.add(label);
        auth.add(panel);
        auth.setVisible(true);
    }


    public static void mainPage(String login, String password) {
        Student student = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.setStudentName(login);
        controller.setStudentRollNo(password);
        JFrame mainPage = new JFrame("Основное меню");
        mainPage.setSize(400, 200);
        mainPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainPage.setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        JTextField nameField = new JTextField(20);
        JTextField RollField = new JTextField(20);
        JButton name = new JButton("Изменить имя");
        JButton roll = new JButton("Изменить Roll");
        JButton getInf = new JButton("Вывести информацию");
        name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newName = nameField.getText();
                while (newName.indexOf(" ") > 0) {
                    newName = newName.replace(" ", "");
                }
                if (newName.equals("")) {
                    JOptionPane.showMessageDialog(null, "Введите имя!", "Введите имя", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    nameField.setText("");
                    controller.setStudentName(newName);
                    JOptionPane.showMessageDialog(null, "Имя успешно изменено!", "Успех!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        roll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newRoll = RollField.getText();
                while (newRoll.indexOf(" ") > 0) {
                    newRoll = newRoll.replace(" ", "");
                }
                if (newRoll.equals("")) {
                    JOptionPane.showMessageDialog(null, "Введите Roll!", "Введите Roll", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    controller.setStudentRollNo(newRoll);
                    RollField.setText("");
                    JOptionPane.showMessageDialog(null, "Roll успешно изменен!", "Успех!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        getInf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = controller.getStudentName();
                String roll = controller.getStudentRollNo();
                JOptionPane.showMessageDialog(null, "Имя: " + name + "\nRoll: " + roll, "Информация", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(name);
        panel.add(nameField);
        panel.add(roll);
        panel.add(RollField);
        mainPage.add(panel);
        mainPage.add(getInf);
        mainPage.setVisible(true);

    }
}

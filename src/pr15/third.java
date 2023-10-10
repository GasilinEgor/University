package pr15;

import javax.swing.*;
import java.awt.*;

public class third extends JFrame {
    JButton button1 = new JButton("Кнопка 1");
    JButton button2 = new JButton("Кнопка 2");
    JTextField textField = new JTextField("Здесь вы можете ввести свой текст", 20);
    JMenuBar bar = new JMenuBar();
    JMenu file = new JMenu("Файл");
    JMenuItem save = new JMenuItem("Сохранить");
    JMenuItem exit = new JMenuItem("Выйти");
    JMenu refactor = new JMenu("Правка");
    JMenuItem copy = new JMenuItem("Копировать");
    JMenuItem cut = new JMenuItem("Вырезать");
    JMenuItem paste = new JMenuItem("Вставить");
    JMenu reference = new JMenu("Справка");
    third() {
        super("third");
        setTitle("Меню");
        setLayout(new FlowLayout());
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        file.add(save);
        file.add(exit);
        bar.add(file);
        refactor.add(copy);
        refactor.add(cut);
        refactor.add(paste);
        bar.add(refactor);
        bar.add(reference);
        setJMenuBar(bar);
        add(button1);
        add(button2);
        add(textField);
        setVisible(true);

    }


    public static void main(String[] args) {
        new third();
    }
}

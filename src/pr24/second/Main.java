package pr24.second;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    JTextArea textArea = new JTextArea();
    JMenuBar bar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenuItem open = new JMenuItem("Open");
    JMenuItem save = new JMenuItem("Save");
    JMenuItem nnew = new JMenuItem("New");
    JMenuItem exit = new JMenuItem("Exit");
    Main() {
        super("Редактор");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        nnew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IDocument document = IDocumentFactory.getIDocument(new TextDocumentFactory());
                document.print();
            }
        });
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IDocument document = IDocumentFactory.getIDocument(new TextDocumentFactory());
                document.open();
            }
        });
        file.add(nnew);
        file.add(open);
        file.add(save);
        file.add(exit);
        bar.add(file);
        setJMenuBar(bar);
        add(textArea);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Main();
    }
}

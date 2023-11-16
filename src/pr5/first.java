package pr5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class first {
    public static void main(String[] args) {
        final int[] res1 = {0};
        final int[] res2 = {0};
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(600, 300));
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        JLabel label1 = new JLabel(String.format("Result %d X %d", res1[0], res2[0]));
        JLabel label2 = new JLabel("Last Scorer: N/A");
        Label label = new Label("Winner: DRAW");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                res1[0] += 1;
                label1.setText(String.format("Result %d X %d", res1[0], res2[0]));
                label2.setText("Last Scorer: AC Milan");
                if (res1[0] > res2[0]) {
                    label.setText("Winner: AC Milan");
                } else if (res1[0] == res2[0]) {
                    label.setText("Winner: DRAW");
                }
                else {
                    label.setText("Winner: Real Madrid");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                res2[0] += 1;
                label1.setText(String.format("Result %d X %d", res1[0], res2[0]));
                label2.setText("Last Scorer: Real Madrid");
                if (res1[0] > res2[0]) {
                    label.setText("Winner: AC Milan");
                } else if (res1[0] == res2[0]) {
                    label.setText("Winner: DRAW");
                }
                else {
                    label.setText("Winner: Real Madrid");
                }
            }
        });
        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

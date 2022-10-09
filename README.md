# SimpleJavaGUI
This repository includes a simple GUI.java file with code to create a simple GUI with a button in it that increased a value in a label when clicked

In this simple project, a GUI was made. The Explaination of the coe is mentioned Below:

### The Code as A Whole:

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI  implements ActionListener {

    int count = 0;

    JLabel label;
    JFrame frame;
    JPanel panel;
    JButton button;
    public GUI(){
        JFrame frame = new JFrame();

        JButton button = new JButton("Wanna Click Me?");
        button.addActionListener(this);

        label = new JLabel("Number of Clicks So Far: 0");

        panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.setPreferredSize(new Dimension(300,300));
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI Trial");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks : " + count);
        }
}

```

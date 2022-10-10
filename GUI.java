//Required Imports.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI  implements ActionListener {

    //The Components & Variables.
    int count = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;
    JButton button;

    //The GUI Constructor.
    public GUI(){
        frame = new JFrame(); //creating the frame.

        button = new JButton("Wanna Click Me?");  //creating the button with appropriate text.
        button.addActionListener(this); //adding action of the button.

        label = new JLabel("Number of Clicks So Far: 0");  //creating the label with appropriate text.

        panel = new JPanel(); //creating the panel.

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30)); //setting border for the panel.
        panel.setLayout(new GridLayout(0,1)); //setting layout for the panel.
        panel.add(button); //adding Buttong to Panel.
        panel.add(label);  //adding the label to the panel.

        frame.setPreferredSize(new Dimension(300,300)); //setting frame size.
        frame.add(panel,BorderLayout.CENTER); //adding the panel to the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting frame close operation.
        frame.setTitle("GUI Trial"); //setting title for the frame.
        frame.pack(); //packing the frame.
        frame.setVisible(true); //setting visibility for the frame.
    }

    public static void main(String[] args) {
        new GUI(); //Creating the GUI.

    }

    //Action performers.
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks : " + count); //what happens when the button is clicked. label changes to the origial text with a different number of count.
        }
}

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

### The required imports are done first:  
The swing library was used. also the awt library was used.  

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
```
## Onto the GUI Class:  
we implement ActionListener for the button to work.  
```java
public class GUI  implements ActionListener {
```

We then declare our componenets & variable.  
we declared the count variable that will hold the amount of clicks that we had done.  
we declared the label, for the text in the GUI.  
we declared the frame, for the GUI window itself.  
we declared the panel, that will be inside the GUI window.  
we declared a button to be clicked in the GUI.  
All of this is shown below:  
```java
    int count = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;
    JButton button;
```
## Then we started our GUI Constructor:
### For the building of components & GUI:
In the constructor, the frame is first made.  
Then the button is created & the text filling it is placed inbetween the brackets. Also the result of clicking the button is initialized and prepared after.  
A label containing the appropriate text in our GUI is created with the text inbetween the brackets.  
Then a panel is created, this will be in the frame and house our components(the button & label).  
### Now onto the GUI Setup:
### For the Panel:  
First the panels Border are set with "setBorder" & in the brackets we used "BorderFactory.createEmptyBorder" to create the border.  
Then the layout of the panel is set with "setLayout".  
Then the components are added to the panel by simply having panel.add(component). This was done for the Button & the Label.  
### For the Frame:
The size of the frame is pre-set according to the prefrence that will be appropriate for our GUI.  
This was done using "setPreferredSize" & in the bracket "new Dimension(width,Height)" is the detailed.  
The panel is added to the frame & is put in the center. This is done with "frame.add".  
The frame is given a close operation with "setDefaultCloseOperation".  
A title for the frame is given with "setTitle".  
The frame is packed with "frame.pack".  
Then the frame's visibility is set to True so it appears. This is done with "frame.setVisible(true)".  
```java
    public GUI(){
        frame = new JFrame();

        button = new JButton("Wanna Click Me?");
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
```

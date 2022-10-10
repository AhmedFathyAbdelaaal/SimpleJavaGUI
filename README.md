# SimpleJavaGUI
This repository includes a simple GUI.java file with code to create a simple GUI with a button in it that increased a value in a label when clicked

In this simple project, a GUI was made. The Explaination of the code is mentioned Below:

### The Code as A Whole:

```java
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
    //The Components & Variables.
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
```

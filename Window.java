import javax.swing.*;
//import java.awt.Event.*;
import java.awt.*;

public class Window extends JFrame
{
    public Window(String title)
    {
        super(title);
        setLayout(new GridLayout(3, 1));

        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(new JLabel("Weight:"));
        p1.add(new JTextField(10));

        JPanel p2 = new JPanel(new FlowLayout());
        p2.add(new JLabel("Height:"));
        p2.add(new JTextField(10));

        JPanel p3 = new JPanel(new FlowLayout());
        p3.add(new JLabel("BMI:"));
        p3.add(new JTextField(20));
        
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
    }
        
    public static void main(String[] args)
    {
        Window myWindow = new Window("BMI Calculator");
        
        myWindow.setSize(450, 450);
        myWindow.setVisible(true);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
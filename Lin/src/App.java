import java.util.*;
import javax.swing.*;
import java.awt.*;

public class App{
    
    public static void main(String[] args){
        JOptionPane msg = new JOptionPane();
        msg.showMessageDialog(null, "Welcome to Lin 2.0\nWe are still in beta");
        String name = msg.showInputDialog("Name please:");
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLocation(50, 50);
        frame.setTitle("Main Menu");
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1 = new JLabel();
        label1.setText("Welcome to Lin 2.0 " + name);
        JLabel label2 = new JLabel();
        label2.setText("This is just a test message");
        panel.add(label1);
        panel.add(label2);        
    }
}
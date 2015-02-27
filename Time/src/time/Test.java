
package time;

import javax.swing.JOptionPane;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPaneDemo();
    }

       public static void JOptionPaneDemo()
    {
        String inputStr = JOptionPane.showInputDialog("Enter your age: ");

        int age = Integer.parseInt (inputStr);
        if (age > 30)
        {
            // Notice how you can build a string combining strings and an integer
            String outputStr = "Wow! " + age + "is really old";
            JOptionPane.showMessageDialog(null, outputStr);
        }

        else
        {
            int n = JOptionPane.showConfirmDialog(null,
                                 "Do you have any pets?",
                                 "The Pets Question",
                                 JOptionPane.YES_NO_OPTION);

            System.err.println(n);
            if (n == JOptionPane.YES_OPTION)

            {
                 JOptionPane.showMessageDialog(null,
                         "I hope they have had their rabies shots!",
                         "Rabies", // title
                         JOptionPane.WARNING_MESSAGE);

            }
            
            else if (n == JOptionPane.NO_OPTION)
                
            {
                JOptionPane.showMessageDialog(null,
                        "Go get one",
                        "Advice", //title
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }


}

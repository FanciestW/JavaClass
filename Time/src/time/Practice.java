package time;
import javax.swing.JOptionPane;

public class Practice{
    
    public static void main(String[] args){
        JOptionPane msg = new JOptionPane();
        if(age()){
            msg.showMessageDialog(null, "Welcome to A+W Programs");
            msg.showMessageDialog(null, "Welcome " + name());
        }
        msg.showMessageDialog(null, "Good Bye");
    }
    
    public static String name(){
        String name = JOptionPane.showInputDialog("Name: ");
        return(name);
    }
    
    public static boolean age(){
        int con = JOptionPane.showConfirmDialog(null, "Are you at least 18?","Age Confirmation", JOptionPane.YES_NO_OPTION);
        if(con == 0){
            return(true);
        }
        else{
            return(false);
        }
    }
    
}
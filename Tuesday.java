import java.util.Scanner;
import javax.swing.JOptionPane;
public class Tuesday{
    private String name;
    private int age;
    public Tuesday(){
        JOptionPane.showMessageDialog(null, "Welcome to the program", "Java GUI", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showInputDialog(null, "Enter your name:","man",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showConfirmDialog(null,"Press OK to confirm your name.", "Confirmation",JOptionPane.WARNING_MESSAGE);
    }
    public static void main(String[] args) {
        System.out.println("Tuesday's project.");
        Tuesday T=new Tuesday();
        
    }
}
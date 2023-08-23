import javax.swing.*;
//import java.awt.FlowLayout;
import java.awt.*;
//import java.awt.GridLayout;
public class MyGUI4 extends JFrame {
    private JLabel lblfName,lblLName,lblCourse;
    private JTextField txtfName,txtLName,txtCourse;
    private JButton btnSubmit,btnClear;
//consturctor method
public MyGUI4(){
    super("User Information.");
    lblfName= new JLabel("First Name: ");
    lblLName= new JLabel("Last name:  ");
    lblCourse= new JLabel("Course:   ");
    txtfName= new JTextField(32);
    txtLName=new JTextField(20);
    txtCourse=new JTextField(20);
    btnSubmit=new JButton("Submit");
    btnClear=new JButton("Clear Form");
    setVisible(true);
    setSize(300,200);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(lblfName);
    add(txtfName);
    add(lblLName);
    add(txtLName);
    add(lblCourse);
    add(txtCourse);
    add(btnSubmit);
    add(btnClear);

}
public static void main(String args[]){
    new MyGUI4();
}

    
}

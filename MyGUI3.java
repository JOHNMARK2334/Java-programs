 import javax.swing.*;
//import javax.swing.event.*;

import java.awt.event.*;

public class MyGUI3 extends JFrame implements ActionListener {
    private JLabel lblfName,lblLName,lblCourse;
    private JTextField txtfName,txtLName,txtCourse;
    private JButton btnSubmit,btnClear;
    
//consturctor method
public MyGUI3(){
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
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    lblfName.setBounds(30,30,70,15);
    add(lblfName);
   txtfName.setBounds(100,30,70,15);
    add(txtfName);
    lblLName.setBounds(30,50,70,15);
    add(lblLName);
    txtLName.setBounds(100, 50, 70, 15);
    add(txtLName);
    lblCourse.setBounds(30,80,70,15);
    add(lblCourse);
    txtCourse.setBounds(100,80,70,15);
    add(txtCourse);
    btnSubmit.setBounds(30,100,100,25);
    add(btnSubmit);
    btnClear.setBounds(200, 100, 100, 25);
    add(btnClear);
    btnSubmit.addActionListener(this);

}
public void actionPerformed(ActionEvent e){
    int x=JOptionPane.showConfirmDialog(this,"Are you sure you want to terminate?");
    if(x==0){
        System.exit(0);
    }
}
public static void main(String[] args){
    new MyGUI3();
}
    
}

import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.*;


public class Student extends JFrame implements ActionListener {
    //variable declaration
    private JLabel lblName,lblCourse,lblPaid,lblBal,lblId;
    private JTextField txtName,txtCourse,txtPaid,txtBal,txtId;
    private JButton btnSubmit,btnClear,btnExit;


    public Student(){
        super("Student Details");
        lblName=new JLabel("Name:");
        txtName=new JTextField(20);
        lblId=new JLabel("Reg No:");
        txtId=new JTextField(20);
        lblCourse=new JLabel("Course:");
        txtCourse=new JTextField(20);
        lblPaid=new JLabel("Fees Paid:");
        txtPaid=new JTextField(20);
        lblBal=new JLabel("Fee Balance:");
        txtBal=new JTextField(20);
        btnSubmit=new JButton("Submit");
        btnClear=new JButton("Clear");
        btnExit=new JButton("Exit");
        setVisible(true);
        setSize(300,200);
        setBackground(Color.BLUE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(lblName);
        add(txtName);
        add(lblId);
        add(txtId);
        add(lblCourse);
        add(txtCourse);
        add(lblPaid);
        add(txtPaid);
        add(lblBal);
        add(txtBal);
        txtBal.setEditable(false);
        add(btnSubmit);
        add(btnClear);
        add(btnExit);

    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnSubmit){
            double Fee(double x,double y){
                String k=txtPaid.getText();
                x=Double.parseDouble(k);
                y=40000-x;
                String a=Double.toString(y);
                txtBal.setText(a);
                return;
            }
            setVisible(false);
            JOptionPane.showMessageDialog(null, "Welcome to the portal.");

        }
        else if (e.getSource()==btnClear) {
            txtName.setText(" ");
            txtId.setText(" ");
            txtCourse.setText(" ");
            txtPaid.setText(" ");
            txtBal.setText(" ");

            
        } 
        else if(e.getActionCommand()=="Exit"){
            setVisible(false);
            int b=JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
            if(b==0){
                System.exit(0);
            }
            else{
                setVisible(true);
            }
            
        }
       
    }
    public static void main(String[] args){
        Student s1=new Student();
    }



    /*@Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    */


    
}

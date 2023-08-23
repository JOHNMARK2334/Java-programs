import javax.swing.*;
//import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class Calculator{
    private JLabel lblfNo,lblLNo,lblOut;
    private JTextField txtOut,txtfNo,txtLNo;
    private JButton btnAdd,btnSub,btnDiv,btnMul;
    JFrame frame1;
    //private String q=txtfNo.getText();
   // private String z=txtLNo.getText();
    private String b;
    public Calculator(){
        super(); 
        frame1.setTitle("Main Form");
        frame1.setSize(300,200);
        frame1.setVisible(true);

        lblfNo=new JLabel("First Number:");
        txtfNo=new JTextField(20);
        lblLNo=new JLabel("Second Number:");
        txtLNo=new JTextField(20);
        lblOut=new JLabel("Result:");
        txtOut=new JTextField(20);
        txtOut.setText(b);
        txtOut.setEditable(false);
        txtOut.setVisible(true);
        btnAdd=new JButton("Addition");
        btnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

            int add;
            int x=Integer.parseInt(txtfNo.getText());
            int y=Integer.parseInt(txtLNo.getText());
            add=x+y;
            b=Integer.toString(add);
            }
           

        });
        btnSub=new JButton("Subtraction");
        btnSub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int sub;
                int x=Integer.parseInt(txtfNo.getText());
                int y=Integer.parseInt(txtLNo.getText());
                sub=x-y;
                b=Integer.toString(sub);

            }
            
        });
        btnDiv=new JButton("Division");
        btnDiv.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                float div;
                float x=Float.parseFloat(txtfNo.getText());
                float y=Float.parseFloat(txtLNo.getText());
                div=x/y;
                b=Float.toString(div);
            }
        });
        btnMul=new JButton("Multiplication");
        btnMul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                float mul;
                float x=Float.parseFloat(txtfNo.getText());
                float y=Float.parseFloat(txtLNo.getText());
                mul=x*y;
                b=Float.toString(mul);
                
            }
        });
        //setVisible(true);
        //setSize(300,300);
        //setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame1.add(lblfNo);
        frame1.add(txtfNo);
        frame1.add(lblLNo);
        frame1.add(txtLNo);
        frame1.add(lblOut);
        frame1.add(txtOut);
        frame1.add(btnAdd);
        frame1.add(btnSub);
        frame1.add(btnDiv);
        frame1.add(btnMul);
    }
    public static void main(String[] args){
        Calculator Cal=new Calculator();

    }

    
}

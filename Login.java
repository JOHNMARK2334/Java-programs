import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
public class Login extends JFrame{
    private JLabel lblFName, lblPass;
    private JTextField txtFName;
    private JPasswordField pwdPass;
    private  JButton btnLogin, btnExit, btnClear;

    public Login(){
        super("Login form");
        //setBounds(50,20,100,20);
        lblFName=new JLabel("User Name:");
        txtFName=new JTextField(20);
        lblPass=new JLabel("Password:");
        pwdPass=new JPasswordField(20);
        btnLogin=new JButton("Login");
        btnLogin.addActionListener(new Inner());
        btnExit=new JButton("Exit");
        btnExit.addActionListener(new Inner());
        btnClear=new JButton("Clear");
        btnClear.addActionListener(new Inner());
        setVisible(true);
        setSize(300,200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(lblFName);
        add(txtFName);
        add(lblPass);
        add(pwdPass);
        add(btnLogin);
        add(btnExit);
        add(btnClear);
    }
    private class Inner implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getActionCommand()=="Exit"){
                int l=JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to terminate?");
                if(l==0){
                System.exit(0);
                }
                else{

                }
            }
            //else if(e.getSource()==btnClear)
            
            
            else if(e.getSource()==btnLogin){
                String user=txtFName.getText();
                char[] Pass=pwdPass.getPassword();
                char[] Password={'3','1','6','2'};
                if(user.equalsIgnoreCase("JohnMark")&& Password.equals(Pass)){
                  setVisible(false);
                  JOptionPane.showMessageDialog(null , "Welcome back.");
                    public void Calculator(){
                 
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
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "The name or password you entered is not correct.Try again.");
                }
            }
            else{
                txtFName.setText(" ");
                pwdPass.setText(" ");
            }
            
        }
    }

   
   
       
    public static void main(String[] args){
        new Login();
    }
}
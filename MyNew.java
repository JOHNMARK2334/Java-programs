import javax.swing.*;
import java.awt.event.*;


public class MyNew extends JFrame {
    private JMenuBar bar=new JMenuBar();
    private JMenu Mnufile,MnuEdit, MnuMore;
    private JMenuItem  MitNew,MitSave,MitCopy,MitPaste,MitCut,MitExtra;

    
     
 public MyNew(){
    super("Menu Frame");
    Mnufile=new JMenu("File");
    MnuEdit =new JMenu("Edit");
    MnuMore=new JMenu("More");
    MitNew =new JMenuItem("New");
    MitSave=new JMenuItem("Save");
    MitCopy=new JMenuItem("Copy");
    MitPaste=new JMenuItem("Paste");
    MitCut=new JMenuItem("Cut");
    MitExtra=new JMenuItem("Extra");
    setVisible(true);
    setSize(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setJMenuBar(bar);
    bar.add(Mnufile);
    bar.add(MnuEdit);
    bar.add(MnuMore);
    Mnufile.add(MitNew);
    Mnufile.add(MitSave);
    MnuEdit.add(MitCopy);
    MnuEdit.add(MitPaste);
    MnuEdit.add(MitCut);
    Mnufile.add(MnuMore);
    MnuMore.add(MitExtra);
 }
 public static void main(String[] args){
    new MyNew();
 }
    
}



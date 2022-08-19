import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


public class StudentProfile  implements ActionListener, WindowListener  {
    private JFrame fr;
    private JPanel pn1, pn2, pn3, pn4;
    private JTextField tf1, tf2, tf3;
    private JLabel lb1, lb2, lb3;
    private JButton Deposit, Withdraw;
    private Student std;
    public StudentProfile() {
        fr = new JFrame("StudentProfile");
        
        tf1 = new JTextField("",10);
        tf2 = new JTextField("",10);
        tf3 = new JTextField("",10);
        tf3.setEditable( false );
        tf3.setText("0");
        
        lb1 = new JLabel("ID");
        lb2 = new JLabel("Name");
        lb3 = new JLabel("Money");

        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new GridLayout(4,1));
        pn1.setLayout(new GridLayout(1,2));
        pn2.setLayout(new GridLayout(1,2));
        pn3.setLayout(new GridLayout(1,2));
        pn4.setLayout(new FlowLayout());

        Deposit = new JButton("Deposit");
        Withdraw = new JButton("Withdraw");
        
        Deposit.addActionListener(this);
        Withdraw.addActionListener(this);
        
        pn1.add(lb1);
        pn1.add(tf1);
        pn2.add(lb2);
        pn2.add(tf2);
        pn3.add(lb3);
        pn3.add(tf3);
        pn4.add(Deposit);
        pn4.add(Withdraw);
        
        fr.add(pn1);
        fr.add(pn2);
        fr.add(pn3);
        fr.add(pn4);
        
        fr.addWindowListener(this); 

        fr.pack();
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        new StudentProfile();
        }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(Deposit)){
            std.Deposit();
            System.out.println("Deposit");
        }
        if(ae.getSource().equals(Withdraw)){
            std.Withdraw();
            System.out.println("Withdraw");
        }
        tf3.setText(""+std.getMoney());
        
    }
    // overriding windowActivated() method of WindowListener interface which prints the given string when window is set to be active  
    public void windowActivated (WindowEvent arg0) {    
        System.out.println("activated");    
    }    
  
// overriding windowClosed() method of WindowListener interface which prints the given string when window is closed  
    public void windowClosed (WindowEvent arg0) {    
        System.out.println("closed");    
    }    
    
  
// overriding windowDeactivated() method of WindowListener interface which prints the given string when window is not active  
    public void windowDeactivated (WindowEvent arg0) {    
        System.out.println("deactivated");    
    }    
  
// overriding windowDeiconified() method of WindowListener interface which prints the given string when window is modified from minimized to normal state  
    public void windowDeiconified (WindowEvent arg0) {    
        System.out.println("deiconified");    
    }    
  
// overriding windowIconified() method of WindowListener interface which prints the given string when window is modified from normal to minimized state  
    public void windowIconified(WindowEvent arg0) {    
        System.out.println("iconified");    
    }    
  
// overriding windowOpened() method of WindowListener interface which prints the given string when window is first opened  
    public void windowOpened(WindowEvent arg0) {    
        System.out.println("opened");
        File f = new File("StudentM.dat");
        System.out.println(f);
        if(f.exists()){
            try(FileInputStream fin = new FileInputStream("StudentM.dat");
                ObjectInputStream in = new ObjectInputStream(fin);){
                std = (Student) in.readObject();
                tf1.setText(""+std.getID());
                tf2.setText(std.getName());
                tf3.setText(""+std.getMoney());
                System.out.println("Read Student M");
            }
            catch(IOException i){
                i.printStackTrace();
            }
            catch(ClassNotFoundException c){
                c.printStackTrace();
            }
           
        }
        else {
            std = new Student();
            System.out.println("Not found");
        }
        
    }    
    // overriding windowClosing() method of WindowListener interface which prints the given string when we attempt to close window from system menu  
    public void windowClosing (WindowEvent arg0) {    
        System.out.println("closing");   
        Student s = new Student(tf2.getText(), Integer.valueOf(tf1.getText()), Integer.valueOf(tf3.getText()));
        try(FileOutputStream fOut = new FileOutputStream("StudentM.dat"); 
                ObjectOutputStream oout = new ObjectOutputStream(fOut);){
            
                oout.writeObject(s);
                System.out.println("Success");
            }
            catch(IOException i){
                i.printStackTrace();
            }
    }  
}

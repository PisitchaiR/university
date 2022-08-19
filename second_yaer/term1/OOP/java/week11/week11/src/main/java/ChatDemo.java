import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ChatDemo  implements ActionListener, WindowListener {
    private JFrame fr;
    private JPanel frame;
    private JTextArea ta;
    private JTextField tf;
    private JButton Submit, Reset;
    public ChatDemo() {
        fr = new JFrame("Demo Chat");
        ta = new JTextArea(20,45);
        ta.setEditable( false );
        tf = new JTextField("",45);
        frame = new JPanel();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new BorderLayout());
        Submit = new JButton("Submit");
        Reset = new JButton("Reset");
        frame.add(ta, BorderLayout.NORTH);
        frame.add(tf);
        frame.add(Submit, BorderLayout.SOUTH);
        frame.add(Reset, BorderLayout.SOUTH);
        
        Submit.addActionListener(this);
        Reset.addActionListener(this);
        
        fr.addWindowListener(this);   

        fr.add(frame);
        fr.setSize(550, 450);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        new ChatDemo();
        
        }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(Submit)){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            this.ta.setText(this.ta.getText()+"\n"+dtf.format(LocalDateTime.now())+" :  "+this.tf.getText());
            this.tf.setText("");
            System.out.println("Submit");
        }
        if(ae.getSource().equals(Reset)){
            this.ta.setText("");

            System.out.println("Reset");
        }
        
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
            File f = new File("ChatDemo.dat");
            System.out.println(f);
            if(f.exists()){
            try(FileInputStream fin = new FileInputStream("ChatDemo.dat");
                    ObjectInputStream in = new ObjectInputStream(fin);){
                this.ta.setText(""+in.readObject());
            }
            catch(IOException i){
                i.printStackTrace();
            }
            catch(ClassNotFoundException c){
                c.printStackTrace();
            }
           
        }
        else {
            System.out.println("Not found");
        }
        
    }    
    // overriding windowClosing() method of WindowListener interface which prints the given string when we attempt to close window from system menu  
    public void windowClosing (WindowEvent arg0) {    
        System.out.println("closing");   
        try(FileOutputStream fOut = new FileOutputStream("ChatDemo.dat"); 
                ObjectOutputStream oout = new ObjectOutputStream(fOut);){
                oout.writeObject(this.ta.getText());
                System.out.println("Success");
            }
            catch(IOException i){
                i.printStackTrace();
            }
    }  
    
}



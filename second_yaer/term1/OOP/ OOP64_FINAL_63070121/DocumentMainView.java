import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

public class DocumentMainView implements ActionListener, WindowListener{
    private JFrame fr;
    private JPanel pn, pn1, pn2, pn3, pn4, pn5;
    private JLabel lb1, lb2, lb3;
    private JTextField tf1, tf2, tf3;
    private JButton bt1, bt2, bt3, bt4, bt5;
    private JTextArea ta;
    private JComboBox cb;
    private ArrayList<Document> data;
    private int current = 0;
    
    public DocumentMainView(){
        fr = new JFrame();
        pn = new JPanel();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        pn5 = new JPanel();
        lb1 = new JLabel("  Titile");
        lb2 = new JLabel("  Type");
        lb3 = new JLabel("  Detail");
        tf1 = new JTextField("", 15);
        tf2 = new JTextField();
        tf3 = new JTextField("0", 1);
        ta = new JTextArea("", 5, 15);
        bt1 = new JButton("Previous");
        bt2 = new JButton("Next");
        bt3 = new JButton("Add");
        bt4 = new JButton("Update");
        bt5 = new JButton("Delete");
        cb = new JComboBox();
        cb.addItem("Normal");
        cb.addItem("Formal");
        cb.addItem("Informal");
        cb.addItem("etc");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        
        pn.setLayout(new GridLayout(5, 1));
        
        pn1.setLayout(new FlowLayout());
        pn1.add(lb1);
        pn1.add(tf1);
        
        pn2.setLayout(new FlowLayout());
        pn2.add(lb2);
        pn2.add(cb);
        
        pn3.setLayout(new GridLayout(2, 1));
        pn3.add(lb3);
        pn3.add(ta);
        
        pn4.add(bt1);
        pn4.add(tf3);
        pn4.add(bt2);
        
        pn5.add(bt3);
        pn5.add(bt4);
        pn5.add(bt5);
        
        pn.add(pn1);
        pn.add(pn2);
        pn.add(pn3);
        pn.add(pn4);
        pn.add(pn5);

        fr.addWindowListener(this);
        fr.add(pn);
        fr.setDefaultCloseOperation(3);
        fr.setSize(100, 100);
        fr.pack();
        fr.setVisible(true);
    }

    // public ArrayList<Document> getdata() {
    //     return data;
    // }

    // public void setdata(ArrayList<Document> data) {
    //     this.data = data;
    // }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(bt1)){
            System.out.println("1");
            if(current > 1){
                current -= 1;
                tf1.setText(""+data.get(current-1).getTitle());
                tf2.setText(""+data.get(current-1).getDetail());
                cb.setSelectedItem(""+data.get(current-1).getType());
                tf3.setText(""+current);
            }
            
        }
        if(ae.getSource().equals(bt2)){
             System.out.println("2");
             if(data != null && current < data.size() ) {
                 current += 1;
                 tf1.setText(""+data.get(current-1).getTitle());
                 tf2.setText(""+data.get(current-1).getDetail());
                 cb.setSelectedItem(""+data.get(current-1).getType());
                 tf3.setText(""+current);
             }
        }
        if(ae.getSource().equals(bt3)){           
             System.out.println("3");
             new DocumentDetailView(this);
             System.out.println(data);
        }
        if(ae.getSource().equals(bt4)){
             System.out.println("4");
             if(current != 0){
                // data.set(current - 1, new Document(tf1.getText(), new Docuemnt(ta.getDetail()), cb.getSelectedItem()+""));
             JOptionPane.showMessageDialog(fr,"Done it"+ ".",
        "Update Command",
        JOptionPane.INFORMATION_MESSAGE);
             }
             else{
                 JOptionPane.showMessageDialog(fr,"Cann't Update On This data"+ ".",
        "Invalid Command",
        JOptionPane.INFORMATION_MESSAGE);
             }
             
        }
        if(ae.getSource().equals(bt5)){
             System.out.println("5");
             if(data.size() != 1){
                 data.remove(current-1);
             tf1.setText(data.get(current-1).getTitle());
            //  tf2.setText(""+data.get(current-1).getPrice());
             cb.setSelectedItem(""+data.get(current-1).getType());
             tf3.setText(""+current);
             }
             else {
                 data.remove(current-1);
             tf1.setText("");
             tf2.setText("");
             cb.setSelectedItem("General");
             tf3.setText("0");
             }
             
             JOptionPane.showMessageDialog(fr,"Done it"+ ".",
        "Delete Command",
        JOptionPane.INFORMATION_MESSAGE);
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
        // data = new ArrayList<Document>();
        // try (FileInputStream fin = new FileInputStream("data.data");
        //     ObjectInputStream in = new ObjectInputStream(fin);) {
        //     data = (ArrayList<Document>) in.readObject();
            
        // }
        // catch (Exception ex){
        //     System.out.println(ex);
        // }
        
    }    
    // overriding windowClosing() method of WindowListener interface which prints the given string when we attempt to close window from system menu  
    public void windowClosing (WindowEvent arg0) {    
        System.out.println("closing");
        // try(FileOutputStream fOut = new FileOutputStream("data.data"); 
        //         ObjectOutputStream oout = new ObjectOutputStream(fOut);){
        //         oout.writeObject((ArrayList<Document)data);
        //         System.out.println("Success");
        //     }
        //     catch(IOException i){
        //         i.printStackTrace();
        //     }

    }  
}

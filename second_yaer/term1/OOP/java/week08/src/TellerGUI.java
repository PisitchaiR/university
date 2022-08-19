import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TellerGUI implements ActionListener{
    private JFrame fr;
    private JLabel txt1, txt2;
    private JTextField fld1, fld2;
    private JButton btn1, btn2, btn3;
    private JPanel pn1, pn2, pn3;
    private Account acct;
    public TellerGUI(){
        acct = new Account(6000, "");
        fr = new JFrame("Teller GUI");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txt1 = new JLabel("Balance");
        txt2 = new JLabel("Amount");
        fld1 = new JTextField(acct.getBalance()+"");
        fld1.setEditable(false);
        fld2 = new JTextField();
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        
        fr.setLayout(new GridLayout(3, 1));
        pn1.setLayout(new GridLayout(2, 2));
        pn2.setLayout(new FlowLayout());
        pn1.add(txt1);
        pn1.add(fld1);
        pn1.add(txt2);
        pn1.add(fld2);
        pn2.add(btn1);
        pn2.add(btn2);
        pn2.add(btn3);
        fr.add(pn1);
        fr.add(pn2);
        fr.add(pn3);
        fr.pack();
        fr.setVisible(true);
        
        
    }
    public void actionPerformed (ActionEvent ae){
        if (ae.getSource().equals(btn1)){
            acct.deposit(Double.parseDouble(fld2.getText()));
            fld1.setText(acct.getBalance()+"");
            fld2.setText("");
            
        }
        else if (ae.getSource().equals(btn2)){
            if (Double.parseDouble(fld1.getText()) >= Double.parseDouble(fld2.getText())){
                acct.withdraw(Double.parseDouble(fld2.getText()));
                fld1.setText(acct.getBalance()+"");
                fld2.setText("");
            }
        }
        else if (ae.getSource().equals(btn3)){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new TellerGUI();
}
}

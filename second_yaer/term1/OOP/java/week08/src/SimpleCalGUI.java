
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalGUI implements ActionListener {

    private JFrame fr;
    private JTextField txt1, txt2, txt3;
    private JPanel pn1, pn2, pn3, pn4;
    private JButton btn1, btn2, btn3, btn4;
    private double ans;
    public SimpleCalGUI() {
        fr = new JFrame("เครื่องคิดเลข");
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        btn1 = new JButton("บวก");
        btn2 = new JButton("ลบ");
        btn3 = new JButton("คูณ");
        btn4 = new JButton("หาร");
        fr.setLayout(new GridLayout(4, 1));
        pn1.setLayout(new GridLayout(1, 1));
        pn2.setLayout(new GridLayout(1, 1));
        pn4.setLayout(new GridLayout(1, 1));
        pn3.setLayout(new FlowLayout());
        pn2.add(txt2);
        pn4.add(txt3);
        pn3.add(btn1);
        pn3.add(btn2);
        pn3.add(btn3);
        pn3.add(btn4);
        pn1.add(txt1);
        fr.add(pn1);
        fr.add(pn2);
        fr.add(pn3);
        fr.add(pn4);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn1)) {
            ans = Double.parseDouble(txt1.getText())+Double.parseDouble(txt2.getText());
            txt3.setText(ans+"");
        } else if (ae.getSource().equals(btn2)) {
            ans = Double.parseDouble(txt1.getText())-Double.parseDouble(txt2.getText());
            txt3.setText(ans+"");
        } else if (ae.getSource().equals(btn3)) {
            ans = Double.parseDouble(txt1.getText())*Double.parseDouble(txt2.getText());
            txt3.setText(ans+"");
        } else if (ae.getSource().equals(btn4)) {
            ans = Double.parseDouble(txt1.getText())/Double.parseDouble(txt2.getText());
            txt3.setText(ans+"");
        }
    }

    public static void main(String[] args) {
        new SimpleCalGUI();
    }
}

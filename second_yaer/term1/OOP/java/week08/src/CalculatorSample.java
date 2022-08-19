
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalculatorSample implements ActionListener {

    private JFrame fr;
    private JPanel p1, p2;
    private JButton num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, numc, numeq, numpl, nummi, nummul, numdiv;
    private JTextField txt1;
    private String collect, status;
    private double ans;

    public CalculatorSample() {
        fr = new JFrame("Calculator");
        p1 = new JPanel();
        p2 = new JPanel();
        txt1 = new JTextField();
        num0 = new JButton("0");
        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");
        numc = new JButton("c");
        numeq = new JButton("=");
        numpl = new JButton("+");
        nummi = new JButton("-");
        nummul = new JButton("x");
        numdiv = new JButton("/");
        num0.addActionListener(this);
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        numc.addActionListener(this);
        numeq.addActionListener(this);
        numpl.addActionListener(this);
        nummi.addActionListener(this);
        nummul.addActionListener(this);
        numdiv.addActionListener(this);
        p1.setLayout(new BorderLayout());
        p2.setLayout(new GridLayout(4, 4));
        p2.add(num7);
        p2.add(num8);
        p2.add(num9);
        p2.add(numpl);
        p2.add(num4);
        p2.add(num5);
        p2.add(num6);
        p2.add(nummi);
        p2.add(num1);
        p2.add(num2);
        p2.add(num3);
        p2.add(nummul);
        p2.add(num0);
        p2.add(numc);
        p2.add(numeq);
        p2.add(numdiv);
        p1.add(txt1, BorderLayout.NORTH);
        p1.add(p2, BorderLayout.CENTER);
        fr.add(p1);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(num0)) {
            txt1.setText(txt1.getText()+"0");
        } else if (ae.getSource().equals(num1)) {
            txt1.setText(txt1.getText()+"1");
        } else if (ae.getSource().equals(num2)) {
            txt1.setText(txt1.getText()+"2");
        } else if (ae.getSource().equals(num3)) {
            txt1.setText(txt1.getText()+"3");
        } else if (ae.getSource().equals(num4)) {
            txt1.setText(txt1.getText()+"4");
        } else if (ae.getSource().equals(num5)) {
            txt1.setText(txt1.getText()+"5");
        } else if (ae.getSource().equals(num6)) {
            txt1.setText(txt1.getText()+"6");
        } else if (ae.getSource().equals(num7)) {
            txt1.setText(txt1.getText()+"7");
        } else if (ae.getSource().equals(num8)) {
            txt1.setText(txt1.getText()+"8");
        } else if (ae.getSource().equals(num9)) {
            txt1.setText(txt1.getText()+"9");
        } else if (ae.getSource().equals(numc)) {
            txt1.setText("");
        } else if (ae.getSource().equals(numeq)) {
            if (status == "plus"){
                ans = Double.parseDouble(collect)+Double.parseDouble(txt1.getText());
                txt1.setText(ans+"");
            }
            else if (status == "minus"){
                ans = Double.parseDouble(collect)-Double.parseDouble(txt1.getText());
                txt1.setText(ans+"");
            }
            else if (status == "mul"){
                ans = Double.parseDouble(collect)*Double.parseDouble(txt1.getText());
                txt1.setText(ans+"");
            }
            else if (status == "div"){
                ans = Double.parseDouble(collect)/Double.parseDouble(txt1.getText());
                txt1.setText(ans+"");
            }
        } else if (ae.getSource().equals(numpl)) {
            collect = txt1.getText();
            txt1.setText("");
            status = "plus";
            
            
        } else if (ae.getSource().equals(nummi)) {
            collect = txt1.getText();
            txt1.setText("");
            status = "minus";
        } else if (ae.getSource().equals(nummul)) {
            collect = txt1.getText();
            txt1.setText("");
            status = "mul";
        } else if (ae.getSource().equals(numdiv)) {
            collect = txt1.getText();
            txt1.setText("");
            status = "div";
        }
        
    }

    public static void main(String[] args) {
        new CalculatorSample();
    }
}

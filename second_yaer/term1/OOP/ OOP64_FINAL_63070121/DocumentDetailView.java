 import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

public class DocumentDetailView{
    private JFrame fr;
    private JPanel pn, pn1, pn2, pn3;
    private JLabel lb1, lb2, lb3;

    public DocumentDetailView(DocumentMainView info){
        fr = new JFrame();
        pn = new JPanel();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        lb1 = new JLabel("Title : "+ "short Note1");
        lb2 = new JLabel("Type : " + "Normal");
        lb3 = new JLabel("Detail : " + "aa aaa aaaa");
        
        pn.setLayout(new GridLayout(3, 2));

        pn1.add(lb1);
        pn2.add(lb2);
        pn3.add(lb3);
        

        pn.add(pn1);
        pn.add(pn2);
        pn.add(pn3);


        fr.add(pn);
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}



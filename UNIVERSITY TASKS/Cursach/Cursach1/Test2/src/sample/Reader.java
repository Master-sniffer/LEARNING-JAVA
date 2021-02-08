package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame {

    JButton b1,b2;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    int i,k;
    String a,b;

    eHandler handler = new eHandler();

    public Reader(String s){
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("Clear");
        b2 = new JButton("Count");

        l1 = new JLabel("Enter first number");
        l2 = new JLabel("Enter second number");
        l3 = new JLabel("");
        l4 = new JLabel("");

        t1 = new JTextField(10); // тут задали размер окошка
        t2 = new JTextField(10);

        add(b1);
        add(b2);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(l4);

        b2.addActionListener(handler);
        b1.addActionListener(handler);

    }

    public class eHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {

                if (e.getSource() == b2) {
                    i = Integer.parseInt(t1.getText());
                    k = Integer.parseInt(t2.getText());
                    i++;
                    k++;
                    a = "Your first number equals " + i;
                    b = "Your second number equals " + k;
                    l3.setText(a);
                    l4.setText(b);

                }

                if (e.getSource() == b1) {
                    t1.setText(null);
                    t2.setText(null);
                    l3.setText("");
                    l4.setText("");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Enter the number, not some bullshit");
            }
        }
    }


}

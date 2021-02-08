package sample;

import javax.swing.*;

public class Main{

    public static void main(String[] args) {
        Reader r = new Reader("HUILA");
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(300,200);
        r.setResizable(false); // чтобы юзверь не менял размер окна
        r.setLocationRelativeTo(null); // чтобы было в центре экрана
    }
}

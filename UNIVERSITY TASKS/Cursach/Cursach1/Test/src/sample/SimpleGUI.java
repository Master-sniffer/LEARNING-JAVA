package sample;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Cum inside"); // Will check this one too
    private JTextField input = new JTextField("Exactly here", 5); // GOTTA CHECK !
    private JLabel label = new JLabel("Input: "); // That's the place with input

    private JRadioButton radio1 = new JRadioButton("Select this"); // Round box
    private JRadioButton radio2 = new JRadioButton("Or this"); // Round box

    private JCheckBox check = new JCheckBox("Chack", false); // Check box like in license

    public SimpleGUI(){
        super("Simple Example"); // название окошка
        this.setBounds(100, 100, 250, 100); // задаем размеры
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // при закрытии окна - вырубаем все к хуям

        Container container = this.getContentPane(); // Формочка, куда можно все пихать
        container.setLayout(new GridLayout(3,2,2,2)); // создали размеры по ширине и тд
        container.add(label); // Помещаем в контейнер нашу надпись
        container.add(input); // тоже самое

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2); // добавили две кнопки в нашу группу

        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);

        button.addActionListener(new ButtonEventListener());

        container.add(button);
    }

    // То что ниже - просто запомнить
    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {   // сюды передается событие, как параметр
            String message = "";
            message += "Button was pressed\nText is" + input.getText() + "\n";


            if (input.getText().equals("d")){
                System.out.println("hui");
                JOptionPane.showMessageDialog(null,"Damn son");
            }

            //JOptionPane.showMessageDialog(null,"her"); // Эта штука показывает текст. Оставляем)
            //System.out.println(input.getText());

            message += (radio1.isSelected() ? "Radio1" : "Radio2") + " Is Selected\n";

            message += "Checkbox is " + (check.isSelected() ? "Checked" : "Unchecked");

            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE); // Мы выводим новым окном - новое сообщение

        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {

    static JFrame frame = new JFrame();
    static int counter = 0;


    public static void main(String[] args) {
        frame.setLayout(new FlowLayout());
        frame.setBounds(430,250,70,40);
        frame.setSize(300,150);
        frame.setResizable(false);
        JLabel countLabel = new JLabel("Counter:");
        frame.add(countLabel);

        JTextField textField = new JTextField();
        textField.setText("0");
        textField.setPreferredSize(new Dimension(100,25));
        textField.setEditable(false);
        textField.setCaretColor(null);
        frame.add(textField);

        JButton btn = new JButton("+");
        btn.setPreferredSize(new Dimension(70,30));
        frame.add(btn);

        JButton btn1 = new JButton("Cancel");
        frame.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        counter = Integer.parseInt(String.valueOf(textField.getText()));
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //int initial = Integer.parseInt(String.valueOf(textField.getText()));
                System.out.println(counter);
                //counter = initial;
                textField.setText(String.valueOf(counter));
                counter++;
            }
        });

        JButton btn2  = new JButton("Clear");
        //btn2.setPreferredSize(new Dimension(70,30));
        frame.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
                counter = 0;
            }
        });

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
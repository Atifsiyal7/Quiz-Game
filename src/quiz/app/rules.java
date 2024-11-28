
package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rules extends JFrame implements ActionListener {
    JButton start , back;

    String name;

    rules(String name){

        this.name = name;

        JLabel heading = new JLabel("Welcome " + name+ " to QUIZ GAME");
        heading.setBounds(150,100,700,30);
        heading.setFont(new Font("Serif", Font.BOLD ,30));
        heading.setForeground(new Color(22,99,54));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(70,150,700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN ,16));
        rules.setForeground(new Color(22,99,54));
        rules.setText("<html>"+
                "1. Participation in the quiz is free and open to all persons above 18 years old." + "<br><br>" +
                "2. There are a total 10 questions. " + "<br><br>" +
                "3. You only have 15 seconds to answer the question." + "<br><br>" +
                "4. No cell phones or other secondary devices in the room or test area." + "<br><br>" +
                "5. No talking." + "<br><br>" +
                "6. No one else can be in the room with you." + "<br><br>" +
                "<html>");
        add(rules);

        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(22,99,54));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(430,500,100,30);
        start.setBackground(new Color(22,99,54));
        start.setForeground(Color.white);
        start.addActionListener(this);
        add(start);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image i = i1.getImage().getScaledInstance(800,650 , Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0,0,800,650);
        add(image);


        setSize(800,650);
        setLocation(225,40);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == start){
            setVisible(false);
            new quiz(name);

        } else {
            setVisible(false);
            new login();
        }

    }

    public static void main(String[] args) {
        new rules("User");
    }
}

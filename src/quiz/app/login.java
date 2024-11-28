
package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {

    JTextField text;
    JButton next , back ;
    login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);

        //to set the cover image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i = i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(450,0 , 550 , 500);
        add(image);

        //to set the heading(style size etc) in the login frame
        JLabel heading = new JLabel("QUIZ GAME");
        heading.setBounds(110,60,300,45);
        heading.setFont(new Font("Viner Hand ITC" , Font.BOLD , 40));
        heading.setForeground(new Color(22,99,55));
        add(heading);

        // for the name attribute (text)
        JLabel name = new JLabel("Enter Your Name ");
        name.setBounds(160, 150,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,20));
        name.setForeground(new Color(22,99,54 ));
        add(name);

        //adding textfield for the input of name
        text = new JTextField();
        text.setBounds(80 , 200,300,25);
        text.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(text);

        next = new JButton("Next");
        next.setBounds(100,270,120,25);
        next.setBackground(new Color(22,99,54));
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);

        back = new JButton("Back");
        back.setBounds(250,270,120,25);
        back.setBackground(new Color(22,99,54));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);


        setSize(1000 , 500);
        setLocation(155 , 115);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            String name = text.getText();
            setVisible(false);
            new rules(name);

        } else if (e.getSource() == back) {
            System.exit(50);
        }
    }
        public static void main(String[] args) {
        //to call constructor Directly
        new login();
    }
}

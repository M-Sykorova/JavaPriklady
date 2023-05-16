package sk.macuska.project.course.swing.to_do_list;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //FRAME
        JFrame frame = new JFrame("TO - DO LIST");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.getContentPane().setBackground(Color.GREEN);   //NEJDE. PRECO????????????


        //PANEL
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.black);
        frame.setContentPane(panel);



        //PRIDAJ

        // ako vycentrujem  napis na stred?????????
        JLabel pridaj = new JLabel("To do List");
        pridaj.setBounds(160,20,400,30);
        pridaj.setFont(new Font("Ink Free",Font.BOLD,20));
        pridaj.setForeground(Color.ORANGE);
        panel.add(pridaj);
        frame.setVisible(true);


        JScrollPane scrollPane = new JScrollPane();

    }
}

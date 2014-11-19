package MyTest;

import javafx.scene.layout.Background;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class FinalPanel extends JPanel {
JLabel icon = new JLabel();

    public FinalPanel() {


        setLayout(null);


        icon = createIcon(new ImageIcon("C:\\Users\\fredy\\Desktop\\Курсовая ТСО\\best_3.jpg"));


        Font font = new Font(null, Font.BOLD, 23);
        JLabel label = new JLabel("Ваша оценка: " + Frame.ball * 10 / 28);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBounds(230, 20, 300, 70);
        label.setForeground(Color.lightGray);
        label.setFont(font);
        add(label);

        if (!Frame.wrong.equals(" ")) {
            JLabel error = new JLabel("У вас были ошибки в вопросах : " + Frame.wrong);
            Font font2 = new Font(null, Font.BOLD, 14);
            error.setFont(font2);
            error.setHorizontalAlignment(JLabel.CENTER);
            error.setVerticalAlignment(JLabel.CENTER);
            error.setBounds(230, 100, 500, 100);
            error.setForeground(Color.lightGray);
            add(error);

        }

    Frame.ball=0;
        Frame.wrong=" ";

        Font font2 = new Font("Times New Roman", Font.BOLD, 21 );
        JButton exit = new JButton("Выйти");
        exit.setFont(font2);
        exit.setForeground(Color.red);
        exit.setBounds(650, 450, 100, 70);

        add(exit);

    exit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });

        add(icon);
    }
    public JLabel createIcon(Icon image) {
        JLabel label = new JLabel(image);
        label.setVerticalAlignment(JButton.CENTER);
        label.setHorizontalAlignment(JButton.CENTER);
        label.setBounds(0, 0, 800, 600);

        return icon = label;
    }




}
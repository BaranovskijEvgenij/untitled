package MyTest;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class FinalPanel extends JPanel {


    public FinalPanel() {


        setLayout(null);
        Font font = new Font(null, Font.BOLD, 23);
        JLabel label = new JLabel("Ваша оценка: " + Frame.ball * 10 / 28);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBounds(230, 100, 300, 300);
        label.setFont(font);
        add(label);

        JLabel error = new JLabel("У вас были ошибки в вопросах : ");
        Font font2= new Font(null, Font.BOLD, 14);
        error.setFont(font2);
        error.setHorizontalAlignment(JLabel.CENTER);
        error.setVerticalAlignment(JLabel.CENTER);
        error.setBounds(230, 200, 500,300);
        add(error);





    }


class BG extends JPanel {
    public void paintComponent(Graphics g) {
        Image im = null;
        try {
            im = ImageIO.read(new File("C:\\Users\\fredy\\Desktop\\Курсовая ТСО\\3.jpg"));
        } catch (IOException e) {
        }
        g.drawImage(im, 0, 0, null);
    }
}
}
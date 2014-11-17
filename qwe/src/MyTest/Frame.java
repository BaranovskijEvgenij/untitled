package MyTest;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


class Frame {

    public static JFrame frame = new JFrame();
    public static Vop_1 one = new Vop_1();
    public static Vop_2 two = new Vop_2();
    public static Vop_3 three = new Vop_3();
    public static Vop_4 four = new Vop_4();
    public static Vop_5 five = new Vop_5();
    public static Vop_6 six = new Vop_6();
    public static Vop_7 seven = new Vop_7();
    public static Vop_8 eight = new Vop_8();
    public static Vop_9 nine = new Vop_9();
    public static Vop_10 ten = new Vop_10();


    public static int ball = 0;

   // private JPanel[] vops = {one, two, three, four, five, six, seven, eight, nine, ten};
    //private int index = 0;

    public Frame() {

        frame.setTitle("Test_Baranovskogo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setContentPane(new BgPanel());
        frame.setLayout(null);


        frame.setVisible(true);




        Font font = new Font("Times New Roman", Font.BOLD, 50);
        final JLabel l1 = new JLabel("Добро пожаловать!");
        l1.setFont(font);
        l1.setBounds(170, 70, 600, 50);
        l1.setForeground(Color.RED);

        frame.add(l1);


        final JLabel l2 = createLabel("Чтобы начать тест,нажмите кнопку START");
        l2.setBounds(230, 200, 450, 20);
        l2.setForeground(Color.darkGray);
        frame.add(l2);


        final JLabel l3 = createLabel("Чтобы выйти из теста,нажмите кнопку QUIT");
        l3.setBounds(230, 230, 450, 20);
        l3.setForeground(Color.DARK_GRAY);
        frame.add(l3);


        final JButton b1 = createButton("START", new Font(null, Font.PLAIN, 50));
        b1.setBounds(270, 350, 250, 50);
        b1.setForeground(Color.BLUE);
        frame.add(b1);


        final JButton b2 = createButton("QUIT", new Font(null, Font.PLAIN, 50));
        b2.setBounds(270, 410, 250, 50);
        b2.setForeground(Color.BLUE);
        frame.add(b2);



// Переход к вопросу 1
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.setContentPane(one);
                frame.repaint();
                frame.revalidate();


            }
        });


        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }

        });


    }

    public static void getFrame(JPanel panel) {

        frame.setContentPane(panel);
        frame.repaint();
        frame.revalidate();


    }

    //_____________________ Подсчёт кол. баллов !
    public static int getBall(int number) {

        return ball += number;
    }


    private JLabel createLabel(String text) {
        Font font = new Font(null, Font.BOLD, 13);
        JLabel label = new JLabel(text);
        label.setVerticalAlignment(JButton.CENTER);
        label.setHorizontalAlignment(JButton.LEFT);
        label.setFont(font);
        return label;
    }

    private JButton createButton(String text, Font font) {
        JButton but = new JButton(text);
        but.setHorizontalAlignment(JButton.CENTER);
        but.setVerticalAlignment(JButton.CENTER);
        but.setFont(font);
        return but;
    }


    public static void main(String[] args) {


        new Frame().frame.setVisible(true);

    }


}

class BgPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Image im = null;
        try {
            im = ImageIO.read(new File("C:\\Users\\fredy\\Desktop\\Курсовая ТСО\\3.jpg"));
        } catch (IOException e) {
        }
        g.drawImage(im, 0, 0, null);
    }
}

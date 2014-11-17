package MyTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.*;

public class AbstractQuestion_2 extends JPanel {
    public JLabel labelMain = new JLabel();
    public JRadioButton option = new JRadioButton();
    public JRadioButton option2 = new JRadioButton();
    public JRadioButton option3 = new JRadioButton();
    public JRadioButton option4 = new JRadioButton();
    public JButton ok = new JButton();
    public JLabel icon = new JLabel();

    public AbstractQuestion_2(int n, String question, String answer1, String answer2, String answer3, String answer4) {
        setLayout(null);

        labelMain = getLabel("Вопрос " + n + ". " + question);
        add(labelMain);

        option = radioButton(answer1);
        add(option);

        option2 = radioButton2(answer2);
        add(option2);

        option3 = radioButton3(answer3);
        add(option3);

        option4 = radioButton4(answer4);
        add(option4);

        ButtonGroup group = new ButtonGroup();
        group.add(option);
        group.add(option2);
        group.add(option3);
        group.add(option4);

        ok = creatOk();
        add(ok);

        JButton q = creatQ();
        add(q);

        JLabel col = createColVopr(n + " " + "из 10");
        add(col);
    }

    public JLabel getLabel(String text) {
        Font font = new Font(null, Font.BOLD, 13);
        JLabel label = new JLabel(text);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(25, 10, 700, 50);
        label.setFont(font);
        return labelMain = label;

    }

    public JRadioButton getRadioButton(String text) {
        Font font = new Font(null, Font.ITALIC, 13);
        JRadioButton ra = new JRadioButton(text);
        ra.setHorizontalAlignment(JRadioButton.LEFT);
        ra.setVerticalAlignment(JRadioButton.CENTER);
        ra.setFont(font);
        return ra;
    }

    public JRadioButton radioButton(String text) {
        JRadioButton one = getRadioButton(text);
        one.setBounds(25, 140, 200, 30);
        return option = one;
    }

    public JRadioButton radioButton2(String text) {
        JRadioButton two = getRadioButton(text);
        two.setBounds(25, 200, 200, 30);
        return option2 = two;
    }

    public JRadioButton radioButton3(String text) {
        JRadioButton three = getRadioButton(text);
        three.setBounds(25, 260, 200, 30);
        return option3 = three;
    }

    public JRadioButton radioButton4(String text) {
        JRadioButton four = getRadioButton(text);
        four.setBounds(25, 320, 200, 30);
        return option4 = four;
    }


    public JLabel createIcon(Icon image) {
        JLabel label = new JLabel(image);
        label.setVerticalAlignment(JButton.CENTER);
        label.setHorizontalAlignment(JButton.CENTER);
        label.setBounds(300, 100, 450, 350);

        return icon = label;
    }

    // Выход во время теста " Завершить тест"
    public JButton creatQ() {

        JButton q = new JButton("Завершить тест");
        q.setHorizontalAlignment(JButton.CENTER);
        q.setVerticalAlignment(JButton.CENTER);
        q.setBounds(600, 500, 150, 40);
        q.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                creatQtest();

            }
        });

        return q;

    }

    // Счётчик количества вопросов
    public JLabel createColVopr(String text) {
        JLabel l = new JLabel(text);
        Font font = new Font(null, Font.ITALIC, 12);
        l.setVerticalAlignment(JButton.CENTER);
        l.setHorizontalAlignment(JButton.LEFT);
        l.setFont(font);
        l.setBounds(15, 540, 50, 30);
        return l;
    }


    public JButton creatOk() {
        Font font = new Font(null, Font.PLAIN, 30);
        JButton b = new JButton("Ok");
        b.setHorizontalAlignment(JButton.CENTER);
        b.setVerticalAlignment(JButton.CENTER);
        b.setFont(font);
        b.setBounds(200, 500, 100, 40);

        return b;
    }

    public int creatQtest() {

        int j = showConfirmDialog(this, "Вы не закончили тест! Уверенны, что хотите выйти?", "Внимание", YES_NO_OPTION, QUESTION_MESSAGE);
        switch (j) {
            case YES_OPTION:
                System.exit(0);
        }

        return j;

    }

}


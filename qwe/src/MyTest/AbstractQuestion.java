package MyTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.*;


public class AbstractQuestion extends JPanel {

    public JLabel labelMain = new JLabel();
    public JCheckBox option = new JCheckBox();
    public JCheckBox option2 = new JCheckBox();
    public JCheckBox option3 = new JCheckBox();
    public JCheckBox option4 = new JCheckBox();
    public static JButton ok = new JButton();

    public AbstractQuestion(int n, String question, String answer1, String answer2, String answer3, String answer4) {
        setLayout(null);

        labelMain = getLabel("Вопрос " + n + ". " + question);
        add(labelMain);

        option = CheckBoxOne(answer1);
        add(option);

        option2 = CheckBoxTwo(answer2);
        add(option2);

        option3 = CheckBoxThree(answer3);
        add(option3);

        option4 = CheckBoxFour(answer4);
        add(option4);

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
        label.setVerticalAlignment(JButton.CENTER);
        label.setHorizontalAlignment(JButton.LEFT);
        label.setBounds(25, 10, 700, 50);
        label.setFont(font);
        return labelMain = label;

    }

    public JCheckBox CheckBoxOne(String text) {
        JCheckBox one = getCheckBox(text);
        one.setBounds(25, 140, 700, 30);
        return option = one;
    }

    public JCheckBox CheckBoxTwo(String text) {
        JCheckBox two = getCheckBox(text);
        two.setBounds(25, 200, 700, 30);
        return option2 = two;
    }

    public JCheckBox CheckBoxThree(String text) {
        JCheckBox three = getCheckBox(text);
        three.setBounds(25, 260, 700, 30);
        return option3 = three;
    }

    public JCheckBox CheckBoxFour(String text) {
        JCheckBox four = getCheckBox(text);
        four.setBounds(25, 320, 700, 30);
        return option4 = four;
    }

    public JCheckBox getCheckBox(String text) {
        Font font = new Font(null, Font.ITALIC, 13);
        JCheckBox cb = new JCheckBox(text);
        cb.setHorizontalAlignment(JCheckBox.LEFT);
        cb.setVerticalAlignment(JCheckBox.CENTER);
        cb.setFont(font);
        return cb;
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
        l.setVerticalAlignment(JLabel.CENTER);
        l.setHorizontalAlignment(JLabel.LEFT);
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

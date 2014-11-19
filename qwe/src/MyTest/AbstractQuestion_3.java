package MyTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.*;


public class AbstractQuestion_3 extends JPanel {
    public JLabel labelMain = new JLabel();
    public JComboBox option = new JComboBox();
    public JComboBox option2 = new JComboBox();
    public JComboBox option3 = new JComboBox();
    public JComboBox option4 = new JComboBox();

    public JButton ok = new JButton();

    public int g1;
    public int g2;
    public int g3;
    public int g4;

    public JLabel ansText = new JLabel();
    public JLabel ansText2 = new JLabel();
    public JLabel ansText3 = new JLabel();
    public JLabel ansText4 = new JLabel();

    public AbstractQuestion_3(int n, String question, String answer1, String answer2, String answer3, String answer4,
                              String textOne, String textTwo, String textThree, String textFour) {

        setLayout(null);
        labelMain = getLabel(question);
        add(labelMain);

// комбоБоксы _____________________________________________

        String[] box = {"1)" + " " + answer1, "2)" + " " + answer2, "3)" + " " + answer3, "4)" + " " + answer4};


        option = ComboBox(box);
        option.setSelectedIndex(-1);
        add(option);

        option2 = ComboBox2(box);
        option2.setSelectedIndex(-1);
        add(option2);

        option3 = ComboBox3(box);
        option3.setSelectedIndex(-1);
        add(option3);

        option4 = ComboBox4(box);
        option4.setSelectedIndex(-1);
        add(option4);


//__________________________________________
        // само уже определение
        ansText = labelText(textOne);
        add(ansText);

        ansText2 = labelText2(textTwo);
        add(ansText2);

        ansText3 = labelText3(textThree);
        add(ansText3);

        ansText4 = labelText4(textFour);
        add(ansText4);

        ok = creatOk();
        add(ok);

        JButton q = creatQ();
        add(q);

        JLabel col = createColVopr(n + " " + "из 10");
        add(col);
    }

    public JLabel getLabel(String text) {
        Font font = new Font(null, Font.BOLD, 14);
        JLabel label = new JLabel(text);
        label.setVerticalAlignment(JLabel.NORTH);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(25, 10, 700, 70);
        label.setFont(font);
        label.setForeground(Color.DARK_GRAY);
        return labelMain = label;

    }

    public JComboBox ComboBox(String[] text) {
        Font font = new Font(null, Font.BOLD, 11);
        JComboBox combo = new JComboBox(text);
        combo.setBounds(5, 130, 190, 30);
        combo.setFont(font);
        return option = combo;
    }

    public JComboBox ComboBox2(String[] text) {
        Font font = new Font(null, Font.BOLD, 11);
        JComboBox combo2 = new JComboBox(text);
        combo2.setBounds(5, 210, 190, 30);
        combo2.setFont(font);
        return option2 = combo2;
    }

    public JComboBox ComboBox3(String[] text) {
        Font font = new Font(null, Font.BOLD, 11);
        JComboBox combo3 = new JComboBox(text);
        combo3.setBounds(5, 290, 190, 30);
        combo3.setFont(font);
        return option3 = combo3;
    }

    public JComboBox ComboBox4(String[] text) {
        Font font = new Font(null, Font.BOLD, 11);
        JComboBox combo4 = new JComboBox(text);
        combo4.setBounds(5, 370, 190, 30);
        combo4.setFont(font);
        return option4 = combo4;
    }


    public JLabel getLabelText(String text) {
        Font font = new Font(null, Font.BOLD, 13);
        JLabel l = new JLabel(text);
        l.setVerticalAlignment(JLabel.NORTH);
        l.setHorizontalAlignment(JLabel.LEFT);
        l.setFont(font);
        return l;
    }

    public JLabel labelText(String text) {
        JLabel one = getLabelText(text);
        one.setBounds(230, 130, 550, 70);
        return ansText = one;

    }

    public JLabel labelText2(String text) {
        JLabel two = getLabelText(text);
        two.setBounds(230, 210, 550, 70);
        return ansText2 = two;
    }

    public JLabel labelText3(String text) {
        JLabel three = getLabelText(text);
        three.setBounds(230, 290, 550, 70);
        return ansText3 = three;
    }

    public JLabel labelText4(String text) {
        JLabel four = getLabelText(text);
        four.setBounds(230, 370, 550, 80);
        return ansText4 = four;
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

    public void  gran() {
        JLabel gran = new JLabel("______________________________________________________________________________________________________________");
        gran.setBounds(10, 70, 800, 20);
        add(gran);

    }
    }

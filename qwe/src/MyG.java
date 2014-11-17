import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import static javax.swing.JOptionPane.*;

public class MyG {
    public static void main(String[] args) {
        Fr f = new Fr();
        f.setVisible(true);

    }
}

class Fr extends JFrame {
    private JPanel panel;
    private JFrame f;
    private JButton b1;
    private JButton b2;
    private JLabel l1;
    private JLabel l2;
    private int count = 0;
    private int v = 0;
    private JCheckBox ch1;

    public Fr() {

        setTitle("Test_Baranovskogo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);

        setVisible(true);

        //setContentPane(new BgPanel());
        final Container cont = getContentPane();
        cont.setLayout(null);


        Font font = new Font("Times New Roman", Font.BOLD, 50);
        final JLabel l1 = new JLabel("Добро пожаловать!");
        l1.setFont(font);
        l1.setBounds(170, 70, 600, 50);
        l1.setForeground(Color.RED);
        cont.add(l1);

        font = new Font(null, Font.BOLD, 13);
        final JLabel l2 = createLabel("Чтобы начать тест,нажмите кнопку START");
        l2.setBounds(230, 200, 450, 20);
        l2.setForeground(Color.darkGray);
        cont.add(l2);

        font = new Font(null, Font.BOLD, 13);
        final JLabel l3 = createLabel("Чтобы выйти из теста,нажмите кнопку QUIT");
        l3.setBounds(230, 230, 450, 20);
        l3.setForeground(Color.DARK_GRAY);
        cont.add(l3);

        font = new Font(null, Font.PLAIN, 50);
        final JButton b1 = createButton("START", new Font(null, Font.PLAIN, 50));
        b1.setBounds(270, 350, 250, 50);
        b1.setForeground(Color.BLUE);
        cont.add(b1);

        font = new Font(null, Font.PLAIN, 50);
        final JButton b2 = createButton("QUIT", new Font(null, Font.PLAIN, 50));
        b2.setBounds(270, 410, 250, 50);
        b2.setForeground(Color.BLUE);
        cont.add(b2);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }

        });

        // Нажимая START ты перейдёшь к вопросу 1
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cont.removeAll();
                revalidate();
                repaint();

                v++;
                JLabel col = createColVopr(v + " " + "из 10");


                JLabel l = createLabel("Вопрос 1 Какое из предложеных устройств относятся к аудиальным (звуковым) средствам обучения?");
                l.setBounds(10, 10, 700, 50);
                final JCheckBox ch = createCb("проектор");
                ch.setBounds(25, 140, 90, 30);
                final JCheckBox ch1 = createCb("магнитофон");
                ch1.setBounds(25, 200, 105, 30);
                final JCheckBox ch2 = createCb("микрофон");
                ch2.setBounds(25, 260, 90, 30);
                final JCheckBox ch3 = createCb("монитор");
                ch3.setBounds(25, 320, 90, 30);


                JButton q = creatQ();
                JButton b = creatOk();


                // Нажав OK ты перейдёшь к вопросу 2
                b.addActionListener(new ActionListener() {


                    @Override
                    public void actionPerformed(ActionEvent e) {


                        if (!ch.isSelected() && ch1.isSelected() && !ch2.isSelected() && !ch3.isSelected()) {
                            //Количество баллов за вопрос 1
                            count += 1;

                        }

                        cont.removeAll();
                        revalidate();
                        repaint();

                        v++;
                        JLabel col = createColVopr(v + " " + "из 10");

                        JLabel l = createLabel("Вопрос 2 Для каких видов организации обучения характерно использование аудиооборудования?");
                        l.setBounds(25, 10, 700, 50);
                        final JCheckBox ch = createCb("конференция");
                        ch.setBounds(25, 140, 110, 30);
                        final JCheckBox ch1 = createCb("семинар (для учащихся с генетическим нарушением зрения)");
                        ch1.setBounds(25, 200, 430, 30);
                        final JCheckBox ch2 = createCb("тренинги");
                        ch2.setBounds(25, 260, 90, 30);
                        final JCheckBox ch3 = createCb("мастер-класс (для учащихся с генетическим нарушением слуха)");
                        ch3.setBounds(25, 320, 450, 30);


                        JButton q = creatQ();
                        JButton b = creatOk();

                        //Нажав ОК ты переёдешь к 3 вопросу
                        b.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {


                                if (ch.isSelected() && ch1.isSelected() && ch2.isSelected() && !ch3.isSelected()) {
                                    //Количество баллов за вопрос 2
                                    count += 2;

                                }

                                cont.removeAll();
                                revalidate();
                                repaint();

                                v++;
                                JLabel col = createColVopr(v + " " + "из 10");

                                JLabel l = createLabel("Вопрос 3 Аудиальные средства обучения позволяют (выберите правильный вариант ответа):");
                                l.setBounds(10, 10, 700, 50);

                                final JCheckBox ch = createCb("получить точное представление о внешнем виде изучаемого объекта");
                                ch.setBounds(25, 140, 500, 30);
                                final JCheckBox ch1 = createCb("получить точное представление о звуковых особенностях изучаемого объекта");
                                ch1.setBounds(25, 200, 700, 30);
                                final JCheckBox ch2 = createCb("исследовать изобразительные возможности текстового редактора");
                                ch2.setBounds(25, 260, 600, 30);
                                final JCheckBox ch3 = createCb("улучшить мелкую моторику у учащихся ");
                                ch3.setBounds(25, 320, 300, 30);


                                JButton q = creatQ();
                                JButton b = creatOk();


                                //Нажав ОК ты переёдешь к 4 вопросу
                                b.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {


                                        if (!ch.isSelected() && ch1.isSelected() && !ch2.isSelected() && !ch3.isSelected()) {
                                            //Количество баллов за вопрос 3
                                            count += 2;

                                        }

                                        cont.removeAll();
                                        revalidate();
                                        repaint();

                                        v++;
                                        JLabel col = createColVopr(v + " " + "из 10");

                                        JLabel l = createLabel("Вопрос 4 Укажите, что из перечисленного не относится к числу статических экранных средств обучения и воспитания :");
                                        l.setBounds(10, 10, 700, 50);

                                        final JCheckBox ch = createCb("кинофильм");
                                        ch.setBounds(25, 140, 500, 30);
                                        final JCheckBox ch1 = createCb("диапозитивы");
                                        ch1.setBounds(25, 200, 700, 30);
                                        final JCheckBox ch2 = createCb("диафильмы");
                                        ch2.setBounds(25, 260, 600, 30);
                                        final JCheckBox ch3 = createCb("эпиобъекты");
                                        ch3.setBounds(25, 320, 300, 30);


                                        JButton q = creatQ();
                                        JButton b = creatOk();


                                        //Нажав ОК ты переёдешь к 5 вопросу
                                        b.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {

                                                if (ch.isSelected() && !ch1.isSelected() && !ch2.isSelected() && !ch3.isSelected()) {
                                                    //Количество баллов за вопрос 4
                                                    count += 2;

                                                }

                                                cont.removeAll();
                                                revalidate();
                                                repaint();

                                                v++;
                                                JLabel col = createColVopr(v + " " + "из 10");
                                                JLabel l = createLabel("Вопрос 5 На рисунке изображен :");
                                                l.setBounds(10, 10, 700, 50);

                                                JLabel li = createIcon(new ImageIcon("C:\\Users\\fredy\\Desktop\\Курсовая ТСО\\45.gif"));
                                                li.setBounds(300, 100, 400, 300);

                                                final JRadioButton ch = createRa("диапроектрор");
                                                ch.setBounds(25, 140, 150, 30);
                                                final JRadioButton ch1 = createRa("Графопроектор");
                                                ch1.setBounds(25, 200, 150, 30);
                                                final JRadioButton ch2 = createRa("Телевизор");
                                                ch2.setBounds(25, 260, 150, 30);
                                                final JRadioButton ch3 = createRa("документ-камера");
                                                ch3.setBounds(25, 320, 150, 30);

                                                ButtonGroup group = new ButtonGroup();
                                                group.add(ch);
                                                group.add(ch1);
                                                group.add(ch2);
                                                group.add(ch3);


                                                JButton q = creatQ();
                                                JButton b = creatOk();

                                                //Нажав ОК ты переёдешь к 6 вопросу
                                                b.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        if (ch.isSelected()) {
                                                            //Количество баллов за вопрос 5
                                                            count += 3;

                                                        }

                                                        cont.removeAll();
                                                        revalidate();
                                                        repaint();

                                                        v++;
                                                        JLabel col = createColVopr(v + " " + "из 10");
                                                        JLabel l = createLabel("Вопрос 6 На рисунке изображен :");
                                                        l.setBounds(10, 10, 700, 50);

                                                        JLabel li = createIcon(new ImageIcon("C:\\Users\\fredy\\Desktop\\Курсовая ТСО\\13.gif"));
                                                        li.setBounds(300, 100, 450, 350);

                                                        final JRadioButton ch = createRa("диапозитив");
                                                        ch.setBounds(25, 140, 100, 30);
                                                        final JRadioButton ch1 = createRa("эпископ");
                                                        ch1.setBounds(25, 200, 100, 30);
                                                        final JRadioButton ch2 = createRa("филомоскоп");
                                                        ch2.setBounds(25, 260, 100, 30);
                                                        final JRadioButton ch3 = createRa("слайд");
                                                        ch3.setBounds(25, 320, 100, 30);

                                                        ButtonGroup group = new ButtonGroup();
                                                        group.add(ch);
                                                        group.add(ch1);
                                                        group.add(ch2);
                                                        group.add(ch3);


                                                        JButton q = creatQ();
                                                        JButton b = creatOk();


                                                        //Нажав ОК ты переёдешь к 7 вопросу
                                                        b.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {

                                                                if (ch3.isSelected()) {
                                                                    //Количество баллов за вопрос 6
                                                                    count += 3;

                                                                }

                                                                cont.removeAll();
                                                                revalidate();
                                                                repaint();

                                                                v++;
                                                                JLabel col = createColVopr(v + " " + "из 10");
                                                                JLabel l = createLabel("Вопрос 7 На рисунке изображен :");
                                                                l.setBounds(10, 10, 700, 50);

                                                                JLabel li = createIcon(new ImageIcon("C:\\Users\\fredy\\Desktop\\Курсовая ТСО\\14.gif"));
                                                                li.setBounds(300, 100, 450, 350);

                                                                final JRadioButton ch = createRa("Диапроектор");
                                                                ch.setBounds(25, 140, 150, 30);
                                                                final JRadioButton ch1 = createRa("графопроектор");
                                                                ch1.setBounds(25, 200, 150, 30);
                                                                final JRadioButton ch2 = createRa("эпископ");
                                                                ch2.setBounds(25, 260, 150, 30);
                                                                final JRadioButton ch3 = createRa("мультимедиа-проектор");
                                                                ch3.setBounds(25, 320, 200, 30);

                                                                ButtonGroup group = new ButtonGroup();
                                                                group.add(ch);
                                                                group.add(ch1);
                                                                group.add(ch2);
                                                                group.add(ch3);


                                                                JButton q = creatQ();
                                                                JButton b = creatOk();

                                                                //Нажав ОК ты переёдешь к 8 вопросу
                                                                b.addActionListener(new ActionListener() {
                                                                    @Override
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        if (ch1.isSelected()) {
                                                                            //Количество баллов за вопрос 7
                                                                            count += 3;
                                                                        }
                                                                        cont.removeAll();
                                                                        revalidate();
                                                                        repaint();

                                                                        v++;
                                                                        JLabel col = createColVopr(v + " " + "из 10");
                                                                        JLabel l = createLabel("<html> Вопрос 7 К средствам обучения предъявляют разносторонние требования: функциональные, педагогические, эргономические, эстетические. Установите соответствие между наименованием требования и его характеристикой.</html>");
                                                                        l.setBounds(10, 10, 700, 50);

                                                                        final JLabel ch = createLabel("Функциональные ");
                                                                        ch.setBounds(25, 140, 150, 30);

                                                                        JComboBox box = new JComboBox();
                                                                        box.setBounds(350, 150, 300, 100);


                                                                        box.addItem("<html>способность аппаратуры обеспечивать необходимые режимы работы (громкость и качество звучания; вместимость кассет аудиовизуальных средств, достаточная для проведения занятия с минимумом перезарядок; универсальность прибора).</html>");
                                                                        box.addItem("<html>соответствие возможностей технического <br> средства тем формам и методам <br> учебно-воспитательного процесса, <br> которые согласуются с современными <br> требованиями.</html>");
                                                                        box.addItem("<html>удобство и безопасность эксплуатации; минимальное количество операций при подготовке и работе с аппаратом; уровень шума; удобство осмотра, ремонта, транспортирования</html>");
                                                                        box.addItem("<html>гармония формы (наглядное выражение назначения, масштаб, соразмерность); целостность композиции, товарный вид</html>");


                                                                        JScrollPane pane = new JScrollPane(box,
                                                                                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                                                                                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                                                                        //list.addItem(pane);
                                                                        cont.add(pane);


                                                                        cont.add(box);
                                                                        cont.add(l);
                                                                        cont.add(col);
                                                                        cont.add(ch);

                                                                    }
                                                                }); //вопрос 7
                                                                cont.add(li);
                                                                cont.add(col);
                                                                cont.add(q);
                                                                cont.add(l);
                                                                cont.add(ch);
                                                                cont.add(ch1);
                                                                cont.add(ch2);
                                                                cont.add(ch3);
                                                                cont.add(b);

                                                            }
                                                        }); //вопрос 6


                                                        cont.add(li);
                                                        cont.add(col);
                                                        cont.add(q);
                                                        cont.add(l);
                                                        cont.add(ch);
                                                        cont.add(ch1);
                                                        cont.add(ch2);
                                                        cont.add(ch3);
                                                        cont.add(b);

                                                    }
                                                }); // вопрос 5


                                                cont.add(li);
                                                cont.add(col);
                                                cont.add(q);
                                                cont.add(l);
                                                cont.add(ch);
                                                cont.add(ch1);
                                                cont.add(ch2);
                                                cont.add(ch3);
                                                cont.add(b);

                                            }
                                        });// вопрос 4

                                        cont.add(col);
                                        cont.add(q);
                                        cont.add(l);
                                        cont.add(ch);
                                        cont.add(ch1);
                                        cont.add(ch2);
                                        cont.add(ch3);
                                        cont.add(b);

                                    }
                                }); //вопрос 3

                                cont.add(col);
                                cont.add(q);
                                cont.add(l);
                                cont.add(ch);
                                cont.add(ch1);
                                cont.add(ch2);
                                cont.add(ch3);
                                cont.add(b);

                            }
                        }); //вопрос 2
                        cont.add(col);
                        cont.add(q);
                        cont.add(l);
                        cont.add(ch);
                        cont.add(ch1);
                        cont.add(ch2);
                        cont.add(ch3);
                        cont.add(b);

                    }
                }); // вопрос 1
                cont.add(col);
                cont.add(q);
                cont.add(l);
                cont.add(ch);
                cont.add(ch1);
                cont.add(ch2);
                cont.add(ch3);
                cont.add(b);

            }
        });

    }


    private JLabel createColVopr(String text) {
        JLabel l = new JLabel(text);
        Font font = new Font(null, Font.ITALIC, 12);
        l.setVerticalAlignment(JButton.CENTER);
        l.setHorizontalAlignment(JButton.LEFT);
        l.setFont(font);
        l.setBounds(15, 540, 50, 30);
        return l;
    }

    private JLabel createIcon(Icon image) {
        JLabel label = new JLabel(image);
        label.setVerticalAlignment(JButton.CENTER);
        label.setHorizontalAlignment(JButton.CENTER);

        return label;
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

    private JRadioButton createRa(String text) {
        Font font = new Font(null, Font.ITALIC, 13);
        JRadioButton ra = new JRadioButton(text);
        ra.setHorizontalAlignment(JRadioButton.LEFT);
        ra.setVerticalAlignment(JRadioButton.CENTER);
        ra.setFont(font);
        return ra;
    }

    private JCheckBox createCb(String text) {
        Font font = new Font(null, Font.ITALIC, 13);
        JCheckBox cb = new JCheckBox(text);
        cb.setHorizontalAlignment(JCheckBox.LEFT);
        cb.setVerticalAlignment(JCheckBox.CENTER);

        cb.setFont(font);
        return cb;
    }


    // Слудующий вопрос! Кнопка "Ok"

    private JButton creatOk() {
        Font font = new Font(null, Font.PLAIN, 30);
        JButton b = new JButton("Ok");
        b.setHorizontalAlignment(JButton.CENTER);
        b.setVerticalAlignment(JButton.CENTER);
        b.setFont(font);
        b.setBounds(200, 500, 100, 40);

        return b;

    }

    private int creatQtest() {
        int j = showConfirmDialog(this, "Вы не закончили тест, у вас осталось" + " " + (10 - v) + " " + "вопросов. Хотите выйти?", "Внимание", YES_NO_OPTION, QUESTION_MESSAGE);
        switch (j) {
            case YES_OPTION:
                System.exit(0);
        }

        return j;

    }


    // Выход во время теста " Завершить тест"
    private JButton creatQ() {

        JButton q = new JButton("Завершить тест");
        q.setHorizontalAlignment(JButton.CENTER);
        q.setVerticalAlignment(JButton.CENTER);
        q.setBounds(600, 500, 150, 40);
        q.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int j = creatQtest();

            }
        });

        return q;

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
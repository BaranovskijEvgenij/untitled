package MyTest;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static MyTest.Frame.getBall;
import static MyTest.Frame.getFrame;
import static MyTest.Frame.ten;

public class Vop_9 extends AbstractQuestion_3 {

    public Vop_9() {
        super(9, "<html>Вопрос 9. Характеризуя функции ТСО установите соответствие между наименованием функции ТСО и ее характеристикой</html>",
                "коммуникативная", "управленческая", "кумулятивная", "научно-исследовательская",
                "<html>предполагает хранение, документализацию и систематизацию учебной и учебно-методической информации, что осуществляется через комплектование и создание фоно- и видеотек, накопление, сохранение и передачу информации с помощью современных информационных технологи</html>",
                "<html>предполагает подготовку учащихся к выполнению заданий и организацию их выполнения (отбор, систематизация, упорядочивание информации), получение обратной связи в процессе восприятия и усвоения информации и коррекцию этих процессов</html>",
                "<html>связана с преобразованием получаемой с помощью ТСО информации учащимися с исследовательской целью и с поиском вариантов использования технических средств обучения и воспитания педагогом, моделированием содержания и форм подачи информации</html>",
                "<html>функция передачи информации</html>");


        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                  g1 = option.getSelectedIndex();
                 g2 = option2.getSelectedIndex();
                 g3 = option3.getSelectedIndex();
                 g4 = option4.getSelectedIndex();

                if (g1 == g2 || g1 == g3 || g1 == g4|| g2 == g3 || g2 ==g4 || g3 == g4) {
                    JOptionPane.showMessageDialog(Vop_9.this, "Врианты ответов не могут повторяться!"); } else {

                    if (g1 == 2 && g2 == 1 && g3 == 3 && g4 == 0) {
                        getBall(4);
                    }

                    getFrame(ten);

                }


            }

        });


    }
}
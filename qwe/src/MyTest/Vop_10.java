package MyTest;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static MyTest.Frame.getBall;
import static MyTest.Frame.getFrame;

public class Vop_10 extends AbstractQuestion_3 {

    public Vop_10() {
        super(10, "<html>Вопрос 10. Характеризуя сущность проектции установите соответствие</html>",
                "диаскопическая проекция", "эпископическая проекция ", "Стереоскопическая ", "Голографическая ",
                "<html>обеспечивает получение объемного изображения объекта</html>",
                "<html>изображение на экране создается световыми лучами, отражаемыми и рассеиваемыми непрозрачными источниками информации. Плоская проекция обеспечивает получение двухмерного изображения соответствующего объекта</html>",
                "<html>изображение на экране создается световыми лучами, проходящими сквозь прозрачный носитель информации</html>",
                "<html>обеспечивает получение изображения, создающего иллюзию объемности объекта, пространственности наблюдаемой картины</html>");

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                  g1 = option.getSelectedIndex();
                 g2 = option2.getSelectedIndex();
                 g3 = option3.getSelectedIndex();
                 g4 = option4.getSelectedIndex();

                if (g1 == g2 || g1 == g3 || g1 == g4|| g2 == g3 || g2 ==g4 || g3 == g4) {
                    JOptionPane.showMessageDialog(Vop_10.this, "Врианты ответов не могут повторяться! ");} else {
                    if (g1 == 3 && g2 == 1 && g3 == 0 && g4 == 2) {
                        getBall(4);
                    }

                    getFrame(new FinalPanel());

                }


            }

        });


    }
}

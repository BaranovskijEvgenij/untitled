package MyTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static MyTest.Frame.getBall;
import static MyTest.Frame.getFrame;
import static MyTest.Frame.nine;

public class Vop_8 extends AbstractQuestion_3 {

    public Vop_8() {
        super(8, "<html>Вопрос 8. К средствам обучения предъявляют разносторонние требования: функциональные, педагогические, эргономические, эстетические. Установите соответствие между наименованием требования и его характеристикой.</html>",
                "Функциональные", "Педагогические", "Эргономические", "Эстетические",
                "<html>соответствие  возможностей технического средства тем формам и методам учебно-воспитательного процесса, которые согласуются с современными требованиями</html>",
                "<html>гармония формы (наглядное выражение назначения, масштаб, соразмерность); целостность композиции, товарный вид</html>",
                "<html>удобство и безопасность эксплуатации; минимальное количество операций при подготовке и работе с аппаратом; уровень шума; удобство осмотра, ремонта, транспортирования</html> ",
                "<html>способность аппаратуры обеспечивать необходимые режимы работы (громкость и качество звучания; вместимость кассет аудиовизуальных средств, достаточная для проведения занятия с минимумом перезарядок; универсальность прибора).</html>");


        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                 g1 = option.getSelectedIndex();
                g2 = option2.getSelectedIndex();
                g3 = option3.getSelectedIndex();
                g4 = option4.getSelectedIndex();






               if (g1 == g2 || g1 == g3 || g1 == g4|| g2 == g3 || g2 ==g4 || g3 == g4) {
                    JOptionPane.showMessageDialog(Vop_8.this, "Врианты ответов не могут повторяться!");} else {

                    if (g1 == 1 && g2 == 2 && g3 == 3 && g4 == 0  ) {
                        getBall(4);
                    }


                    getFrame(nine);

                }


            }

        });


    }
}

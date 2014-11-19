package MyTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static MyTest.Frame.*;


public class Vop_1 extends AbstractQuestion {

    public Vop_1() {
        super(1, "<html>Вопрос 1. Какое из предложеных устройств относятся к аудиальным (звуковым) средствам обучения?</html>",
                "проектор", "магнитофон", "микрофон", "монитор"
        );
gran();

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!option.isSelected() && !option2.isSelected() && !option3.isSelected() && !option4.isSelected()) {
                    JOptionPane.showMessageDialog(Vop_1.this, "Сделайте выбор");} else {

                    if (!option.isSelected() && option2.isSelected() && !option3.isSelected() && !option4.isSelected()) {
                        getBall(1);
                    } else {
                        getWrong("1,");
                    }


                    getFrame(two);


                }
            }

        });


    }


}

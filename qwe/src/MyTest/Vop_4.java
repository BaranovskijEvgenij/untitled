package MyTest;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static MyTest.Frame.*;

public class Vop_4 extends AbstractQuestion {

    public Vop_4() {
        super(4, "<html>Вопрос 4. Укажите, что из перечисленного не относится к числу статических экранных средств обучения и воспитания :</html>",
                "кинофильм", "диапозитивы", "диафильмы", "эпиобъекты");
        gran();
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!option.isSelected() && !option2.isSelected() && !option3.isSelected() && !option4.isSelected()) {
                    JOptionPane.showMessageDialog(Vop_4.this, "Сделайте выбор");} else {

                    if (option.isSelected() && !option2.isSelected() && !option3.isSelected() && !option4.isSelected()) {
                        getBall(2);
                    } else {
                        getWrong("4,");
                    }


                    getFrame(five);


                }
            }

        });
    }
}

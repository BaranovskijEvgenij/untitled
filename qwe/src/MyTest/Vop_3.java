package MyTest;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static MyTest.Frame.*;

public class Vop_3 extends AbstractQuestion {

    public Vop_3() {
        super(3, "Вопрос 3. Аудиальные средства обучения позволяют (выберите правильный вариант ответа):",
                "получить точное представление о внешнем виде изучаемого объекта",
                "получить точное представление о звуковых особенностях изучаемого объекта",
                "исследовать изобразительные возможности текстового редактора",
                "улучшить мелкую моторику у учащихся");
        gran();
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!option.isSelected() && !option2.isSelected() && !option3.isSelected() && !option4.isSelected()) {
                    JOptionPane.showMessageDialog(Vop_3.this, "Сделайте выбор");} else {

                    if (!option.isSelected() && option2.isSelected() && !option3.isSelected() && !option4.isSelected()) {
                        getBall(2);
                    } else {
                        getWrong("3,");
                    }


                    getFrame(four);


                }
            }

        });

    }
}

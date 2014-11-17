package MyTest;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static MyTest.Frame.getBall;
import static MyTest.Frame.getFrame;
import static MyTest.Frame.three;

public class Vop_2 extends AbstractQuestion {

    public Vop_2() {


        super(2, "Для каких видов организации обучения характерно использование аудиооборудования?",
                "конференция", "семинар (для учащихся с генетическим нарушением зрения)", "тренинги",
                "мастер-класс (для учащихся с генетическим нарушением слуха)");


        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!option.isSelected() && !option2.isSelected() && !option3.isSelected() && !option4.isSelected()) {
                    JOptionPane.showMessageDialog(Vop_2.this, "Сделайте выбор");
                } else {



                    if (option.isSelected() && option2.isSelected() && option3.isSelected() && !option4.isSelected()) {
                        getBall(2);
                    }


                    getFrame(three);


                }
           }

        });


    }

}

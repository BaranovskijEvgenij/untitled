package MyTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static MyTest.Frame.getBall;
import static MyTest.Frame.getFrame;
import static MyTest.Frame.seven;


public class Vop_6 extends AbstractQuestion_2 {
    public Vop_6() {
        super(6, "На рисунке изображен :", "диапозитив", "эпископ", "филомоско", "слайд");

        remove(icon);
        icon = createIcon(new ImageIcon("C:\\Users\\fredy\\Desktop\\Курсовая ТСО\\13.gif"));
        add(icon);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!option.isSelected() && !option2.isSelected() && !option3.isSelected() && !option4.isSelected()) {
                    JOptionPane.showMessageDialog(Vop_6.this, "Сделайте выбор");} else {

                    if (option2.isSelected()) {
                        getBall(3);
                    }


                    getFrame(seven);


                }
            }

        });


    }


}

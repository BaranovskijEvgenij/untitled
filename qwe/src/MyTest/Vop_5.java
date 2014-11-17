package MyTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static MyTest.Frame.getBall;
import static MyTest.Frame.getFrame;
import static MyTest.Frame.six;


public class Vop_5 extends AbstractQuestion_2 {


    public Vop_5() {
        super(5, "На рисунке изображен :", "диапроектрор", "Графопроектор", "Телевизор", "документ-камера");

        icon = createIcon(new ImageIcon("C:\\Users\\fredy\\Desktop\\Курсовая ТСО\\45.gif"));
        add(icon);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!option.isSelected() && !option2.isSelected() && !option3.isSelected() && !option4.isSelected()) {
                    JOptionPane.showMessageDialog(Vop_5.this, "Сделайте выбор");} else {

                    if (option.isSelected()) {
                        getBall(3);
                    }


                    getFrame(six);


                }
            }

        });


    }


}

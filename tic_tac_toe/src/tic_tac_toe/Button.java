package tic_tac_toe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Button extends JButton {

    private int index;  // у каждой кнопки свой индекс
    private Logic logic;
    private MyFrame myFrame;

    public Button (int index, int x, int y, Logic logic, MyFrame myFrame ) {
        this.index = index;
        this.logic = logic;
        this.myFrame = myFrame;

        this.setBounds(x*150, y*150, 150,150);
        this.addActionListener(new MyKeyAdapter());
    }



    private class MyKeyAdapter implements ActionListener{  //реализатор индекса
        @Override
        public void actionPerformed(ActionEvent e) {

                logic.positionUser(index);
                myFrame.update();

                logic.positionPC();
                myFrame.update();

            }
        }
    }



package tic_tac_toe;

import javax.swing.*;


public class MyFrame extends JFrame {
    public Logic logic = new Logic();
    public JButton[] buttons = new JButton[logic.length];

    public MyFrame () {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //завершает работу фрейма
        this.setSize(500,500);
        this.setResizable(false);  // можно изменять размер интерфейса
        this.setLocationRelativeTo(null);  //размещает по середине

        JPanel panel = new JPanel(); // здесь располагаются кнопки
        panel.setLayout(null);
        this.add(panel);

        int index = 0;
        for (int y = 0; y < 3; y++) {  //определение какая из кнопок
            for (int x = 0; x < 3; x++) {
                panel.add(buttons[index] = new Button(index,x,y,logic,this));
                index++;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                new MyFrame();
            }
        });
    }
    public void update() {
        for (int i = 0; i < buttons.length; i++) {
            buttons [i].setText(logic.array[i]);
        }
    }
}

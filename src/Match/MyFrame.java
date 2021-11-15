package Match;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
    private int AC = 0;
    private int RM = 0;
    private String text = "Result: 0 X 0";
    private String text1 = "Result: ";
    private String text2 = "Last Scorer: \n";

    MyFrame(int x, int y) {

        setTitle("Milan vs Madrid"); //название окна
        setBounds(x, y, 300, 200); //положение и размеры окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); //окно фиксированных размеров

        setLayout(null); //отключение менеджера компоновки для окна
        Font f = new Font(Font.DIALOG, Font.BOLD | Font.HANGING_BASELINE, 14); //создание объекта шрифта
        setFont(f); //применение шрифта для окна
        JPanel P = new JPanel(); //создание панели
        P.setBounds(10, 10, 265, 90); //положение и размеры окна
        P.setBackground(Color.LIGHT_GRAY); //цвет фона для панели
        P.setLayout(new BorderLayout()); //определение менеджера компоновки для панели
        add(P); //добавление панели в окно

        JLabel L = new JLabel(text); //создание метки
        JLabel l = new JLabel(text2); //создание метки

        l.setHorizontalAlignment(JLabel.CENTER); //выравнивание метки по центру
        l.setForeground(Color.RED); //цвет для шрифта метки
        l.setFont(f); //применение шрифта для метки
        P.add(l, BorderLayout.BEFORE_FIRST_LINE); //добавление метки на панель

        L.setHorizontalAlignment(JLabel.CENTER);//выравнивание метки по центру
        L.setForeground(Color.RED); //цвет для шрифта метки
        L.setFont(f); //применение шрифта для метки
        P.add(L, BorderLayout.CENTER); //добавление метки на панель

        JButton A = new JButton("AC Milan"); //создание кнопки А
        A.setBounds(20, 130, 120, 30); //размеры и расположение кнопки А
        A.setFont(f); //установка шрифта для кнопки А
        A.addActionListener(new ActionListener() { //добавление обработчика для окна
            public void actionPerformed(ActionEvent ae) {
                AC++;
                L.setText(text1 + AC + " X " + RM);
                l.setText(text2 + " AC Milan");
            }
        });
        add(A); //добавление кнопки в окно

        JButton B = new JButton("Real Madrid"); //создание кнопки В
        B.setBounds(140, 130, 120, 30); //размеры и расположение кнопки В
        B.setFont(f); //установка шрифта для кнопки В
        B.addActionListener(new ActionListener() { //добавление обработчика для окна
            public void actionPerformed(ActionEvent ae) {
                RM++;
                L.setText(text1 + AC + " X " + RM);
                l.setText(text2 + " Real Madrid");
            }
        });
        add(B); //добавление кнопки в окно

        JLabel p = new JLabel(); //создание метки
        p.setHorizontalAlignment(JLabel.CENTER); //выравнивание метки  по центру
        p.setForeground(Color.BLUE); //установка цвета на метку
        p.setFont(f); //установка шрифта на метку
        P.add(L, BorderLayout.CENTER); //добавление метки на панель

        JButton C = new JButton("End"); //создание кнопки С
        C.setBounds(110, 100, 70, 30); //размеры и расположение кнопки С
        C.setFont(f); //установка шрифта для кнопки С
        C.addActionListener(new ActionListener() { //добавление обработчика для окна
            public void actionPerformed(ActionEvent ae) {
                A.setEnabled(false); //блокировка кнопки А
                B.setEnabled(false); //блокировка кнопки В
                if (AC > RM)
                    L.setText("Winner: AC Milan");
                else if (RM > AC)
                    L.setText("Winner: Real Madrid");
                else
                    L.setText("No winners");
            }

        });
        add(C); //добавление кнопки С на панель

        setVisible(true); //отображение окна
    }
}

package com.company;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Football extends JFrame {
    int x = 0, y = 0;

    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");

    JLabel lab1 = new JLabel("Result: " + x + " X " + y);
    JLabel lab2 = new JLabel("Last Scorer: N/A");
    JLabel lab3 = new JLabel("Winner: DRAW");

    public Football(){
        setLayout(null);
        setSize(500, 500);
        but1.setBounds(10, 235, 150, 20);
        add(but1);
        but2.setBounds(330, 235, 150, 20);
        add(but2);
        lab1.setBounds(210, 235, 150, 20);
        add(lab1);
        lab2.setBounds(200, 10, 150, 20);
        add(lab2);
        lab3.setBounds(205, 400, 150, 20);
        add(lab3);

        but1.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){}
            public void mousePressed(MouseEvent e){
                x += 1;
                lab1.setText("Result: " + x + " X " + y);
                if (x > y){
                    lab3.setText("Winner: AC Milan");
                }
                if (x < y){
                    lab3.setText("Winner: Real Madrid");
                }
                if (x == y){
                    lab3.setText("Winner: DRAW");
                }
                lab2.setText("Last Scorer: AC Milan");
            }
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){
            }
        });
        but2.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){}
            public void mousePressed(MouseEvent e){
                y += 1;
                lab1.setText("Result: " + x + " X " + y);
                if (x > y){
                    lab3.setText("Winner: AC Milan");
                }
                if (x < y){
                    lab3.setText("Winner: Real Madrid");
                }
                if (x == y){
                    lab3.setText("Winner: DRAW");
                }
                lab2.setText("Last Scorer: Real Madrid");
            }
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){
            }
        });
    }

    public static void main(String[]args)
    {
        new Football().setVisible(true);
    }
}
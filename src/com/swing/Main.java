package com.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);

        //добавляет панель
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);


        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        jFrame.setBounds(600, 300, dimension.width / 2 - 250, dimension.height / 2 - 150);
        jFrame.setTitle("My First Desktop App");
        jFrame.getContentPane().setBackground(Color.decode("#393939"));

        //добавляет кнопку
        JButton jButton1 = new JButton("Gray");
        jPanel.add(jButton1);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //код для кнопки
                jPanel.setBackground(Color.DARK_GRAY);
            }
        });

        JButton jButton2 = new JButton("Yellow");
        jPanel.add(jButton2);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //код для кнопки
                jPanel.setBackground(Color.YELLOW);
            }
        });

        JButton jButton3 = new JButton("Yellow");
        jPanel.add(jButton3);
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //код для кнопки
                jPanel.setBackground(Color.RED);
            }
        });

    }
}

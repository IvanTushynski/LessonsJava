package com.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        jFrame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(600, 300, dimension.width / 2 - 250, dimension.height / 2 - 150);

        JButton jButton = new JButton("Submit1");
        jPanel.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //меняет текст при нажатии кнопки
                jFrame.setTitle(((JButton)e.getSource()).getText());
            }
        });


        JButton jButton1 = new JButton("Submit2");
        jPanel.add(jButton1);
        //меняет текст при нажатии кнопки
        jButton1.addActionListener(java.beans.EventHandler.create(ActionListener.class, jFrame, "title", "source.text"));
    }
}

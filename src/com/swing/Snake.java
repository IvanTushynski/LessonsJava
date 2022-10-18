package com.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snake {

   public static void main(String[] args) {

      JFrame frame = new JFrame(); // Создайте каркас для игрового интерфейса
      frame.setBounds(10, 10, 900, 720); //  Установите размер рамки
       frame.setResizable(false); //  Установите размер кадра, чтобы он не менялся
     //  Нажмите кнопку закрытия, чтобы закрыть интерфейс игры.
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     SnakePanel panel = new SnakePanel();  //Добавить холст
       frame.add(panel); //  Невозможно увидеть, когда холст пуст, когда только что добавлен

       frame.setVisible(true); //  Разрешить отображение игрового интерфейса
  }
 }

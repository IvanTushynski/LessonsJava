package com.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SnakePanel extends JPanel implements KeyListener, ActionListener {

    //  Определите семь переменных изображения, представляющих семь изображений
    ImageIcon up = new ImageIcon("up.png"); //  Змея голова вверх
    ImageIcon down = new ImageIcon("down.png"); //  Змея голова опущена
    ImageIcon left = new ImageIcon("left.png"); //  Змея голова налево
    ImageIcon right = new ImageIcon("right.png"); //  Змея голова направо
    ImageIcon food = new ImageIcon("food.png");  //  еда
    ImageIcon body = new ImageIcon("body.png");  //  Тело змеи
    ImageIcon title = new ImageIcon("title.jpg"); //  Тема игрового интерфейса

    //  Каждая часть змеи
    int[] snakex = new int[750];
    int[] snakey = new int[750];

    //  Произвольно генерировать еду
    Random rand = new Random();
    int foodx = rand.nextInt(34) * 25 + 25; //Значение здесь определяется в зависимости от размера игрового интерфейса, созданного вами.
    int foody = rand.nextInt(24) * 25 + 75;

    //  Установите свойства игры по умолчанию
    int len = 3;
    int score = 0;
    String direction = "R"; //  U вверх D вниз L влево R вправо

    boolean isStarted = false; //  Определите, началась ли игра
    boolean isFailed = false; //  Определите, окончена ли игра

    Timer timer = new Timer(100, this); //  ActionPerformed вызывается каждые 100 миллисекунд


    public SnakePanel() { //  Конструктор для создания холста
        this.setFocusable(true);  //  Сосредоточьтесь
        this.addKeyListener(this); //  Слушайте события клавиатуры
        setup();
        timer.start();
    }

    public void paint(Graphics g) { //  Графическая кисть

        this.setBackground(Color.BLACK); //  Установите цвет фона холста
        title.paintIcon(this, g, 25, 11);//  Разместить изображение темы
        g.fillRect(25, 75, 850, 650); //  Установите игровую коробку с кистью

        //  Нарисуйте голову змеи (обратите внимание на направление головы змеи)
        if (direction.equals("R"))
            right.paintIcon(this, g, snakex[0], snakey[0]);
        else if (direction.equals("L"))
            left.paintIcon(this, g, snakex[0], snakey[0]);
        else if (direction.equals("U"))
            up.paintIcon(this, g, snakex[0], snakey[0]);
        else if (direction.equals("D"))
            down.paintIcon(this, g, snakex[0], snakey[0]);

        //  Рисуем тело змеи
        for (int i = 1; i < len; i++)
            body.paintIcon(this, g, snakex[i], snakey[i]);

        //  Определите, не запускается ли игра. . .
        if (!isStarted) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("arial", Font.BOLD, 30));
            g.drawString("Press Space to start / pause", 200, 300);
        }

        //  Оценивается, окончена ли игра, и отображается. . .
        if (isFailed) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("arial", Font.BOLD, 30));
            g.drawString("Game Over ! Press space to restart", 200, 300);
        }

        //  Показать еду
        food.paintIcon(this, g, foodx, foody);

        //  Установите счет и длину змеи
        g.setColor(Color.WHITE);
        g.setFont(new Font("arial", Font.PLAIN, 15));
        g.drawString("Score : " + score, 650, 37);
        g.drawString("Len :" + len, 650, 57);
    }

    public void setup() { //  Инициализация игры
        isStarted = false;
        isFailed = false;
        len = 3;
        score = 0;
        snakex[0] = 100;
        snakex[1] = 75;
        snakex[2] = 50;
        snakey[0] = 100;
        snakey[1] = 100;
        snakey[2] = 100;
    }

    @Override
    public void keyPressed(KeyEvent e) {

        //Реализовать реакцию клавиатуры
        int KeyCode = e.getKeyCode();
        if (KeyCode == KeyEvent.VK_SPACE) { //  Коснитесь пробела, чтобы отобразить / удалить сообщение с подсказкой
            if (isFailed) {
                //                isStarted = false;  //  Вы можете поместить эти две строки в setup
                //                isFailed = false;
                setup();
            } else
                isStarted = !isStarted;
        } else if (KeyCode == KeyEvent.VK_UP && direction != "D")
            direction = "U";
        else if (KeyCode == KeyEvent.VK_DOWN && direction != "U")
            direction = "D";
        else if (KeyCode == KeyEvent.VK_RIGHT && direction != "L")
            direction = "R";
        else if (KeyCode == KeyEvent.VK_LEFT && direction != "R")
            direction = "L";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //  1. Определите другой будильник.
        timer.start();

        //  2. Мобильные данные
        if (isStarted && !isFailed) {
            //  Двигай телом
            for (int i = len; i > 0; i--) {
                snakex[i] = snakex[i - 1];
                snakey[i] = snakey[i - 1];
            }
            //  Движущаяся голова
            if (direction.equals("R")) {
                snakex[0] = snakex[0] + 25;
                if (snakex[0] > 850) snakex[0] = 25;
            } else if (direction.equals("L")) {
                snakex[0] = snakex[0] - 25;
                if (snakex[0] < 25) snakex[0] = 850;
            } else if (direction.equals("U")) {
                snakey[0] = snakey[0] - 25;
                if (snakey[0] < 75) snakey[0] = 650;
            } else if (direction.equals("D")) {
                snakey[0] = snakey[0] + 25;
                if (snakey[0] > 650) snakey[0] = 75;
            }

            if (snakex[0] == foodx && snakey[0] == foody) {  //  Есть еду
                len++;
                score++;
                foodx = rand.nextInt(34) * 25 + 25;
                foody = rand.nextInt(24) * 25 + 75;
            }

            for (int i = 1; i < len; i++) {  //  Если голова змеи касается его тела, игра окончена.
                if (snakex[0] == snakex[i] && snakey[0] == snakey[i]) {
                    isFailed = true;
                }
            }

        }
        // 3. repaint（）
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

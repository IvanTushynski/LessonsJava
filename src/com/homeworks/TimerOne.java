package com.homeworks;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerOne {
    public static void main(String[] args) {
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("task : " + new Date());
            }
        };
        Timer timer = new Timer();
        long delay = 4000;
        long period = 4000;
        timer.scheduleAtFixedRate(task, delay, period);
    }
}

   /*
    вышеприведенный код, в секции TimerTask.run() выполнится 1 раз через 1000мс

        Если вам надо повторяющееся действие, с постоянной задержкой, необходимо у таймера вызывать

        long peroid = 1000L;
        timer.schedule (task, delay, peroid);

        Если вам надо повторяющееся действие, с постоянной частотой, то для этого существует метод

        long peroid = 1000L;
        timer.scheduleAtFixedRate (task, delay, peroid);

        Если Вам нужен таймер в Swing GUI потоке, то на этот случай тоже есть специальный класс javax.swing.Timer

        int delay = 1000;
        ActionListener listener = new AbstractAction() {
@Override
public void actionPerformed(ActionEvent e) {
        System.out.println("task : " + new Date());
        }
        };
        Timer timer = new Timer(delay, listener);
        timer.start();
        Чтобы операция повторялась необходимо добавить

        timer.setRepeats(true);
        */

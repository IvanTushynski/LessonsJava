package com.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Image;

public class JComponents {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        //jFrame.setSize(800,600);
        //jFrame.setLocation(500,200);
        jFrame.setBounds(600, 300, dimension.width / 2 - 250, dimension.height / 2 - 150);
        jFrame.setTitle("My First Desktop App");
        jFrame.getContentPane().setBackground(Color.decode("#393939"));

        //String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        //for (String s : fonts) {
        //    System.out.println(s);
        //}
        jFrame.add(new myComponent());
    }



    // что бы рисовать
    public static class myComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Calibri", Font.BOLD, 30);
            Graphics2D g2 = (Graphics2D) g;

            Image image = new ImageIcon("img/2.png").getImage();
            g2.drawImage(image,10,0,null);

            g2.setPaint(new Color(200,200,100));

            g2.setFont(font);
            g2.drawString("Hi!!! This Is My First App!", 100, 200);
            Point2D p1 = new Point2D.Double(70, 0);
            Point2D p2 = new Point2D.Double(70,3000);
            Line2D l2 = new Line2D.Double(p1,p2);
            g2.draw(l2);
            Line2D l21 = new Line2D.Double(60,0,60,3000);
            g2.draw(l21);
            Line2D l22 = new Line2D.Double(50,0,50,3000);
            g2.draw(l22);
            Line2D l23 = new Line2D.Double(40,0,40,3000);
            g2.draw(l23);

            Ellipse2D l1 = new Ellipse2D.Double(450,100,150,150);
            g2.draw(l1);
            g2.fill(l1);
        }

    }
}


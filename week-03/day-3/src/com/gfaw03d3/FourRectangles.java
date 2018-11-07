package com.gfaw03d3;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        Random n = new Random();


        for (int i = 0; i < 4; i++) {
            int xPoint = (int)(Math.random() * (WIDTH));
            int yPoint = (int)(Math.random() * (HEIGHT));

            int wRect = (int)(Math.random() * (WIDTH - xPoint));
            int hRect = (int)(Math.random() * (HEIGHT - yPoint));

            graphics.setColor(new Color(n.nextInt(256), n.nextInt(256), n.nextInt(256)));
            graphics.fillRect(xPoint, yPoint, wRect, hRect);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

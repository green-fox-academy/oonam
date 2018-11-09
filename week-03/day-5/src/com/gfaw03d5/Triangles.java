package com.gfaw03d5;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        int rows = 10;

        int sideTriangle = 20;
        double heightTriangle = sideTriangle * 0.866;

        int xPeakOfTriangle = WIDTH / 2;
        int yPeakOfTriangle = 0;

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i; j++) {
                drawTriangle(graphics, xPeakOfTriangle, yPeakOfTriangle, sideTriangle, heightTriangle);
                xPeakOfTriangle += sideTriangle;
            }
            xPeakOfTriangle -= ((sideTriangle * i) + (sideTriangle / 2));
            yPeakOfTriangle += heightTriangle;
        }
    }

    public static void drawTriangle(Graphics graphics, int x, int y, int side, double height) {
        graphics.drawLine(x, y, x + (side / 2), y + (int)height);
        graphics.drawLine(x, y, x - (side / 2), y + (int)height);
        graphics.drawLine(x - (side / 2), y + (int)height, x + (side / 2), y + (int)height);
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

package com.gfaw03d3;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] box = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] lines = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

        graphics.setColor(Color.GREEN);

        connectLines(box, graphics);

        int boxLastRow = box.length - 1;
        graphics.drawLine(box[boxLastRow][0], box[boxLastRow][1], box[0][0], box[0][1]);

        connectLines(lines, graphics);
    }

    public static void connectLines(int[][] newArray, Graphics graphics) {
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray[0].length - 1; j++) {
                graphics.drawLine(newArray[i][j], newArray[i][j + 1], newArray[i + 1][j], newArray[i + 1][j + 1]);
            }
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
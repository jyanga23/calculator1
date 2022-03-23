package com.company;


import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new CalculatorPanel();

        //panel.setPreferredSize(new Dimension(275, 50));
        // panel.setBackground(new Color(255, 138, 19));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
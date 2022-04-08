package com.company;

import javax.swing.*;

public class Calculator extends JFrame {
    CalculatorView view;

    public Calculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        view = new CalculatorView();
        add(view);

        pack();
        setVisible(true);
    }
}

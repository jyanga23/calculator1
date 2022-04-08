package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.management.OperatingSystemMXBean;

public class CalculatorView extends JPanel{
    JTextField display;
    JPanel nums;
    JPanel operators;
    NumListener numListener;
    OperatorListener operatorListener;
    CalculatorController controller;

    public CalculatorView() {
        initializeComponents();
    }

    private void initializeComponents() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        display = new JTextField(16);
        nums = new JPanel();
        operators = new JPanel();
        numListener = new NumListener();
        operatorListener = new OperatorListener();
        controller = new CalculatorController(this);


        for (int i=1; i<10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(numListener);
            nums.add(btn);
        }
        nums.setLayout(new GridLayout(4,3));

        JButton[] operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");
        for (int i=0; i<4; i++) {
            operatorButtons[i].addActionListener(operatorListener);
            operators.add(operatorButtons[i]);
        }

        add(display);
        add(nums);
        add(operators);
    }

    public void setDisplay(int currVal) {
        display.setText(String.valueOf(currVal));
    }

    private void setController(CalculatorController controller) {
        this.controller = controller;
    }

    private class NumListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();
            switch (input) {
                case "0" : controller.numClick(0); break;
                case "1" : controller.numClick(1); break;
                case "2" : controller.numClick(2); break;
                case "3" : controller.numClick(3); break;
                case "4" : controller.numClick(4); break;
                case "5" : controller.numClick(5); break;
                case "6" : controller.numClick(6); break;
                case "7" : controller.numClick(7); break;
                case "8" : controller.numClick(8); break;
                case "9" : controller.numClick(9); break;
            }
        }
    }

    private class OperatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();
            switch (input) {
                case "+" : controller.operatorClick("+"); break;
                case "-" : controller.operatorClick("-"); break;
                case "*" : controller.operatorClick("*"); break;
                case "/" : controller.operatorClick("/"); break;
            }
        }
    }
}

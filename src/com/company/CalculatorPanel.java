package com.company;

import javax.swing.*;
import java.awt.*;

public class CalculatorPanel extends JPanel {
    JPanel nums;
    JPanel operators;

    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton zero;

    private JButton add;
    private JButton subtract;
    private JButton multiply;
    private JButton divide;

    public CalculatorPanel() {
        nums = new JPanel();
        nums.setPreferredSize(new Dimension(250, 175));

        operators = new JPanel();
        operators.setPreferredSize(new Dimension(75, 175));


        one = new JButton("1");
        nums.add(one);

        two = new JButton("2");
        nums.add(two);

        three = new JButton("3");
        nums.add(three);

        four = new JButton("4");
        nums.add(four);

        five = new JButton("5");
        nums.add(five);

        six = new JButton("6");
        nums.add(six);

        seven = new JButton("7");
        nums.add(seven);

        eight = new JButton("8");
        nums.add(eight);

        nine = new JButton("9");
        nums.add(nine);

        zero = new JButton("0");
        nums.add(zero);



        add = new JButton("+");
        operators.add(add);

        subtract = new JButton("-");
        operators.add(subtract);

        multiply = new JButton("*");
        operators.add(multiply);

        divide = new JButton("/");
        operators.add(divide);

        add(nums);
        add(operators);
    }
}

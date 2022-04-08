package com.company;

import javax.swing.*;

public class CalculatorController {
    CalculatorView view;
    CalculatorModel model;

    public CalculatorController(CalculatorView view) {
        this.view = view;
        model = new CalculatorModel();
    }

    public void numClick(int num) {
        int currVal  = model.processNum(num);
        view.setDisplay(currVal);
    }

    public void operatorClick(String operation) {
        model.setMode(operation);
    }


}

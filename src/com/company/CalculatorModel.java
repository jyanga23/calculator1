package com.company;

public class CalculatorModel {
    int currentVal;
    String mode;

    public CalculatorModel() {
        currentVal = 0;
        mode = null;
    }

    public int processNum(int num) {
        if (mode == null) {
            currentVal = num;
            return currentVal;
        }

        if (mode.equals("+"))
            add(num);

        if (mode.equals("-"))
            subtract(num);

        if (mode.equals("*"))
            multiply(num);

        if (mode.equals("/"))
            divide(num);

        /*
        switch (mode) {
            case null : currentVal = num; break;
            case "+" : return add(num); break;
            case "-" : return subtract(num); break;
            case "*" : return multiply(num); break;
            case "/" : return divide(num); break;
        }
         */
        return currentVal;
    }

    public void setMode(String operator) {
        mode = operator;
    }

    private void add(int num) {
        currentVal += num;
    }

    private void subtract(int num) {
        currentVal -= num;
    }

    private void multiply(int num) {
        currentVal *= num;
    }

    private void divide(int num) {
        currentVal /= num;
    }
}

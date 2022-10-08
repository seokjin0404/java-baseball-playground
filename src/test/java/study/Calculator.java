package study;

public class Calculator {
    private String[] values;
    private int lastNumber;

    private void setValue(String value) {
        values = value.split(" ");
        lastNumber = Integer.parseInt(values[0]);
    }

    public int calculate(String value) {
        setValue(value);
        for (int i=1; i<values.length; i+=2) {
            operate(i);
        }
        return lastNumber;
    }

    private void operate(int index) {
        String operator = values[index];
        int calNumber = Integer.parseInt(values[index+1]);
        if (operator == "+")
            lastNumber = add(lastNumber, calNumber);
        else if (operator == "-")
            lastNumber = subtract(lastNumber, calNumber);
        else if (operator == "*")
            lastNumber = multiply(lastNumber, calNumber);
        else if (operator == "/")
            lastNumber = divide(lastNumber, calNumber);
    }

    private int add(int a, int b) {
        return a+b;
    }

    private int subtract(int a, int b) {
        return a-b;
    }

    private int multiply(int a, int b) {
        return a*b;
    }

    private int divide(int a, int b) {
        return a/b;
    }
}

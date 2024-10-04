import javax.swing.*;
import java.util.ArrayList;

public class Calculator {
    public ArrayList<String> calculations = new ArrayList<>();
    public JTextField panel;

    public String calculate() {
        ArrayList<String> operators = structureCalculation(calculations);
        if (operators.size() == 1) {
            return operators.getFirst();
        }
        double number3 = 0;
        try {
            for (int i = 0; i < operators.size() - 2; i += 2) {
                double number1 = Double.parseDouble(operators.get(i));
                String operator = operators.get(i + 1);
                double number2 = Double.parseDouble(operators.get(i + 2));
                if (i > 0) {
                    number1 = number3;
                }
                number3 = applyOperator(number1, number2, operator);
                number1 = number2;
                number2 = number3;
            }
        } catch (NumberFormatException e) {
            return "ERROR";
        }
        return Double.toString(Math.round(number3));
    }

    public void modulateCalculation(String operator) {
        calculations.add(operator);
    }

    public void modulateCalculation(String operator, int clear) {
        calculations.add(operator);
        if (clear == 1 && calculations.size() > 1) {
            calculations.removeLast();
            calculations.removeLast();
        }
        if (clear == 2) {
            calculations.clear();
        }
    }

    public void showCalculation(JTextField panel) {
        panel.setText(String.join("", calculations));
        System.out.println(String.join("", calculations) + " = " + calculate()); //DEBUG
    }

    private double applyOperator(double a, double b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }

    private static ArrayList<String> structureCalculation(ArrayList<String> operators) {
        ArrayList<String> structured = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < operators.size(); i++) {

            if (checkIfNumber(operators.get(i))) {
                temp.append(operators.get(i));
            } else {
                if (!temp.toString().isEmpty()) {
                    structured.add(temp.toString());
                }
                structured.add(operators.get(i));
                temp = new StringBuilder();
            }
            if (i == operators.size() - 1) {
                structured.add(temp.toString());
            }
        }
        return structured;
    }

    private static boolean checkIfNumber(String a) {
        if (a.equals(".")) {
            return true;
        }
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

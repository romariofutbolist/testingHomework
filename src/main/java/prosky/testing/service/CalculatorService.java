package prosky.testing.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements Calculator{
    public String helloController() {
        return "Добро пожаловать в калькулятор";
    }

    public String calculatorPlus(int num1, int num2) {
        return num1 + "+" + num2 + "=" + (num1+num2);
    }

    public String calculatorMinus(int num1, int num2) {
        return num1 + "-" + num2 + "=" + (num1-num2);
    }

    public String calculatorMultiply(int num1, int num2) {
        return formatResult(num1, "*", num2, Integer.toString(num1*num2));
    }

    public String calculatorDivide(int num1, int num2) {
        if (num2==0) {
            throw new IllegalArgumentException("Ошибка! На ноль делить нельзя!");
        }
        return formatResult(num1, "/", num2, Double.toString((double)num1/num2));
    }

    public String formatResult(int num1, String operation, int num2, String result) {
        return String.format("%s %s %s = %s", num1, operation, num2, result);
    }
}

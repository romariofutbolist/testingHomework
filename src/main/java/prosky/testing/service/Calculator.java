package prosky.testing.service;

public interface Calculator {
    String helloController();

    String calculatorPlus(int num1, int num2);

    String calculatorMinus(int num1, int num2);

    String calculatorMultiply(int num1, int num2);

    String calculatorDivide(int num1, int num2);

    String formatResult(int num1, String operation, int num2, String result);
}

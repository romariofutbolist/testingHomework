package prosky.testing.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService{
    public String helloController() {
        return "Добро пожаловать в калькулятор";
    }

    public Integer calculatorPlus(Integer num1, Integer num2) {
        int result = num1+num2;
        return result;
    }

    public Integer calculatorMinus(Integer num1, Integer num2) {
        return num1-num2;
    }

    public Integer calculatorMultiply(Integer num1, Integer num2) {
        return num1*num2;
    }

    public Integer calculatorDivide(Integer num1, Integer num2) {
        if (num2==0) {
            throw new IllegalArgumentException("Ошибка! На ноль делить нельзя!");
        }
        return num1/num2;
    }
}

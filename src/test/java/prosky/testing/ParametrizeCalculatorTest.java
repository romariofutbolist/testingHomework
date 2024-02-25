package prosky.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import prosky.testing.service.CalculatorService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParametrizeCalculatorTest {

    CalculatorService calculatorService = new CalculatorService();

    public static Stream<Arguments> provideParamOfTest() {
        return Stream.of(
                Arguments.of(1, 5),
                Arguments.of(0, 0),
                Arguments.of(1, -3),
                Arguments.of(-7, 5),
                Arguments.of(-4, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamOfTest")
    void TestPlus(Integer num1, Integer num2) {
        Assertions.assertEquals((num1+num2),calculatorService.calculatorPlus(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamOfTest")
    void TestMinus(Integer num1, Integer num2) {
        Assertions.assertEquals((num1-num2),calculatorService.calculatorMinus(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamOfTest")
    void TestMultiply(Integer num1, Integer num2) {
        Assertions.assertEquals((num1*num2),calculatorService.calculatorMultiply(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamOfTest")
    void TestDivide(Integer num1, Integer num2) {
        if(num2==0) {
            assertThrows(IllegalArgumentException.class, () -> calculatorService.calculatorDivide(num1,num2));
            return;
        }
        Assertions.assertEquals((num1/num2),calculatorService.calculatorDivide(num1,num2));
    }
}

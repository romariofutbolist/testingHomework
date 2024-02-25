package prosky.testing;

import org.junit.jupiter.api.Test;
import prosky.testing.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();
    @Test
    void Testplus() {
        assertEquals(6,calculatorService.calculatorPlus(1,5));
        assertEquals(0,calculatorService.calculatorPlus(0,0));
        assertEquals(-2,calculatorService.calculatorPlus(1,-3));
        assertEquals(-2,calculatorService.calculatorPlus(-7,5));
        assertEquals(-5,calculatorService.calculatorPlus(-4,-1));
    }
    @Test
    void TestMinus() {
        assertEquals(-4,calculatorService.calculatorMinus(1,5));
        assertEquals(0,calculatorService.calculatorMinus(0,0));
        assertEquals(4,calculatorService.calculatorMinus(1,-3));
        assertEquals(-12,calculatorService.calculatorMinus(-7,5));
        assertEquals(-3,calculatorService.calculatorMinus(-4,-1));
    }

    @Test
    void TestMultiply() {
        assertEquals(5,calculatorService.calculatorMultiply(1,5));
        assertEquals(0,calculatorService.calculatorMultiply(0,0));
        assertEquals(-3,calculatorService.calculatorMultiply(1,-3));
        assertEquals(-35,calculatorService.calculatorMultiply(-7,5));
        assertEquals(4,calculatorService.calculatorMultiply(-4,-1));
    }

    @Test
    void TestDivide() {
        assertEquals(0,calculatorService.calculatorDivide(1,2));
        assertEquals(0,calculatorService.calculatorDivide(1,-3));
        assertEquals(-1,calculatorService.calculatorDivide(-7,5));
        assertEquals(4,calculatorService.calculatorDivide(-4,-1));

        assertThrows(IllegalArgumentException.class, () -> calculatorService.calculatorDivide(0,0));
    }

}

package prosky.testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import prosky.testing.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
   private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello () {
        return calculatorService.helloController();
    }

    @GetMapping(path = "/plus")
    public String calculatorPlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String calculatorMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String calculatorMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculatorDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorDivide(num1, num2);
    }
}
package org.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator = new Calculator();
    int a = 5;
    int b = 0;

    @Test
    void addition() {
        Assertions.assertEquals(a + b, calculator.addition(a, b));
        System.out.println("addition");
    }

    @Test
    void subtraction() {
        Assertions.assertEquals(a - b, calculator.subtraction(a, b));
        System.out.println("soustraction");
    }

    @Test
    void multiplication() {
        Assertions.assertEquals(a * b, calculator.multiplication(a, b));
        System.out.println("multiplication");
    }

    @Test
    void subdivision() {
            Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
                calculator.subdivision(a, b);
            });
            Assertions.assertEquals("Division by 0 is not allowed", exception.getMessage());
    }
}
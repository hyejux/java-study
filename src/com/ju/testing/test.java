package com.ju.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ju.oop.classes.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    public class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }
    }


    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));  // 2 + 3 = 5 확인
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));  // 3 - 2 = 1 확인
    }
}

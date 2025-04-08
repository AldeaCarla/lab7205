package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class NewIntCalculatorTest {

    @Test
    void testAdd() {
        // Arrange
        NewIntCalculator calc = new NewIntCalculator(10);

        // Act
        calc.add(5);

        // Assert
        assertEquals(15, calc.result());
    }

    @Test
    void testSubtract() {
        // Arrange
        NewIntCalculator calc = new NewIntCalculator(10);

        // Act
        calc.subtract(3);

        // Assert
        assertEquals(7, calc.result());
    }

    @Test
    void testMultiply() {
        // Arrange
        NewIntCalculator calc = new NewIntCalculator(4);

        // Act
        calc.multiply(5);

        // Assert
        assertEquals(20, calc.result());
    }

    @Test
    void testDivide() {
        // Arrange
        NewIntCalculator calc = new NewIntCalculator(20);

        // Act
        calc.divide(4);

        // Assert
        assertEquals(5, calc.result());
    }

    @Test
    void testDivideByZero() {
        // Arrange
        NewIntCalculator calc = new NewIntCalculator(10);

        // Act & Assert
        assertThrows(ArithmeticException.class, () -> calc.divide(0));
    }

    @Test
    void testClear() {
        // Arrange
        NewIntCalculator calc = new NewIntCalculator(100);

        // Act
        calc.clear();

        // Assert
        assertEquals(0, calc.result());
    }
}
class NewIntCalculatorNegativePathTest {

    @Test
    void testDivideByZeroThrowsException() {
        // Arrange
        NewIntCalculator calc = new NewIntCalculator(50);

        // Act & Assert
        assertThrows(ArithmeticException.class, () -> calc.divide(0));
    }

    @Test
    void testMultiplyByZeroResultsZero() {
        // Arrange
        NewIntCalculator calc = new NewIntCalculator(7);

        // Act
        calc.multiply(0);

        // Assert
        assertEquals(0, calc.result());
    }
}
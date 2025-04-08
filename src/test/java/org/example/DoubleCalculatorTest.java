package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoubleCalculatorTest {

    @Test
    void testAdd() {
        // Arrange
        DoubleCalculator calc = new DoubleCalculator(10.0);

        // Act
        calc.add(5.5);

        // Assert
        assertEquals(15.5, calc.result());
    }

    @Test
    void testSubtract() {
        // Arrange
        DoubleCalculator calc = new DoubleCalculator(10.0);

        // Act
        calc.subtract(3.2);

        // Assert
        assertEquals(6.8, calc.result(), 0.0001);
    }

    @Test
    void testMultiply() {
        // Arrange
        DoubleCalculator calc = new DoubleCalculator(4.0);

        // Act
        calc.multiply(2.5);

        // Assert
        assertEquals(10.0, calc.result(), 0.0001);
    }

    @Test
    void testDivide() {
        // Arrange
        DoubleCalculator calc = new DoubleCalculator(9.0);

        // Act
        calc.divide(3.0);

        // Assert
        assertEquals(3.0, calc.result(), 0.0001);
    }

    @Test
    void testDivideByZeroPositive() {
        // Arrange
        DoubleCalculator calc = new DoubleCalculator(5.0);

        // Act
        double result = calc.divide(0.0).result();

        // Assert
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void testDivideByZeroNegative() {
        // Arrange
        DoubleCalculator calc = new DoubleCalculator(-5.0);

        // Act
        double result = calc.divide(0.0).result();

        // Assert
        assertEquals(Double.NEGATIVE_INFINITY, result);
    }

    @Test
    void testClear() {
        // Arrange
        DoubleCalculator calc = new DoubleCalculator(100.0);

        // Act
        calc.clear();

        // Assert
        assertEquals(0.0, calc.result(), 0.0001);
    }
}

class DoubleCalculatorNegativePathTest {

    @Test
    void testDivideByZeroResultsInfinity() {
        // Arrange
        DoubleCalculator calc = new DoubleCalculator(12.5);

        // Act
        double result = calc.divide(0.0).result();

        // Assert
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void testDivideNegativeByZeroResultsNegativeInfinity() {
        // Arrange
        DoubleCalculator calc = new DoubleCalculator(-12.5);

        // Act
        double result = calc.divide(0.0).result();

        // Assert
        assertEquals(Double.NEGATIVE_INFINITY, result);
    }

    @Test
    void testMultiplyByZeroResultsZero() {
        // Arrange
        DoubleCalculator calc = new DoubleCalculator(5.3);

        // Act
        calc.multiply(0.0);

        // Assert
        assertEquals(0.0, calc.result(), 0.0001);
    }
}
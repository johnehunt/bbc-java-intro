package com.jjh.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test cases for Calculator")
class CalculatorTest {

    @BeforeAll
    static void setUpBeforeClass() {
        System.out.println("setUpBeforeClass()");
    }

    @AfterAll
    static void tearDownAfterClass()  {
        System.out.println("tearDownAfterClass");
    }

    @BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @Test
    void testAddOneToCalculator() {
        Calculator calc = new Calculator();
        calc.add(1);
        int result = calc.getTotal();
        assertEquals(1, result, "Expected result should be 1");
    }

    @Test
    void testSubtractOneFromCalculator() {
        Calculator calc = new Calculator();
        calc.subtract(1);
        int result = calc.getTotal();
        assertEquals(-1, result, "Expected result should be -1");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }


    @Test
    @DisplayName("test calculator memory")
    void testWithDisplayNameContainingSpaces() {
        Calculator calc = new Calculator();
        calc.add(1);
        calc.addToMemory();
        int result = calc.getMemory();
        assertEquals(1, result, "Expected result should be 1");
    }

    @ParameterizedTest
    @MethodSource("valuesProvider")
    void testWithValueSource(int x, int y, int total) {
        Calculator calc = new Calculator();
        calc.add(x);
        calc.add(y);
        int result = calc.getTotal();
        assertEquals(total, result, "result was " + result + " should have been " + total);
    }

    static Stream<Arguments> valuesProvider() {
        return Stream.of(Arguments.of(0, 0, 0),
                Arguments.of(1, 0, 1),
                Arguments.of(0, 1, 1),
                Arguments.of(1, 1, 2),
                Arguments.of(1, 2, 3));
    }

}

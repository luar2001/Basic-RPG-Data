package com.example.springdocker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Lukas Aronsson
 * Date: 14/05/2021
 * Time: 21:21
 * Project: spring-docker-demo
 * Copyright: MIT
 **/
class MathCalculationTest {

    MathCalculation math;

    @BeforeEach
    void setUp() {
        math = new MathCalculation();
    }

    @DisplayName("MathCalculation Addition test")
    @Test
    void add() {
        assertEquals(4, math.add(2, 2));
        assertEquals(1, math.add(1, 0));
        assertEquals(0, math.add(-1, 1));
    }

    @DisplayName("MathCalculation Multiplication test")
    @Test
    void multiply() {
        assertEquals(4, math.multiply(2, 2));
        assertEquals(0, math.multiply(1, 0));
        assertEquals(1, math.multiply(1, 1));
        assertEquals(-1, math.multiply(-1, 1));
    }

    @DisplayName("MathCalculation division test")
    @Test
    void divide() {
        assertEquals(1, math.divide(2, 2));
        assertEquals(2, math.divide(4, 2));
        assertEquals(2.5, math.divide(5, 2));
        assertEquals(-1, math.divide(-1, 1));
    }

    @DisplayName("MathCalculation division throw when parameter 0 test")
    @Test
    void divideThrow() {

        assertThrows(IllegalArgumentException.class,
                () -> {
                    math.divide(2, 0);
                });

        assertThrows(IllegalArgumentException.class,
                () -> {
                    math.divide(0, 0);
                });

        assertThrows(IllegalArgumentException.class,
                () -> {
                    math.divide(2, 0);
                });

    }
}
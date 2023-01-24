package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int result = Factorial.calc(5);
        int expected = 120;
        assertEquals(result, expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int result = Factorial.calc(0);
        int expected = 1;
        assertEquals(result, expected);
    }
}
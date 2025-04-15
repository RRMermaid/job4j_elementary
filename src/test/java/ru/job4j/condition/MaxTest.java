package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMaxOfTwoNumbers() {
        int result = Max.max(9, 6);
        int expected = 9;
        assertEquals(expected, result);
    }

    @Test
    public void whenMaxOfThreeNumbers() {
        int result = Max.max(3, 7, 3);
        int expected = 7;
        assertEquals(expected, result);
    }

    @Test
    public void whenMaxOfFourNumbers() {
        int result = Max.max(5, 5, 7, 9);
        int expected = 9;
        assertEquals(expected, result);
    }
}

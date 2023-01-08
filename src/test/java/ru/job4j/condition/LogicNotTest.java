package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicNotTest {

    @Test
    void isEvenFor8() {
        assertTrue(LogicNot.isEven(8));
    }

    @Test
    void isPositiveFor7() {
        assertTrue(LogicNot.isPositive(7));
    }

    @Test
    void notEvenFor9() {
        assertTrue(LogicNot.notEven(9));
    }

    @Test
    void notPositiveForNegative5() {
        assertTrue(LogicNot.notPositive(-5));
    }

    @Test
    void notEvenAndPositiveFor11() {
        assertTrue(LogicNot.notEvenAndPositive(11));
    }

    @Test
    void evenOrNotPositiveForNegative() {
        assertTrue(LogicNot.evenOrNotPositive(12));
        assertTrue(LogicNot.evenOrNotPositive(-5));
    }

}
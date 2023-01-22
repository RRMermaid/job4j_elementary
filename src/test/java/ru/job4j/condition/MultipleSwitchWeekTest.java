package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.job4j.condition.MultipleSwitchWeek.numberOfDay;

class MultipleSwitchWeekTest {

    @Test
    void numberOfDayMonday() {
    int day = numberOfDay("Monday");
    assertEquals(1, day);
    }

    @Test
    void numberOfDayVtornik() {
        int day = numberOfDay("Вторник");
        assertEquals(2, day);
    }

    @Test
    void numberOfDaySummer() {
        int day = numberOfDay("Summer");
        assertEquals(-1, day);
    }
}
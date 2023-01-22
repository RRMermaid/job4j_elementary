package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.job4j.condition.SwitchWeek.nameOfDay;

import ru.job4j.condition.SwitchWeek.*;

class SwitchWeekTest {

    @Test
    void dayOf1() {
        String dayOfWeek = nameOfDay(1);
        assertEquals("Понедельник", dayOfWeek);
    }
    @Test
    void dayOf8() {
        String dayOfWeek = nameOfDay(8);
        assertEquals("Ошибка", dayOfWeek);
    }
}
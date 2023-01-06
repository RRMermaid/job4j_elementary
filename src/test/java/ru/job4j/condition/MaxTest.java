package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static ru.job4j.condition.Max.max;

import org.junit.Assert;
import ru.job4j.condition.Max;

public class MaxTest {

    @Test
    public void maxFrom9and6() {
        int expected = 9;
        int left = 9;
        int right = 6;
        int out = max(9, 6);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxFrom3and7() {
        int expected = 7;
        int left = 3;
        int right = 7;
        int out = max(3, 7);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxFrom5and5() {
        int expected = 5;
        int left = 5;
        int right = 5;
        int out = max(5, 5);
        assertThat(out).isEqualTo(expected);
    }
}
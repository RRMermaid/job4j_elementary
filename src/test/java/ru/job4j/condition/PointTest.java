package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when14to25then1dot41() {
        double expected = 1.41;
        Point a = new Point(1, 4);
        Point b = new Point(2, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to26then2dot23() {
        double expected = 2.23;
        Point a = new Point(3, 4);
        Point b = new Point(2, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to76then6dot70() {
        double expected = 6.70;
        Point a = new Point(1, 3);
        Point b = new Point(7, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}

package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

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
    public void when345to267then2dot45() {
        double expected = 3;
        Point a = new Point(3, 4, 5);
        Point b = new Point(2, 6, 7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when135to765then6dot78() {
        double expected = 6.7;
        Point a = new Point(1, 3, 5);
        Point b = new Point(7, 6, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
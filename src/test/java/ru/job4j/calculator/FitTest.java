package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import ru.job4j.calculator.Fit;

public class FitTest {

    @Test
    public void whenMan180Then69dot56() {
        short in = 180;
        double expected = 69.56;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman168Then50dot43() {
        short in = 168;
        double expected = 50.43;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        Converter converter = new Converter();
        float out = converter.rubleToEuro(140);
        Assert.assertEquals(2, out, 0.00001);
        System.out.println("Тестирование прошло успешно.");
    }

    @Test
    public void rubleToDollar() {
        Converter converter = new Converter();
        float out = converter.rubleToDollar(180);
        Assert.assertEquals(3, out, 0.00001);
        System.out.println("Тестирование прошло успешно.");
    }
}
package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float ruble) {
        float rsl = ruble / 70;
        return rsl;
    }

    public static float rubleToDollar(float ruble) {
        float rsl = ruble / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");

    }
}

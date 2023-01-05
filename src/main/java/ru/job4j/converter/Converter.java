package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static boolean testEuro(float ruble, float euro) {
        float out = Converter.rubleToEuro(ruble);
        return out == euro;
        }

    public static boolean testDollar(float ruble, float dollar) {
        float out = Converter.rubleToDollar(ruble);
        return out == dollar;
    }

        public static void main(String[]args) {
            float euro = Converter.rubleToEuro(140);
            System.out.println("140 rubles are " + euro + " euro.");
            float dollar = Converter.rubleToDollar(180);
            System.out.println("180 rubles are " + dollar + " dollars.");
            System.out.println("Test result:" + " " + testEuro(140, 2) + ".");
            System.out.println("Test result:" + " " + testDollar(180, 3) + ".");

        }
    }

package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short heightm) {
        double rsl = (heightm - 100) / 1.15;
        return rsl;
    }

    public static double womanWeight(short heightw) {
        double rsl = (heightw - 110) / 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightm = 187;
        double man = Fit.manWeight(heightm);
        short heightw = 168;
        double woman = Fit.womanWeight(heightw);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 168 is " + woman);
    }
}

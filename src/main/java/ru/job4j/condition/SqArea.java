package ru.job4j.condition;

public class SqArea {
    /**
     * Метод вычисляет площадь прямоугольника по периметру и коэффициенту.
     *
     * @param p Периметр прямоугольника
     * @param k Соотношение длины к высоте (l / h)
     * @return Площадь прямоугольника
     */
    public static double square(double p, double k) {
        if (p <= 0 || k <= 0) {
            throw new IllegalArgumentException("Периметр и коэффициент должны быть положительными числами.");
        }
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double p = 4;
        double k = 1;
        double result = SqArea.square(p, k);
        System.out.printf("Для p = %.2f, k = %.2f, площадь S = %.2f%n", p, k, result);
    }
}

package ru.job4j.loop;

import java.lang.*;

public class CheckPrimeNumber {
    /**
     * Метод проверки числа на простоту. Описание алгоритма.
     * Сначала мы считаем все числа меньше 2 не простыми и с порога вводим им статус false.
     * Затем исключили перебор для четных чисел, так как они не простые, кроме исключения в виде 2
     * Остается проверить нечетное число
     * Нам достаточно проверить делители до квадратного корня из проверяемого числа,
     * потому что число, являющееся вторым множителем в составном числе,
     * всегда первым будет иметь число, меньшее квадратного корня.
     * Наихудший случай по стоимости перебора тогда будет либо в случае,
     * когда число является полным квадратом, либо простым числом.
     * Корень вычисляется как double в силу спецификации библиотечной функции,
     * поэтому мы завели переменную, в которую мы кастуем результат к целочисленному инту,
     * тем самым, по сути, ограничиваясь ближайшим полным квадратным корнем.
     * Если не завести эту переменную, то в дальнейшем операция сравнения инта и дабла
     * будет на каждой итерации цикла неявно делать каст типа, чтобы провести целочисленное сравнение,
     * что приведет к нерациональному расходу процессорного времени.
     * Четные делители исключены, так как включают в себя 2 в роли делителя
     * Число, делящееся нацело на четный делитель, само должно быть четным
     * По этой причине мы не тратим процессор на четные делители в этой ветки и поэтому стартуем с 3
     * Код мог быть проще, если бы мы не были обязаны поддерживать сквозную переменную prime.
     * Сквозные переменные - это как глобальные переменные.
     *
     * @param number число, которое нужно проверить на простоту
     * @return будет true, если число простое.
     */
    public static boolean check(int number) {
        boolean prime = (number > 1);
        if ((number & 1) == 0) {
            prime = (number == 2);
        } else {
            int sqrt = ((int) Math.sqrt(number));
            for (int index = 3; index <= sqrt; index += 2) {
                if (number % index == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}
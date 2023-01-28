package ru.job4j.loop;
import java.lang.*;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if ((number & 1) == 0) {
            return false;
        }
        int sqrt = ((int) Math.ceil(Math.sqrt(number)));
        for (int index = 3; index <= sqrt; index += 2) {
            if (number % index == 0) {
                return false;
            }
        }
        return true;
    }
}
package ru.job4j.loop;

import java.lang.*;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = (number >= 2);

        if ((number & 1) == 0) {
            prime = (number == 2);
        } else {
            int sqrt = ((int) Math.ceil(Math.sqrt(number)));
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
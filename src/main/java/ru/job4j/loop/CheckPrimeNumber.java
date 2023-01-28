package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int hold = 0;
        for (int index = 1; index <= number; index++) {
            if (number % index == 0) {
                hold++;
                if (hold > 2) {
                    break;
                }
            }
        }
        return hold == 2;
    }

}


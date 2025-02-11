package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result;
        char symbol = input.charAt(0);
        int counter = 1;
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                resultBuilder.append(symbol);
                if (counter > 1) {
                    resultBuilder.append(counter);
                }
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result = resultBuilder.toString();
        result += symbol;
        if (counter > 1) {
            result += Integer.toString(counter);
        }
        return result;
    }
}
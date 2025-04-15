package ru.job4j.condition;

public class Max {

    public static int findMax(int left, int right) {
        return left > right ? left : right;
    }

    public static int findMax(int left, int right, int front) {
        return findMax(findMax(left, right), front);
    }

    public static int findMax(int left, int right, int front, int back) {
        return findMax(findMax(left, right, front), back);
    }

    public static void main(String[] args) {
        System.out.println(findMax(9, 6));
        System.out.println(findMax(3, 7, 3));
        System.out.println(findMax(5, 5, 7, 9));
    }
}
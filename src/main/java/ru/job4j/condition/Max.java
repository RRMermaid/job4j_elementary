package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int front) {
        return max(max(left, right), front);
    }

    public static int max(int left, int right, int front, int back) {
        return max(max(left, right, front), back);
    }


    public static void main(String[] args) {
        System.out.println(max(9, 6));
        System.out.println(max(3, 7, 3));
        System.out.println(max(5, 5,7,9));
    }
}

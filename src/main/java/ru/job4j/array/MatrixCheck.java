package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] row : board) {
            if (row[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int cell = 0; cell < board.length; cell++) {
            result[cell] = board[cell][cell];
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 'X') {
                if (monoHorizontal(board, row) || monoVertical(board, row)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
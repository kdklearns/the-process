package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_17_valid_sudoku;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        // 9x9 row check
        for (int i = 0; i < m; i++) {
            boolean[] freq = new boolean[10];
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                int num = board[i][j] - '0';
                if(freq[num]) {
                    return false;
                }
                freq[num] = true;
            }
        }

        // 9x9 col check
        for (int j = 0; j < n; j++) {
            boolean[] freq = new boolean[10];
            for (int i = 0; i < m; i++) {
                if (board[i][j] == '.') {
                    continue;
                }

                int num = board[i][j] - '0';
                if (freq[num]) {
                    return false;
                }
                freq[num] = true;
            }
        }

        // inner 3x3 checks
        int row = 0;
        while (row < 9) {
            int col = 0;
            while (col < 9) {
                if (!innerMatrixValid(board, row, col)) {
                    return false;
                }
                col += 3;
            }
            row += 3;
        }

        return true;
    }

    private boolean innerMatrixValid(char[][] board, int row, int col) {
        boolean[] freq = new boolean[10];
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j] - '0';
                if (freq[num]) {
                    return false;
                }
                freq[num] = true;
            }
        }
        return true;
    }
}
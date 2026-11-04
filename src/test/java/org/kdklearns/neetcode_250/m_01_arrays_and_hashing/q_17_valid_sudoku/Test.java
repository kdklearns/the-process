package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_17_valid_sudoku;

public class Test {
    public static void main(String[] args) {
        char[][] board = {
                {'.', '.', '.', '.', '.', '.', '5', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'9', '3', '.', '.', '2', '.', '4', '.', '.'},
                {'.', '.', '7', '.', '.', '.', '3', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '3', '4', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '5', '2', '.', '.'}
        };

        Solution solution = new Solution();
        System.out.println(solution.isValidSudoku(board));
    }
}

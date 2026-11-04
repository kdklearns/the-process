package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_15_range_sum_query_2d_immutable;

class NumMatrix {
    private int[][] matrix;

    public NumMatrix(int[][] matrix) {
        this.matrix = prefixMatrix(matrix);
    }

    // row-wise prefix sum matrix (not mutating input array)
    private int[][] prefixMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] prefix = new int[m][n];

        for (int i = 0; i < m; i++) {
            prefix[i][0] = matrix[i][0];
            for (int j = 1; j < n; j++) {
                prefix[i][j] = prefix[i][j - 1] + matrix[i][j];
            }
        }

        return prefix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            sum += matrix[i][col2];
            if (col1 > 0) {
                sum -= matrix[i][col1 - 1];
            }
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
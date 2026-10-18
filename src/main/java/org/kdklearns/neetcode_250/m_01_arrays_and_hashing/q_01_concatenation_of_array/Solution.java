package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_01_concatenation_of_array;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        // just one -pass
        for (int i = 0; i < n; i++) {
            ans[i] = ans[n + i] = nums[i];
        }

        return ans;
    }
}
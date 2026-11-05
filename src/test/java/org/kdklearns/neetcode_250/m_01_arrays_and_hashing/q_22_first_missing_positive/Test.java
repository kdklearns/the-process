package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_22_first_missing_positive;

public class Test {
    public static void main(String[] args) {
//        int[] nums = { 3, 4, -1, 1 };
//        int[] nums = { 100000, 3, 4000, 2, 15, 1, 99999 };
        int[] nums = { 1, 2 };
        Solution s = new Solution();
        System.out.println("first missing positive: " + s.firstMissingPositive(nums));
    }
}

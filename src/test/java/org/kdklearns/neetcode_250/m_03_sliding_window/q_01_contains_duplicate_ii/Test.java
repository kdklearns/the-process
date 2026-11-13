package org.kdklearns.neetcode_250.m_03_sliding_window.q_01_contains_duplicate_ii;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[] nums = { 99, 99 };
//        int k = 2;
//        int[] nums = { 1,2,3,1,2,3 };
//        int k = 2;
        int[] nums = { 0,1,2,3,2,5 };
        int k = 3;

        Solution s = new Solution();
        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("K: " + k);
        System.out.println("Answer: " + s.containsNearbyDuplicate(nums, k));
    }
}

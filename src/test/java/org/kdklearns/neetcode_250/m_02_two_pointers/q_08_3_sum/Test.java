package org.kdklearns.neetcode_250.m_02_two_pointers.q_08_3_sum;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[] nums = { -1, 0, 1, 2, -1, -4 };
//        int[] nums = { 1, 2, 0, 1, 0, 0, 0, 0 };
        int[] nums = { -100, -70, -60, 110, 120, 130, 160 };
        Solution s = new Solution();
        System.out.println("input: " + Arrays.toString(nums));
        System.out.println("answer: " + s.threeSum(nums));
    }
}

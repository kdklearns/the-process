package org.kdklearns.neetcode_250.m_02_two_pointers.q_07_two_sum_ii_input_array_is_sorted;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[] nums = { 2, 7, 11, 15 };
//        int target = 9;
        int[] nums = { 2, 7, 11, 15 };
        int target = 26;
        Solution s = new Solution();
        System.out.println("array: " + Arrays.toString(nums) + ", target: " + target);
        System.out.println("indexes: " + Arrays.toString(s.twoSum(nums, target)));
    }
}

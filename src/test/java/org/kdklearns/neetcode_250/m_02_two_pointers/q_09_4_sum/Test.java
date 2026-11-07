package org.kdklearns.neetcode_250.m_02_two_pointers.q_09_4_sum;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[] nums = {2,2,2,2,2};
//        int target = 8;
//        int[] nums = {0,0,0,0};
//        int target = 0;
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        Solution s = new Solution();
        System.out.println("Array: " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Sorted: " + Arrays.toString(nums));
        System.out.println("Answer: " + s.fourSum(nums, target));
    }
}

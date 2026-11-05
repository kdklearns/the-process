package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_21_subarray_sum_equals_k.prefix_sum;

public class Test {
    public static void main(String[] args) {
//        int[] nums = {1, 1, 1}; int k = 2; // pass
        int[] nums = {1, 2, 3}; int k = 3; // fail,
        Solution s = new Solution();
        System.out.println(s.subarraySum(nums, k));
    }
}

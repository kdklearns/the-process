package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_21_subarray_sum_equals_k.prefix_sum;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = build(nums);

        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum;
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }

                if (sum == k) {
                    answer++;
                }
            }
        }

        return answer;
    }

    private int[] build(int[] nums) {
        int n = nums.length;
        
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        return prefix;
    }
}
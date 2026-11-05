package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_21_subarray_sum_equals_k.hashing;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            // prefix-sum till ith index
            sum += nums[i];
            if (sum == k) {
                int zeroes = map.getOrDefault(0, 0);
                ans += zeroes + 1;
            } else {
                int pair = sum - k;
                int freq = map.getOrDefault(pair, 0);
                ans += freq;
            }

            int existing = map.getOrDefault(sum, 0);
            map.put(sum, existing + 1);
        }

        return ans;
    }
}
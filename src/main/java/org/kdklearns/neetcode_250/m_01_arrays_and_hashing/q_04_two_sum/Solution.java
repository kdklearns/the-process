package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_04_two_sum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int pair = target - num;
            if (map.containsKey(pair)) {
                int index1 = i;
                int index2 = map.get(pair);
                ans[0] = Math.min(index1, index2);
                ans[1] = Math.max(index1, index2);
                break;
            }
            map.put(num, i);
        }

        return ans;
    }
}

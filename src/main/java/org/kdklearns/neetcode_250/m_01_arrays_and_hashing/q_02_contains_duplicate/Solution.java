package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_02_contains_duplicate;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], 1);
        }
        return false;
    }
}
package org.kdklearns.neetcode_250.m_03_sliding_window.q_03_longest_substring_without_repeating_characters.hashmap;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);
            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }
            map.put(ch, right);
            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }
}
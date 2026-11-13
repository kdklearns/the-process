package org.kdklearns.neetcode_250.m_03_sliding_window.q_03_longest_substring_without_repeating_characters.hashset;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);
            if (!window.contains(ch)) {
                window.add(ch);
                max = Math.max(max, window.size());
                right++;
                continue;
            }

            // Case I - charAt 'left' is same as charAt 'right'
            if (s.charAt(left) == ch) {
                left++;
                right++;
            } else {
                // Case II - Move 'left' forward till first occurrence of 'ch'
                while (s.charAt(left) != ch) {
                    window.remove(s.charAt(left));
                    left++;
                }
                // now left is exactly at the first occurrence of 'ch' which had been added in the window
                window.remove(s.charAt(left));

                // since right already points at 'ch'
                left++;
            }
        }

        return max;
    }
}
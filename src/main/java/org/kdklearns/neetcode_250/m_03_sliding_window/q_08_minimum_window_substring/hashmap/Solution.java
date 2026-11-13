package org.kdklearns.neetcode_250.m_03_sliding_window.q_08_minimum_window_substring.hashmap;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        // edge case (sneaky lil hoe)
        if (s.length() < t.length()) {
            return ""; // why even bother, lol
        }

        // build the substring map
        Map<Character, Integer> substr_map = buildMap(t);
        Map<Character, Integer> window_map = new HashMap<>();

        // running index pointers for dynamic window
        int left = 0;
        int right = 0;
        int matches = 0;

        // to store final index pointers for substring
        int final_left = -1;
        int final_right = -1;
        int min_len = Integer.MAX_VALUE;

        while(right < s.length()) {
            char ch = s.charAt(right);
            // update window and right pointer
            window_map.putIfAbsent(ch, 0);
            window_map.put(ch, window_map.get(ch) + 1);
            right++;

            int substr_count = substr_map.getOrDefault(ch, 0);
            int window_count = window_map.get(ch);

            if (substr_count != 0 && window_count <= substr_count) {
                matches++;
            }

            // shrink to min possible length
            while (left < right && matches >= t.length()) {
                // instant check to update final index pointers
                if (right - left < min_len) {
                    min_len = right - left;
                    final_left = left;
                    final_right = right;
                }

                char first = s.charAt(left);
                int updated_count = window_map.get(first) - 1;
                window_map.put(first, updated_count);

                // only decrement matches if the character dropped is needed by t
                if (substr_map.containsKey(first) && updated_count < substr_map.get(first)) {
                    matches--;
                }
                left++;
            }
        }

        return min_len != Integer.MAX_VALUE ? s.substring(final_left, final_right) : "";
    }

    private Map<Character, Integer> buildMap(String str) {
        Map<Character, Integer> substr_map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            substr_map.putIfAbsent(ch, 0);
            int frequency = substr_map.get(ch);
            substr_map.put(ch, frequency + 1);
        }

        return substr_map;
    }
}
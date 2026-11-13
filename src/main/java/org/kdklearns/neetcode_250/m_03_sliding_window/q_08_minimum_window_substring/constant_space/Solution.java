package org.kdklearns.neetcode_250.m_03_sliding_window.q_08_minimum_window_substring.constant_space;

class Solution {
    public String minWindow(String s, String t) {
        // edge case
        if (s.length() < t.length()) {
            return "";
        }

        int[] need = build(t);
        int[] window = new int[52];

        // running pointers
        int left = 0;
        int right = 0;
        int matches = 0;

        // storing final indexes
        int final_left = -1;
        int final_right = -1;
        int min_len = Integer.MAX_VALUE;

        while (right < s.length()) {
            char ch = s.charAt(right);
            mark(window, ch);
            right++;

            int substr_count = getCount(need, ch);
            int window_count = getCount(window, ch);

            if (substr_count != 0 && window_count <= substr_count) {
                matches++;
            }

            while (left < right && matches >= t.length()) {
                // instant check to update min length
                if (right - left < min_len) {
                    min_len = right - left;
                    final_left = left;
                    final_right = right;
                }

                char first = s.charAt(left);
                decrementChar(window, first);

                int updated_count = getCount(window, first);
                int needed_count = getCount(need, first);

                if (updated_count < needed_count) {
                    matches--;
                }

                left++;
            }
        }

        return min_len != Integer.MAX_VALUE ? s.substring(final_left, final_right) : "";
    }

    private int[] build(String t) {
        int[] need = new int[52];
        for (int i = 0; i <  t.length(); i++) {
            char ch = t.charAt(i);
            mark(need, ch);
        }
        return need;
    }

    private void mark(int[] arr, char ch) {
        if (ch < 'a') {
            arr[ch - 'A']++;
        } else {
            arr[ch - 'a' + 26]++;
        }
    }

    private int getCount(int[] arr, char ch) {
        int count = 0;
        if (ch < 'a') {
            count = arr[ch - 'A'];
        } else {
            count = arr[ch - 'a' + 26];
        }
        return count;
    }

    private void decrementChar(int[] arr, char ch) {
        if (ch < 'a') {
            arr[ch - 'A']--;
        } else {
            arr[ch - 'a' + 26]--;
        }
    }
}
package org.kdklearns.neetcode_250.m_03_sliding_window.q_08_minimum_window_substring.array;

class Solution {
    public String minWindow(String s, String t) {
        // edge case
        if (t.length() > s.length()) {
            return "";
        }

        // mark frequency of characters
        int[] freq = markCharacters(t, t.length());     // O(1)
        int[] window = markCharacters(s, t.length());   // O(1)

        // String s has t as the first substring itself
        if (substringMatches(freq, window)) {
            return t;
        }

        int left = 0;
        int right = t.length();
        StringBuilder substr = new StringBuilder();
        StringBuilder answer = null;
        build(s, substr, right);
        int minLength = Integer.MAX_VALUE;

        while (right < s.length()) {
            char ch = s.charAt(right);
            substr.append(ch);
            markWindow(window, ch);
            right++;

            while(left < right && substringMatches(freq, window)) {
                // update length
                if (right - left < minLength) {
                    minLength = right - left;
                    answer = new StringBuilder(substr);
                }

                // shrink from left
                substr.deleteCharAt(0);
                // adjusting window accordingly
                char first = s.charAt(left);
                if (first < 'a') {
                    window[first - 'A']--;
                } else {
                    window[first - 'a' + 26]--;
                }
                left++;
            }
        }

        return answer != null ? answer.toString() : "";
    }

    private int[] markCharacters(String str, int length) {
        int[] window = new int[56];
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            markWindow(window, ch);
        }
        return window;
    }

    private boolean substringMatches(int[] freq, int[] substr) {
        for (int i = 0; i < 52; i++) {
            if (freq[i] != 0 && substr[i] < freq[i]) {
                return false;
            }
        }
        return true;
    }

    private void build(String s, StringBuilder sb, int length) {
        for (int i = 0; i < length; i++) {
            sb.append(s.charAt(i));
        }
    }

    private void markWindow(int[] window, char ch) {
        if (ch < 'a') {
            // uppercase
            window[ch - 'A']++;
        } else {
            // lowercase
            window[ch - 'a' + 26]++;
        }
    }
}
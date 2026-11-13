package org.kdklearns.neetcode_250.m_03_sliding_window.q_05_permutation_in_string;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // edge case (S.O.A.B!)
        if (s2.length() < s1.length()) {
            return false;
        }

        // using fixed array to store frequency of s1 chars
        int[] freq = markFrequency(s1);

        // window
        int[] window = new int[26];
        int k = s1.length();
        for (int i = 0; i < k; i++) {
            window[s2.charAt(i) - 'a']++;
        }

        // pre-slide check
        if (arraysAreEqual(freq, window)) {
            return true;
        }

        int left = 0;
        int right = k;
        while (right < s2.length()) {
            // decrease freq of leaving character (left)
            window[s2.charAt(left) - 'a']--;
            // increase freq of incoming character (right)
            window[s2.charAt(right) - 'a']++;

            // compare the two arrays, seeeyuhhhh
            if (arraysAreEqual(freq, window)) {
                return true;
            }

            // slide the window
            left++;
            right++;
        }

        return false;
    }

    private int[] markFrequency(String s1) {
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        return freq;
    }

    private boolean arraysAreEqual(int[] freq, int[] window) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] != window[i]) {
                return false;
            }
        }
        return true;
    }
}
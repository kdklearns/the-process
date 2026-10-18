package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_03_valid_anagram;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];
        char[] letters1 = s.toCharArray();

        for (int i = 0; i < letters1.length; i++) {
            char ch = letters1[i];
            arr[ch - 'a']++;
        }

        char[] letters2 = t.toCharArray();
        for (int i = 0; i < letters2.length; i++) {
            char ch = letters2[i];
            if (arr[ch - 'a'] == 0) {
                return false;
            }
            arr[ch - 'a']--;
        }

        return true;
    }
}

package org.kdklearns.neetcode_250.m_02_two_pointers.q_04_merge_strings_alternately;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int min = Math.min(word1.length(), word2.length());
        StringBuilder merged = new StringBuilder();

        int i = 0;
        while(i < min) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
            i++;
        }

        String max = word1.length() > word2.length() ? word1 : word2;
        StringBuilder remaining = new StringBuilder();
        while (i < max.length()) {
            remaining.append(max.charAt(i));
            i++;
        }

        return merged.append(remaining).toString();
    }
}
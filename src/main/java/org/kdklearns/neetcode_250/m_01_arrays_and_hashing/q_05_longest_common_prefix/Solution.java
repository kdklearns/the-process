package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_05_longest_common_prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < min; i++) {
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                char d = strs[j].charAt(i);
                if (c != d) {
                    return ans.toString();
                }
            }
            ans.append(c);
        }

        return ans.toString();
    }
}
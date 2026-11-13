package org.kdklearns.neetcode_250.m_03_sliding_window.q_03_longest_substring_without_repeating_characters.hashset;

public class Test {
    public static void main(String[] args) {
        String s = "abcabcbb";
//        String s = "mjvhmi";
//        String s = "bbbbb";
//        String s = "ccbbcc";
        Solution solution = new Solution();
        System.out.println("String: " + s);
        System.out.println("Answer: " + solution.lengthOfLongestSubstring(s));
    }
}

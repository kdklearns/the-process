package org.kdklearns.neetcode_250.m_03_sliding_window.q_03_longest_substring_without_repeating_characters.hashmap;

public class Test {
    public static void main(String[] args) {
//        String s = "eea";
//        String s = "baaabca";
        String s = "bccddadcb";
        Solution solution = new Solution();
        System.out.println("String: " + s);
        System.out.println("Answer: " + solution.lengthOfLongestSubstring(s));
    }
}

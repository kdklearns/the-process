package org.kdklearns.neetcode_250.m_03_sliding_window.q_08_minimum_window_substring.hashmap;

public class Test {
    public static void main(String[] args) {
//        String s = "ADOBECODEBANC";
//        String t = "ABC";
        String s = "a";
        String t = "a";
        Solution solution = new Solution();
        System.out.println("String s: " + s + "\nString t: " + t);
        System.out.println("Answer: " + solution.minWindow(s, t));
    }
}

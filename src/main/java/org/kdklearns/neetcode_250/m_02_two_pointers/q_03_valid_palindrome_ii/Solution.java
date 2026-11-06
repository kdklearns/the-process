package org.kdklearns.neetcode_250.m_02_two_pointers.q_03_valid_palindrome_ii;

class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                // whether after deleting 'l' would string be palindromic
                if (checkPalindrome(s, l + 1, r)) {
                    return true;
                }

                // whether after deleting 'r' would string be palindromic
                return checkPalindrome(s, l, r - 1);

            }
            l++;
            r--;
        }
        return true;
    }

    // helper
    private boolean checkPalindrome(String s, int i , int j) {
        while (i < j && i >= 0 && i < s.length() && j >= 0 && j < s.length()) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
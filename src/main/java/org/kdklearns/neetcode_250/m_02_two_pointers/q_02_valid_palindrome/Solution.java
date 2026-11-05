package org.kdklearns.neetcode_250.m_02_two_pointers.q_02_valid_palindrome;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isPalindrome(String s) {
        // converting to lowercase
        s = s.toLowerCase();
        char[] letters = s.toCharArray();

        // adding only alphabets 
        List<Character> valid = new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            char c = letters[i];
            if (c - 'a' >= 0 && c - 'a' < 26) {
                valid.add(c);
            } else if (c - '0' >= 0 && c - '0' <= 9) { // just to make code read-able
                valid.add(c);
            }
        }

        // checking whether they are validromes
        int r = valid.size() - 1;
        int l = 0;
        while (l < r) {
            if (!valid.get(l).equals(valid.get(r))) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
package org.kdklearns.neetcode_250.m_02_two_pointers.q_02_valid_palindrome.constant_space;

class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            char left = s.charAt(l);
            char right = s.charAt(r);

            boolean isLeftValid = false;
            boolean isRightValid = false;

            if (left - 'a' >= 0 && left - 'a' < 26) {
                isLeftValid = true;
            } else if (left - 'A' >= 0 && left - 'A' < 26) {
                left += 32;
                isLeftValid = true;
            } else if (left - '0' >= 0 && left - '0' <= 9) {
                isLeftValid = true;
            }

            if (!isLeftValid) {
                l++;
                continue;
            }

            if (right - 'a' >= 0 && right - 'a' < 26) {
                isRightValid = true;
            } else if (right - 'A' >= 0 && right - 'A' < 26) {
                right += 32;
                isRightValid = true;
            } else if (right - '0' >= 0 && right - '0' <= 9) {
                isRightValid = true;
            }

            if (!isRightValid) {
                r--;
                continue;
            }

            if (left == right) {
                l++;
                r--;
            } else {
                return false;
            }
        }

        return true;
    }
}
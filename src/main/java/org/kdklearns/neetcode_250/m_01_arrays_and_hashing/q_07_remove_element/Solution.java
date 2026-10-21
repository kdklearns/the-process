package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_07_remove_element;

class Solution {

    // T.C. O(N), S.C. O(1)
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int window = getSize(nums, val);
        int unequalNums = n - window;

        // using two pointers
        int l = 0, r = n - 1;
        while (r >= n - window) {
            if (nums[r] == val) {
                r--;
            } else if (nums[l] != val) {
                l++;
            } else {
                // swap
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                r--;
                l++;
            }
        }

        return unequalNums;
    }

    private int getSize(int[] nums, int val) {
        int count = 0;
        for (int num: nums) {
            if (num == val) {
                count++;
            }
        }
        return count;
    }
}
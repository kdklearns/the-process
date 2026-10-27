package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_08_majority_element;

class Solution {

    // T.C. O(N), S.C. O(1)
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = nums[0];
        int votes = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == candidate) {
                votes++;
            } else {
                votes--;
            }
            if (votes == 0) {
                candidate = nums[i];
                votes = 1;
            }
        }

        return candidate;
    }
}
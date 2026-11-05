package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_22_first_missing_positive;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // edge case
        if (n == 1) {
            return nums[0] == 1 ? 2 : 1;
        }

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] - 1 == i) {
                continue;
            }

            // swapping array elements to their correct indexes
            while (nums[i] - 1 != i && nums[i] >= 1 && (nums[i] < n + 1) && (nums[i] != nums[nums[i] - 1])) {
                int num1 = nums[i];
                int num2 = nums[num1 - 1];
                // swapping indexes
                nums[i] = num2;
                nums[num1 - 1] = num1;
            }
        }

        // re-iterating array to return first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] - 1 != i) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
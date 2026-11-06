package org.kdklearns.neetcode_250.m_02_two_pointers.q_07_two_sum_ii_input_array_is_sorted;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] { left + 1, right + 1 };
    }
}
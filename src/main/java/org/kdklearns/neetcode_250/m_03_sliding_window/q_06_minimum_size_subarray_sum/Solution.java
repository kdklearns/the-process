package org.kdklearns.neetcode_250.m_03_sliding_window.q_06_minimum_size_subarray_sum;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int answer = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int currentSum = 0;

        while (right < nums.length) {
            currentSum += nums[right];
            right++;

            while(currentSum >= target) {
                answer = Math.min(answer, right - left);
                currentSum -= nums[left];
                left++;
            }
        }

        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
}
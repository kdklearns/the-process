package org.kdklearns.neetcode_250.m_02_two_pointers.q_11_container_with_most_water;

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int answer = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int distance = right - left;
            int water = distance * minHeight;
            answer = Math.max(water, answer);

            // deciding which pointer to move based on individual height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return answer;
    }
}
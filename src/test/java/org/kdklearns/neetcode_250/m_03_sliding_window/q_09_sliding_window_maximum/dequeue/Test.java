package org.kdklearns.neetcode_250.m_03_sliding_window.q_09_sliding_window_maximum.dequeue;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Test Case - 1
        // int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        // int k = 3;
        // int[] answer = { 3,3,5,5,6,7 };

        // Test Case - 2
        int[] nums = {1,-1};
        int k = 1;
        int[] answer = { 1,-1 };

        Solution s = new Solution();
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("k: " + k);
        System.out.println("\nanswer: " + Arrays.toString(answer));
        System.out.println("result: " + Arrays.toString(s.maxSlidingWindow(nums, k)));
    }
}

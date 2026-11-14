package org.kdklearns.neetcode_250.m_03_sliding_window.q_09_sliding_window_maximum.treemap;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
//        int[] answer = new int[] { 3,3,5,5,6,7 };
//        int k = 3;
//        int[] nums = new int[]{ 1, -1 };
//        int k = 1;
//        int[] answer = new int[] { 1, -1 };
//        int[] nums = new int[]{ -7,-8,7,5,7,1,6,0 };
//        int k = 4;
//        int[] answer = new int[] { 7,7,7,7,7 };
        int[] nums = new int[]{ 9,10,9,-7,-4,-8,2,-6 };
        int k = 5;
        int[] answer = new int[] { 10,10,9,2 };
//        int[] nums = new int[]{ 7,2,4 };
//        int k = 2;
//        int[] answer = new int[] { 7, 4 };
//        int[] nums = new int[]{ 1,3,1,2,0,5 };
//        int k = 3;
//        int[] answer = new int[] { 3,3,2,5 };
        Solution s = new Solution();
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("k: " + k);

        System.out.println("\nanswer: " + Arrays.toString(answer));
        System.out.println("result: " + Arrays.toString(s.maxSlidingWindow(nums, k)));
    }
}

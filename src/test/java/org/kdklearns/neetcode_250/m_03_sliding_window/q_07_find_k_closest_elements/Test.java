package org.kdklearns.neetcode_250.m_03_sliding_window.q_07_find_k_closest_elements;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3, 4, 5};
//        int k = 4;
//        int x = 3;
        int[] arr = new int[]{1,1,1,10,10,10};
        int k = 1;
        int x = 9;

        Solution s = new Solution();
        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("x: " + x + ", k: " + k);
        System.out.println("Answer: " + s.findClosestElements(arr, k , x));
    }
}

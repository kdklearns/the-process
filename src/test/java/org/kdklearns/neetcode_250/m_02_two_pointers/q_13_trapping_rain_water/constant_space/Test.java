package org.kdklearns.neetcode_250.m_02_two_pointers.q_13_trapping_rain_water.constant_space;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        Solution s = new Solution();
        System.out.println("heights: " + Arrays.toString(height));
        System.out.println("rainwater: " + s.trap(height));
    }
}

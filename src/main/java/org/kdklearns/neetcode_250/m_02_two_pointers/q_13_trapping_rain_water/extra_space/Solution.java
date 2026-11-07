package org.kdklearns.neetcode_250.m_02_two_pointers.q_13_trapping_rain_water.extra_space;

class Solution {
    public int trap(int[] height) {
        // pre-calculating maximum height towards right for any building
        int[] r_max = rightPrefix(height);
        // carry forwarding the maximum height towards left for any building while iterating
        int l_max = height[0];
        int rainWater = 0;

        for (int i = 0; i < height.length; i++) {
            l_max = Math.max(l_max, height[i]);
            int upperBound = Math.min(l_max, r_max[i]);
            int waterTrapped = upperBound - height[i];

            if (waterTrapped > 0) {
                rainWater += waterTrapped;
            }
        }

        return rainWater;
    }

    private int[] rightPrefix(int[] height) {
        int n = height.length;
        int[] r_max = new int[n];
        r_max[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            r_max[i] = Math.max(height[i], r_max[i + 1]);
        }

        return r_max;
    }
}
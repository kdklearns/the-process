package org.kdklearns.neetcode_250.m_02_two_pointers.q_13_trapping_rain_water.constant_space;

class Solution {
    public int trap(int[] height) {
        /*
        * APPROACH
        * → Take two pointers, one at each end of the array.
        * → From both ends, keep carry forwarding their respective maximum's
        * → At any point, the water stored above a building is the minimum of both carry forwarded heights
        *   subtracted by the height of the building. Add the result to the total water only if the net
        *   difference is positive.
        * → For moving towards next building, move that pointer which is on a lower height than the other
        * → In case of tie, move a pre-determined default pointer
        * */

        int n = height.length;
        int l = 0;
        int r = n - 1;

        int l_max = height[l];
        int r_max = height[r];

        int rainWater = 0;
        while (l < r) {

            int bound = -1;
            int water = -1;
            int current = -1;

            if (height[l] <= height[r]) {
                current = height[l];
                bound = Math.min(l_max, r_max);
                l++;
                l_max = Math.max(l_max, height[l]);
            } else {
                current = height[r];
                bound = Math.min(l_max, r_max);
                r--;
                r_max = Math.max(r_max, height[r]);
            }

            water = bound - current;

            if (water > 0) {
                rainWater += water;
            }
        }

        return rainWater;
    }
}
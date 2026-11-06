package org.kdklearns.neetcode_250.m_02_two_pointers.q_05_merge_sorted_array.extra_space;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // edge cases
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        List<Integer> merged = new ArrayList<>();
        int l = 0;
        int r = 0;

        while (l + r < m + n) {
            if ((l < m && r < n && nums1[l] <= nums2[r]) || r >= n) {
                merged.add(nums1[l]);
                l++;
            } else if (l >= m || nums2[r] < nums1[l]) {
                merged.add(nums2[r]);
                r++;
            }
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = merged.get(i);
        }
    }
}
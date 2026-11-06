package org.kdklearns.neetcode_250.m_02_two_pointers.q_05_merge_sorted_array.constant_space;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // using no extra space by in-place sorted merge
        int index = m + n - 1;
        // pointer to nums1
        int i = m - 1;
        // pointer to nums2
        int j = n - 1;

        // first loop to fill all/most values
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[index] = nums1[i];
                i--;
            } else {
                nums1[index] = nums2[j];
                j--;
            }
            index--;
        }

        // all values have been filled
        if (index < 0) {
            return;
        }

        // assigning pointers
        int p = i < 0 ? j : i;
        int[] arr = i < 0 ? nums2 : nums1;

        // filling remaining indexes
        while (p >= 0) {
            nums1[index] = arr[p];
            p--;
            index--;
        }
    }
}
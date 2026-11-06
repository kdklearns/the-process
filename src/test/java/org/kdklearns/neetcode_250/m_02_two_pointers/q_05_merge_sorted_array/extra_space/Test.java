package org.kdklearns.neetcode_250.m_02_two_pointers.q_05_merge_sorted_array.extra_space;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;*/

        /*int[] nums1 = { 0 };
        int m = 0;
        int[] nums2 = { 1 };
        int n = 1;*/

        int[] nums1 = { 2, 0 };
        int m = 1;
        int[] nums2 = { 1 };
        int n = 1;

        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}

package org.kdklearns.neetcode_250.m_02_two_pointers.q_06_remove_duplicates_from_sorted_array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[] nums = { 1, 1, 2 };
        int[] nums = { 0,0,1,1,1,2,2,3,3,4 };
        Solution s = new Solution();
        System.out.println("input array: " + Arrays.toString(nums));
        System.out.println("unique elements: " + s.removeDuplicates(nums));
        System.out.println("shifted array: " + Arrays.toString(nums));
    }
}

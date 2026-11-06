package org.kdklearns.neetcode_250.m_02_two_pointers.q_06_remove_duplicates_from_sorted_array;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = findUnique(nums);
        int left = 0;
        int right = 0;
        while (left < k && right < nums.length) {

            // moving right forward until the next greater
            while (nums[right] ==  nums[left]) {
                right++;
            }

            // now right is at the index of the just greater element
            int temp = nums[left + 1];
            nums[left + 1] = nums[right];
            nums[right] = temp;

            left++;
            right++;
        }

        return k;
    }

    private int findUnique(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                count++;
            }
        }
        return count;
    }
}
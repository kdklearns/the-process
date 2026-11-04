package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_16_product_of_array_except_self;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixLeft = leftToRight(nums);
        int[] prefixRight = rightToLeft(nums);

        int[] answer = new int[nums.length];
        answer[0] = prefixRight[1];
        int i = 1;
        while (i < nums.length) {
            answer[i] = i != nums.length - 1 ? prefixRight[i + 1] : 1;
            answer[i] *= prefixLeft[i - 1];
            i++;
        }

        return answer;
    }

    private int[] leftToRight(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }
        return prefix;
    }

    private int[] rightToLeft(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            prefix[i] = prefix[i + 1] * nums[i];
        }
        return prefix;
    }
}
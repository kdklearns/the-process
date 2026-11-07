package org.kdklearns.neetcode_250.m_02_two_pointers.q_09_4_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // fix one index, and treat the remaining as the 3Sum problem
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        int i = 0;
        while (i < n) {
            long num1 = nums[i];
            int j = i + 1;
            while (j <= n - 3) {
                long num2 = nums[j];
                long sum = target - num1 - num2;
                int left = j + 1;
                int right = n - 1;
                while(left < right) {
                    long num3 = nums[left];
                    long num4 = nums[right];
                    if (num3 + num4 == sum) {
                        List<Integer> pair = new ArrayList<>();
                        pair.add((int)num1);
                        pair.add((int)num2);
                        pair.add((int)num3);
                        pair.add((int)num4);
                        answer.add(pair);
                        // update left and right pointer
                        left = moveLeftPointer(nums, left, right);
                        right = moveRightPointer(nums, left, right);
                    } else if (num3 + num4 < sum) {
                        // move left pointer to increase net sum
                        left = moveLeftPointer(nums, left, right);
                    } else {
                        // move right pointer to decrease net sum
                        right = moveRightPointer(nums, left, right);
                    }
                }
                // move j to the next unique value
                j = moveLeftPointer(nums, j, n);
            }
            // move i to the next unique value son
            i = moveLeftPointer(nums, i, n);
        }

        return answer;
    }

    private int moveLeftPointer(int[] nums, int left, int right) {
        while (left + 1 < right && nums[left + 1] == nums[left]) {
            left++;
        }
        return left + 1;
    }

    private int moveRightPointer(int[] nums, int left, int right) {
        while (right - 1 > left && nums[right - 1] == nums[right]) {
            right--;
        }
        return right - 1;
    }
}
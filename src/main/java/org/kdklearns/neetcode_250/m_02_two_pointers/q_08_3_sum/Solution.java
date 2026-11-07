package org.kdklearns.neetcode_250.m_02_two_pointers.q_08_3_sum;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Approach: fix one index, then solve for the other two indexes like two sum
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        // test print
        System.out.println("sorted: " + Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int num1 = nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = num1 + nums[l] + nums[r];
                if (sum == 0) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(num1);
                    pair.add(nums[l]);
                    pair.add(nums[r]);
                    answer.add(pair);
                    l = moveLeftPointer(nums, l);
                    r = moveRightPointer(nums, l, r);
                } else if (sum < 0) {
                    l = moveLeftPointer(nums, l);
                } else {
                    r = moveRightPointer(nums, l, r);
                }
            }
        }
        return answer;
    }

    private int moveLeftPointer(int[] nums, int l) {
        // move to next unique value
        while (l + 1 < nums.length && nums[l + 1] == nums[l]) {
            l++;
        }
        return l + 1;
    }

    private int moveRightPointer(int[] nums, int l, int r) {
        // move to next unique value
        while (r - 1 > l && nums[r - 1] == nums[r]) {
            r--;
        }
        return r - 1;
    }
}
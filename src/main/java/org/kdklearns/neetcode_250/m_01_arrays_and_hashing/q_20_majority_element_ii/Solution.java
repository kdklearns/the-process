package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_20_majority_element_ii;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // at max two can be the majority elements
        int candidate1 = Integer.MIN_VALUE;
        int vote1 = 0;

        int candidate2 = Integer.MIN_VALUE;
        int vote2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (vote1 == 0 && candidate2 != nums[i]) {
                candidate1 = nums[i];
                vote1 = 1;
            } else if (vote2 == 0 && candidate1 != nums[i]) {
                candidate2 = nums[i];
                vote2 = 1;
            } else if (nums[i] == candidate1) {
                vote1++;
            } else if (nums[i] == candidate2) {
                vote2++;
            } else {
                vote1--;
                vote2--;
            }
        }

        // clearing
        vote1 = vote2 = 0;

        // verifying
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) {
                vote1++;
            } else if (nums[i] == candidate2) {
                vote2++;
            }
        }

        
        boolean c1 = vote1 > (nums.length/3) ? true : false;
        boolean c2 = vote2 > (nums.length/3) ? true : false;
        
        List<Integer> answer = new ArrayList<>();

        if (c1) {
            answer.add(candidate1);
        }
        if (c2) {
            answer.add(candidate2);
        }

        return answer;
    }
}
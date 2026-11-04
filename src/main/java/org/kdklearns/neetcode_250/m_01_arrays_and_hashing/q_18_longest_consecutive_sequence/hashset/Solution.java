package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_18_longest_consecutive_sequence.hashset;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<>();
        for (int num: nums) {
            num_set.add(num);
        }

        int longestSequence = 1;
        int currentSequence = 1;
        boolean iterate = false;
        for (int num: num_set) {
            if (!num_set.contains(num-1)) {
                currentSequence = 1;
                iterate = true;
            }

            while (iterate) {
                if (num_set.contains(num + 1)) {
                    currentSequence++;
                } else {
                    longestSequence = Math.max(longestSequence, currentSequence);
                    iterate = false;
                }
                num++;
            }
        }

        return longestSequence;
    }
}
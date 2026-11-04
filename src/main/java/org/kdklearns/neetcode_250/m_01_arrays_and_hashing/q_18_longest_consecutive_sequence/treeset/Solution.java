package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_18_longest_consecutive_sequence.treeset;

import java.util.Set;
import java.util.TreeSet;

class Solution {

    // T.C. - O(nlogn)
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int num: nums) {
            set.add(num);
        }

        int answer = 1;
        int sequence = 1;
        int prev = 0;
        boolean firstValue = true;
        for (int num: set) {
            if (firstValue) {
                prev = num;
                firstValue = false;
                continue;
            }

            if (num == prev + 1) {
                sequence++;
            } else {
                answer = Math.max(answer, sequence);
                sequence = 1;
            }
            prev = num;
        }

        return Math.max(answer, sequence);
    }
}
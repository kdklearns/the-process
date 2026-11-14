package org.kdklearns.neetcode_250.m_03_sliding_window.q_09_sliding_window_maximum.treemap;

import java.util.TreeMap;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        /**
         * INTUITION
         * For the first window, create a sorted hashmap (TreeMap)
         * Each time the window, slides, update frequency of old, or add new elements
         * We can keep track of the current maximum for a window, using both the array and hashmap
         */

        TreeMap<Integer, Integer> window = buildWindow(nums, k);
        int current_max = window.lastKey();

        int[] answer = new int[nums.length - k + 1];
        answer[0] = current_max;

        int left = 0;
        int right = k;
        int i = 1;


        while (right < nums.length) {
            // decrement frequency of outgoing num
            int freq_l = window.get(nums[left]);
            if (freq_l > 1) {
                freq_l--;
                window.put(nums[left], freq_l);
            } else {
                window.remove(nums[left]);
            }

            // increment freq of incoming num
            window.putIfAbsent(nums[right], 0);
            window.put(nums[right], window.get(nums[right]) + 1);

            // store current window's max value in answer
            answer[i] = window.lastKey();

            // update index, slide window
            i++;
            left++;
            right++;
        }

        return answer;
    }

    private TreeMap<Integer, Integer> buildWindow(int[] nums, int k) {
        TreeMap<Integer, Integer> window = new TreeMap();
        for (int i = 0; i < k; i++) {
            window.putIfAbsent(nums[i], 0);
            window.put(nums[i], window.get(nums[i]) + 1);
        }
        return window;
    }
}
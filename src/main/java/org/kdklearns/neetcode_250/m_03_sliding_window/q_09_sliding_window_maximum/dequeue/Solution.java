package org.kdklearns.neetcode_250.m_03_sliding_window.q_09_sliding_window_maximum.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> window = buildWindow(nums, k);

        // allot an answer array, and it's index to store maximum's
        int[] answer = new int[nums.length - k + 1];
        int index = 0;

        // init pointers to slide window
        int left = 0;
        int right = k - 1;

        while (right < nums.length) {
            // Step 1: remove expired elements, that don't belong to the window
            while (!window.isEmpty() && window.peekFirst() < left) {
                window.pollFirst();
            }

            // incoming number for current window
            int incoming = nums[right];

            // Step 2: get ridda, like snoop said
            removeSmaller(window, nums, incoming);

            // Step 3: now add insert into the window
            window.offerLast(right);

            // Step 4: update answer, with current maximum, seeeeyuhhhh 🗣️
            answer[index] = nums[window.peekFirst()];

            // update index, slide window
            index++;
            left++;
            right++;
        }

        return answer;
    }

    private Deque<Integer> buildWindow(int[] nums, int k) {
        /** Algorith to populate deque window
         * For each num, firstly poll all elements from the end, less than or equal to num
         * If num is smaller than the last queue element, simply add
         * In this manner, we are able to build a sorted queue with descending order
         */
        Deque<Integer> window = new ArrayDeque<>();
        for (int i = 0; i < k - 1; i++) {
            int num = nums[i];
            // first poll all smaller elements
            removeSmaller(window, nums, num);
            // finally, offer index of num into the window
            window.offerLast(i);
        }

        return window;
    }

    private void removeSmaller(Deque<Integer> deque, int[] nums,  int num) {
        while (!deque.isEmpty() && nums[deque.peekLast()] <= num) {
            deque.pollLast();
        }
    }
}
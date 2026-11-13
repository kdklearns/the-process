package org.kdklearns.neetcode_250.m_03_sliding_window.q_07_find_k_closest_elements;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> window = new ArrayList<>();
        int[] absolute = new int[arr.length];
        // creating array to store absolute difference with x
        for (int i = 0; i < arr.length; i++) {
            absolute[i] = Math.abs(arr[i] - x);
        }

        // create a first window
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += absolute[i];
            window.add(arr[i]);
        }

        // two pointers helping to slide window
        int left = 0;
        int right = k;
        int minSum = currentSum;
        while (right < arr.length) {
            currentSum += absolute[right] - absolute[left];
            if  (currentSum < minSum) {
                minSum = currentSum;
                window.removeFirst();
                window.add(arr[right]);
            }
            left++;
            right++;
        }

        return window;
    }
}
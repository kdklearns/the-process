package org.kdklearns.neetcode_250.m_02_two_pointers.q_12_boats_to_save_people;

import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int n = people.length;
        int left = 0;
        int right = n - 1;
        int boats = 0;

        while (left < right) {
            int w1 = people[left];
            int w2 = people[right];
            int combinedWeight = w1 + w2;

            if (combinedWeight <= limit) {
                left++;
                right--;
            } else if (w1 >= limit || w1 > w2) {
                left++;
            } else if (w2 >= limit || w2 > w1) {
                right--;
            } else {
                // w1 == w2 im assuming lol, randomly move any lmaooooo
                left++;
            }
            // under uny case, one iteration means one boat has now been used
            boats++;
        }

        // unchecked weight seeeeyuhhhh
        if (left == right) {
            boats++;
        }

        return boats;
    }
}
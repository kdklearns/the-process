package org.kdklearns.neetcode_250.m_02_two_pointers.q_12_boats_to_save_people;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] people = { 3, 5, 3, 4 };
        int limit = 5;

        Solution s = new Solution();
        System.out.println("people's: " + Arrays.toString(people));
        System.out.println("limit of each boat: " + limit);
        System.out.println("total boats needed: " + s.numRescueBoats(people, limit));
    }
}

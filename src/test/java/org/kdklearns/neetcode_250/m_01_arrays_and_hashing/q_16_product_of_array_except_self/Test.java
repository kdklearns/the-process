package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_16_product_of_array_except_self;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4 };
        int[] l2r = new int[nums.length];
        l2r[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            l2r[i] = l2r[i - 1] * nums[i];
        }

        System.out.println("left to right: " + Arrays.toString(l2r));

        int[] r2l = new int[nums.length];
        r2l[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            r2l[i] = r2l[i + 1] * nums[i];
        }
        System.out.println("right to left: " + Arrays.toString(r2l));

        int[] out = {24,12,8,6};
        System.out.println("expected o/p: " + Arrays.toString(out));

        // I think the lord is with me today, seeeeyuhhhhhhh 🗣️
        int[] answer = new int[nums.length];
        answer[0] = r2l[1];
        for (int i = 1; i < answer.length - 1; i++) {
            answer[i] = l2r[i - 1] * r2l[i + 1];
        }
        answer[answer.length - 1] = l2r[answer.length - 2];
        System.out.println("my solution: " + Arrays.toString(answer));

        // Testing submitted solulu 🤤
        Solution solulu = new Solution();
        System.out.println(Arrays.toString(solulu.productExceptSelf(nums)));
    }
}

package org.kdklearns.neetcode_250.m_03_sliding_window.q_02_best_time_to_buy_and_sell_stock;

class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
        int buy = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            if (prices[i] - buy > answer) {
                answer = prices[i] - buy;
            }
        }
        return answer;
    }
}
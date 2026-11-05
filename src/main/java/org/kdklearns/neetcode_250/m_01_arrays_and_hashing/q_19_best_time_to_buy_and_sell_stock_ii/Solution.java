package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_19_best_time_to_buy_and_sell_stock_ii;

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        // edge case
        if (n == 1) {
            return 0;
        }

        // pointers
        int buy = 0;
        int sell = 0;

        // carry forwarding sum using two pointers
        int max = 0;
        while (buy < n && sell < n) {
            if (buy == sell) {
                sell++;
                continue;
            } else if (prices[sell] <= prices[buy]) {
                buy = sell;
                continue;
            }

            // letting the pointer travel, as long as ascending/increasing profit
            while (sell > 0 && sell < n && prices[sell] > prices[sell - 1]) {
                sell++;
            }

            // resetting sell pointer to where highest current price lies
            sell--;

            int profit = prices[sell] - prices[buy];
            max += profit;

            // updating both pointers
            buy = sell;
            sell++;
        }

        return max;
    }
}
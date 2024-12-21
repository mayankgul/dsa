// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

// You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different
// day in the future to sell that stock.
//
// Return the maximum profit you can achieve from this transaction.
// If you cannot achieve any profit, return 0.

package arrays.BestTimeToBuyAndSellStock;

public class Solution {
    int[] prices;
    int profit;

    public Solution (int[] prices) {
        this.prices = prices;
    }

    // brute force solution
    public void firstSolution () {
        this.profit = 0;

        for (int i = 0; i < this.prices.length; i++) {
            for (int j = i + 1; j < this.prices.length; j++) {
                if ((this.prices[j] - this.prices[i]) > profit) {
                    this.profit = this.prices[j] - this.prices[i];
                }
            }
        }
    }

    // first optimised solution
    public void secondSolution () {
        int[] aux_prices = new int[this.prices.length];
        aux_prices[this.prices.length - 1] = this.prices[this.prices.length - 1];

        for (int i = this.prices.length - 2; i >= 0; i--) {
            aux_prices[i] = Math.max(this.prices[i], aux_prices[i + 1]);
        }

        this.profit = 0;

        for (int j = 0; j < this.prices.length; j++) {
            int profit = aux_prices[j] - this.prices[j];

            if (profit > this.profit) {
                this.profit = profit;
            }
        }
    }
}

package com.primaryAlgorithm.array_;

/**
 * @Author: Song-zy
 * @Date: 2021/9/25 13:39
 * @Description:
 * 给定一个数组 prices ，其中prices[i] 是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 示例：
     * 输入: prices = [7,1,5,3,6,4]
     * 输出: 7
     * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出,
         *这笔交易所能获得利润 = 5-1 = 4 。
     * 随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出,
         * 这笔交易所能获得利润 = 6-3 = 3 。
 */
public class BestTimeOfStock {
    public static void main(String[] args) {
        Solution_02 solution = new Solution_02();
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(solution.maxProfit(arr));
    }
}
class Solution_02 {
    public int maxProfit(int[] prices) {
//        int index = 0;
        int profit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i+1]>prices[i]){
//                index ++;
                profit += prices[i+1]-prices[i];
            }
        }
        return profit;
    }
}

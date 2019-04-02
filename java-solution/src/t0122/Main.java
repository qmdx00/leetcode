package t0122;

/**
 * @author yuanweimin(aszed)
 * @title best-time-to-buy-and-sell-stock-ii
 * @id #0122
 */

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 *
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */

// greedy
class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int profit = 0;
        for (int i = 0; i < len - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {1,2,3,4,5};
        System.out.println(solution.maxProfit(prices));
    }
}

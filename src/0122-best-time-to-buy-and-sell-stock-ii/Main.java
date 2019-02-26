/**
 * @author yuanweimin(aszed)
 * @title best-time-to-buy-and-sell-stock-ii
 * @id #0122
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
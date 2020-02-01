package array;

/*      Say you have an array for which the ith element is the price of a given stock on day i.
        Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
        Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

        Example 1:

        Input: [7,1,5,3,6,4]
        Output: 7
        Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
        Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
        Example 2:

        Input: [1,2,3,4,5]
        Output: 4
        Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
        Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
        engaging multiple transactions at the same time. You must sell before buying again.
        Example 3:

        Input: [7,6,4,3,1]
        Output: 0
        Explanation: In this case, no transaction is done, i.e. max profit = 0.*/
public class The_Stock_Max_Profit {
    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        Solution test = new Solution();
        int maxProfit = test.maxProfit(a);
        System.out.println("最大利润为：" + maxProfit);
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int i = 0;
        int j;
        while (i < prices.length - 1) {
            if (prices[i + 1] < prices[i])
                i++;
            else {
                j = i + 1;
                while (j < prices.length - 1) {
                    if (prices[j + 1] < prices[j]) {
                        max += prices[j] - prices[i];
                        i = j + 1;
                        break;
                    } else {
                        j++;
                        max += prices[j] - prices[i];
                        i = j;
                    }

                }
            }
        }
        return max;
    }
}
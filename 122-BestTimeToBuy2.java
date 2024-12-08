// need to find a profit and check when is the best timing to buy stocks

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0]; //timing to buy
        int profit = 0; // expected profit

      // iterate from [0] to [length]
        for(int i = 0; i < prices.length; i++){
            if(buy < prices[i]) //when bigger value comes
            {
                    profit += prices[i] - buy; //profite is the difference between prices[i] and purchase
            }
            buy = prices[i]; //compare all the [i] **be careful not to put into the if statement
        }
        return profit;
    }
}

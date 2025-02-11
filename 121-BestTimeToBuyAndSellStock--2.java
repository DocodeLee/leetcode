//in the nums list we need to find a best way when give us the best profit
// code under is pass the test but time efficiency was bad

class Solution {
    public int maxProfit(int[] prices) {
        //prices[i] - prices[j] find min
        int profit = 0;
        int day = 0;

        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j<prices.length; j++){
                if((prices[j]-prices[i]) > profit){
                    profit = prices[j] - prices[i];
                    day = i;
                }
            }
        }
        return profit;
    }
}

//solution
class Solution {
    public int maxProfit(int[] prices) {
        // we are going to get prices info
        // need to return profit (int)
        // two pointer O(n^2) is not profer as input too big

        int buy = Integer.MAX_VALUE; // set the buy price > lower buy price will be better
        int profit = 0; // profit set to 0
        for(int i =0; i < prices.length; i++){
            if(prices[i] < buy){ 
                buy = prices[i];  // ask the buy price first>
            }
            // if statement under can be replaced by > profit = Math.max(profit, prices[i] - buy);
            if(profit < prices[i] - buy){ // compare the profit with current and new challengers.
                    profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
// this is slower than upper solution ( maybe Math. problem)
class Solution {
    public int maxProfit(int[] prices) {
        
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            buy = Math.min(buy, prices[i]);
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }
}

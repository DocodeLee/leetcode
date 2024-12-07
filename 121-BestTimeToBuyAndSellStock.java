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
        //prices[i] - prices[j] find min
        int buy = prices[0]; //for the buy day we just need to find a cheapst day
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i]; // change the int buy to the minimum value
            } else if(prices[i] - buy > profit){ //find a expected profit
                profit = prices[i] -buy; // update the profit for the max value
            }
        }
        return profit;
}
}

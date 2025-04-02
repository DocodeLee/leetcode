class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // start 0 or 1 > need to select smaller one
        // every step just take the smaller one
        // standard is when the pointer > cost.length

        int n = cost.length; // check length;
        int [] dp = new int[n+1]; // make a int array for store results
        for (int i = 2; i <= n; i++){ // i =2, use i -1, i-2
            dp[i] = Math.min(dp[i-1] + cost[i-1],dp[i-2]+cost[i-2]);
          // if we move one step we just use the the last value of the sum of the values
          // but if we move two steps, it means we need to use the sum of value before two steps
        }
        return dp[n]; // dp[n] will shows the sum of all the steps
    }
}

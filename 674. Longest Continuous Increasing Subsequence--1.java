class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int max = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                count++;
            }else{
                max = Math.max(count,max); // in here at my wrong answer i just  || max = cont
                // but we need to use Math.max >> because we need to compare
                count =1;
            }
        }
        return Math.max(count,max);
    }
}

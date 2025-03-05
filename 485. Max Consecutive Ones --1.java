// When i saw this problem i tried to count only number 1 
// so i could not find how to reset when the consequence is finished

class Solution{
  public int findMaxConsecutiveOnes(int[] nums){
    int count = 0;
    for (int i =0; i < nums.length; i++){
      if(nums[i] == 1){
        count ++;
      }
      // the thought is finished in here
    }
    
  }
}
// Solution

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0; // need to check max to return max
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++; // count up if one is there
                max = Math.max(count,max);
            }else{ // point is here if the elements is not 1 we need to reset count to 0 
              // this is why we use max and Math.max();
                count = 0;
            }
        }
        return max; // return max
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
      //set pointer
        int j = 1;
      // iterate loops
        for(int i = 1; i < nums.length; i++){
          // if the new number given  
          if(nums[i] != nums[i - 1]){
              //change the index for the new number  
              nums[j] = nums[i];
              // plus pointer until the new number appears 
                j++;
            }
        }
        return j;
    }

}

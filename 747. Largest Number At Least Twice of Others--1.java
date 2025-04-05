class Solution {
    public int dominantIndex(int[] nums) {

      // find biggest number and if it is twice bigger than second largest number return the index

        int largest = Integer.MIN_VALUE; // set largest as MIN_VALUE
        int index = 0; // set index at 0 to return

        for(int i =0; i < nums.length; i++){
            if(largest < nums[i]){ // if the ith number is bigger than largest
                largest = nums[i]; // update largest
                index = i; // set index as i
            }
        }
      // second loop
        for(int i = 0; i< nums.length; i++){
            if( nums[i] == largest) continue; 
            if(nums[i] * 2 > largest) return -1 ; // if there is bigger than half of largest return -1
        }
        return index; // or return index
    }
}


class Solution {
    public int pivotIndex(int[] nums) {
        //need to check array sum
        // first one : 0 & 0,1  second one : length-1 & length-1, length-2
      
        int rightSum = 0;
        int leftSum = 0;
      
        for (int i =0; i < nums.length; i++){
            rightSum += nums[i]; // sum the all the numbers
        }
      
        for(int i = 0; i < nums.length; i++){
            rightSum -= nums[i]; // it makes leftSum bigger and naturally decrease length

            // check after rightSum is decreased because the pivot index is the before index of rightSum
            if(leftSum == rightSum) {
                return i; // if there is same return i
            }
            leftSum += nums[i]; // increase leftSum
        }
        return -1;
    }
}

/*
Given an integer array nums, 
return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length]; // make new array with same length of nums

      // this is for default setting, because 1 is not affected by any number
        for (int i =0; i < nums.length;i++){
            answer[i] = 1; // put 1 into all index
        }

        // start from the 1 put the value except self
        int left = 1; // start from the 1 because 1 is not affected
        for(int i = 0; i < nums.length; i++){
            answer[i] *= left;
            left*= nums[i]; // left will be the multiplied value except self
        }
      
        // if left one is finish go back from the right
        int right =1;  // same with left
        for(int i = nums.length -1; i >=0; i--){ // need to start from the right end
            answer[i] *= right; // first one should not get itself so get the 1 after it gets the (new) right value
            right*= nums[i]; // right updates as the values multiplied. 0 > 0,1 > 0,1,2>>>
        }
        return answer;

    }
}

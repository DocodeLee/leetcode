// check if player can reach to the final steps
/*
Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. 
Its maximum jump length is 0, which makes it impossible to reach the last index.

*/

class Solution {
    public boolean canJump(int[] nums) {
        int position = nums[0];
        for(int i =0; i < nums.length;i++){
            if(nums[i] > position) position = nums[i];
        }
        return (position + nums[nums.length-2] > nums[nums.length-1]);
    }
}

// i solved by this code but this code cannot solve when the length is less than 2

//solution
// we need to think about "Can we reach to the last index?"
// if we can go last steps we return true
class Solution {
    public boolean canJump(int[] nums) {
        int targetNum = nums.length -1; //we need to go last index
        for(int i = nums.length-2; i>=0; i--){ 
            if(targetNum <= i + nums[i]) targetNum = i; //calculate does nums[i] values can send  us to last index
        }
        return targetNum ==0; //if we can go to the last index it means we can reach to the [0] points
    }
    
}

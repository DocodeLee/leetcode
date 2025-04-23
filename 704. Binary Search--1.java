// code for binary search

class Solution {
    public int search(int[] nums, int target) {
        int left = 0; //set to 0 index
        int right = nums.length -1; // set to last index

        while (left <= right){
            int mid = left + (right - left) /2; // check mid with as index


          // divide the situation
            if(nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){ // if target is on right side
                left = mid+1; // move left
            }else{ // if target is small than mid index
                right = mid -1; // move right to middle
            }
        }
        return -1;
    }
}

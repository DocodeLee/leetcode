// from int arrays need to find a index to put value
// ex > [1,3,5,6] if target is 5 return 2
// if target is 2 return 1;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0; // set the default index

        for(int i = 0; i<nums.length; i++){
            if(target == nums[i]) index = i; // if there is target return that index
            if(target > nums[i]) index = i+1; // if there is no target number return the index next of the closeest number
        }

        return index;
    }
}

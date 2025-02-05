// from int arrays need to find a index to put value
// ex > [1,3,5,6] if target is 5 return 2
// if target is 2 return 1;


// I thougth these
class Solution {
    public int searchInsert(int[] nums, int target) {
        // we will get sorted array and need to find target
        // return the index if the target is founded, but no found the index where it would be
        // algorithm should be O(log n)

        int i = 0; // set int to return index
        for( int num : nums){
            
            if(num < target){ // if num is small increase the index
                i++;
            }
            if(num == target) {
                return i; // if target found return i
            }
            if(num > target){
                return i; // and if the 
            }
            i++;
        }
            return i;
    }
}


// answer

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

// answer 2
class Solution {
    public int searchInsert(int[] nums, int target) {
        // we will get sorted array and need to find target
        // return the index if the target is founded, but no found the index where it would be
        // algorithm should be O(log n)

        int i = 0; // activate int i to track the index
        
        while(i < nums.length && nums[i]<target){ // if i is less than length, number is less than target
            
            i++; // increase i 
        }
        return i; // return i
    }
}

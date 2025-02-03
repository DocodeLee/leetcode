class Solution { // TIme O(n) > pointer  Space O(1) > do not store
    public int removeDuplicates(int[] nums) {
        // array is sorted decreasing order > same number will be next
        // from array we need to remove the duplicate > but do not need to change length

        // return the unique number and return the number of unique numbers
        // input size is ten thousands, and could be negative value

        // need to compare the values > how about two pointer
        if(nums.length == 0) return 0; // side case

        int i = 1; // why we start from 1 ? > the 0 index is always unique so this is optimization

        for(int j = 1; j < nums.length; j++){ //iterate
            if(nums[j] != nums[i-1]){ //[i-1] > start from 1 but need to check 0 and 1 is different or not
                // if new value founded
                nums[i] = nums[j]; // change with i index
                i++; // move i to next
            }
        }
        return i; 

    }
}

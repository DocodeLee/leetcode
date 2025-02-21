

class NumArray {
    int[] res; // declare new instance

    public NumArray(int[] nums) { // constructor which get arrays
        // initialize runngin sum array
        this.res = new int[nums.length];  // make a new int[] with nums.length
        this.res[0] = nums[0]; //set the first index as 0;

        // compute running sum
        for(int i = 1; i < nums.length; i++){
            this.res[i] = this.res[i - 1] + nums[i]; // the [i] value will be the sum of [i-1] and [i]
        }

    }
    
    public int sumRange(int left, int right) { // method sumrange
        return left > 0 ? this.res[right] - this.res[left -1] : this.res[right]; 
        // if left is bigger than 0 rigth should be gbigger than 0
        // if left is 0 we need to return the [right] 
    }
}

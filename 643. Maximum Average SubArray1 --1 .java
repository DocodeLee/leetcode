// Wrong method : I only minus the side numbers
class Solution {
    public double findMaxAverage(int[] nums, int k) {
    
        Arrays.sort(nums);

        double sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += (double) nums[i];
        }
        for(int i = 0; i < k/2 ; i++){
            sum -= (double) nums[i];
            sum -= (double) nums[nums.length - i -1];
        }
        
        double result = sum / (double) k ;
        return result;
    }
}

// movign window ( test section for minus)
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = k;
      
        double sum = 0;
        double max = 0;
      
        for(int r =0; r < k; r++){
            sum += nums[r]; // this is the most basic with k elements 
          // from 0 to k -1
        }
        max = sum;

      //sliding window
        while( j != nums.length){
            sum += nums[j] - nums[i]; // add Kth elements and minus the first one
            i++; // move pointers
            j++; // move pointers
            if(max < sum){ // if sum biggers
                max = sum; //chagne max;
            }
        }
        return max/k;
    }
}

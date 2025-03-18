// wrong method
class Solution {
    public int maximumProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int num : nums){
            if(num >= first){
                third = second;
                second = first;
                first = num;
            }else if( num >= second && num < first){
                third = second;
                second = num;
            }else if ( num >= third && num < second){
                third = num;
            }
            
        }
        return first * second * third;
    }
}

// this is only get biggest third number
// we need to consider minus number also

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums); // sort array

        int n = nums.length;

      // to get biggset combination (multiple the last three elemetns or, if tere is minus
      // two smallest minus and one plus 
        return Math.max(nums[n-1] * nums[n-2] * nums[n-3],nums[0] * nums[1] * nums[n -1]);
    }
}

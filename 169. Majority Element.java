class Solution {
    public int majorityElement(int[] nums) {

      //sort the arrays
        Arrays.sort(nums);
        int n = nums.length; // check the length
        return nums[n/2]; // return the number in the center +1
    }
}

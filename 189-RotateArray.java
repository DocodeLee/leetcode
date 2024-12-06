/* we need to rotate array, with given arrays and given index,
the index shows the number of value we need to rotate
[1,2,3,4] & 2 >>> [3,4,1,2]
*/
class Solution {
    public void rotate(int[] nums, int k) {
      //
        k = k % nums.length; // this is for if k is bigger than nums.length
        // reverse is not exist method, imagine that we could solve this problem if we have reverse()
        reverse(nums,0,nums.length-1); // reverse all the arrays
        reverse(nums,0,k-1); // reverse one more time to the [k-1] index
        reverse(nums,k,nums.length-1); // reversre one more time from k to nums.length -1
    }
  // and we need to make reverse()
    public void reverse(int[] nums, int start,int end){
        while(start < end){ //need to change the value until the all the values are reversed
            int temp = nums[start]; // make temp to store the value in array
            nums[start] = nums[end]; // change the values
            nums[end] = temp; // put the temp value in to the [end]
            // through ++ and -- we can change the all the values
            start++;
            end--;
        }
    }
}

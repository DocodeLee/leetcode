
        // Finding missing number 
        // only one is minus so the length is the number
      // so accessing the sum would be faster
class Solution {
    public int missingNumber(int[] nums) {
    //O(n), O(1)

        int number = nums.length;
        int sum = number * (number + 1) /2;

        for (int num : nums){ 
            sum = sum - num;
        }
        return sum;
    }
}

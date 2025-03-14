//give integer array , they are even numbers can be pairs
// return the maximum possible sum from min(ele1,ele2)

// to return the maximum value need to pair with nearst value
// sort the array and get min
class Solution {
    public int arrayPairSum(int[] nums) {
     int result = 0;
     Arrays.sort(nums);
     for(int i =0; i < nums.length/2;i++){
        int j = 2*i;
        result += Math.min(nums[j],nums[(j+1)]);
     }
     return result;
    }
}
// looks not efficient 

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // actaully if we sort the array the even order's number is smaller 
        int n = nums.length;
        int ans = 0;
        for(int i =0; i < n; i +=2 ) ans+= nums[i]; //i can bigger twice using i+=2 / just add to answer directly
        return ans;
    }
}

// we need to check how many steps take to reach last index

//[2,3,1,1,4]
// result = 2

class Solution {
    public int jump(int[] nums) {
      // need to set the inital value start from 0;
        int jumps =0;
        int currentEnd = 0;
        int farthest = 0;

        for(int i =0; i < nums.length -1; i ++){
            farthest = Math.max(farthest, i + nums[i]); //check the current point where is the farthest point
            if(i == currentEnd){
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}

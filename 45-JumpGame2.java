// we need to check how many steps take to reach last index

//[2,3,1,1,4]
// result = 2

class Solution {
    public int jump(int[] nums) {
      // need to set the inital value start from 0;
        int jumps =0;
        int currentEnd = 0;
        int farthest = 0;

        for(int i =0; i < nums.length -1; i ++){ //nums.length -1 = 4
            farthest = Math.max(farthest, i + nums[i]); //check the current point where is the farthest point
            // i = 0 : farthest = 2 > jump++, currentEnd = 2
            // i = 1 : farthest = 4 x
            // i = 2 : farthest = 4 > jump ++, currentEnd = 4
            // i = 3 : farthest = 4 
            if(i == currentEnd){
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}

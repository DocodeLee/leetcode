// we are going to get array and wants to move 0 to backward.
// but the problem is we do not want to change other numbers order

// {0 , 1, 2, 0, }
// {1,2,0,0}

// could not think about method i just did this

// O(n^2), O(1)

//brutal force
class Solution {
    public void moveZeroes(int[] nums) {
        //first i jsut try to exchange the position
        // but the point is move to forward not changing array    
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] == 0){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[j] != 0){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        i ++;
                    }
                }
            }
        }
    }
}

// solution
// when i got this problem i thought about two pointer but could not solve as two pointer
// i tried to change standard as start but the solution standard is end pointer
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0; // declare left as pointer1

        for(int right = 0; right< nums.length; right++;){ // delcare right from 0
            if(nums[right] !=0 ){ // if 0 right pass and only send the numbers to front
                int temp = nums[right]; // store temporarily 
                nums[right] = nums[left]; // exchange
                nums[left] = temp; // exchange 
                left++; // move left
            }
        }
    }
}
//  Why this is possibel > this problem is just sending the number except 0 to the forhead;

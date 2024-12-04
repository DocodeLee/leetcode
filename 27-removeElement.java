class Solution {
    public int removeElement(int[] nums, int val) {

      //set the pointer to 0
        int index = 0;
      //iterate the function
        for(int i =0; i < nums.length; i++){
          //if number is not same with val  
          if(nums[i] != val){
                nums[index] = nums[i]; // put the nums[i] into [index]position
                index++; //as index they sorted by ordered
            }
        }
        return index;
    }
}

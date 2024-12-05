// if we get the Arrays we need to remove duplicates more than 2
class Solution {
    public int removeDuplicates(int[] nums) {
      // check the legnth. if the length is less than 2 we don't need to consider the duplicates just return
        int n = nums.length;
        if(n <= 2){
            return n; // smaller than 2 we can just return n
        }
    // n is bigger than 2 
            int j =2;  // set the pointer to 2, because nums[0], nums[1] does not need to consider
        for(int i = 2; i < nums.length;i++){ // iterate the i (pointer two)
            if(nums[i] != nums[j-2]){ //check the value if it is same with the j-2 one
                nums[j] = nums[i]; // if different just change it, if same, only i++ happen and somewhere the nums[j] = nums[i] will change the order
                j++; //if if phrase works, need to do j++ to move to next
            }
        }
            return j; // need to return j

    }
}

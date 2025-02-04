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

class Solution {
    public int removeElement(int[] nums, int val) {
        // arrays and int given
        // going to remove the val value
        // input and size is not that big
        // return int as not same with val

        // time : O(n) > Space O(1)
        int i = 0;
        // In here i need to think about why i initiate i >> as loop proceed i need to track

        for(int k =0; k < nums.length; k++){ // iterate the array
            if(val != nums[k]){ // if there is new value
                nums[i] = nums[k]; // change it with the new things
                i++; // i moves to the next and it will be the new length 
            }
        }

        return i;


    }
}

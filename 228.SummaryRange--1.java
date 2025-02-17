class Solution {
    public List<String> summaryRanges(int[] nums) {
        //we get int array and need to sort it 
        // make a list and just show the first and last num
        
        // Time Complexity O(n) , Space Complexity O(1)
        // i had no idea
        
        List<String> output = new ArrayList<>(); // first make a List<String> to return
        if (nums.length == 0) return output; // edge case > if length is 0, just return empty output;

        int start = nums[0]; //set pointer 1 on the head value
        
        for(int i = 1; i<= nums.length; i++){ // start iteration from the index 1
            if( i == nums.length || nums[i] != nums[i-1] +1){ // if i comes to the last element or the consecution end
                // one more if statement
                if(start == nums[i-1]){ //check the i-1 >> here means it consider whether the solo range 
                    output.add(String.valueOf(start)); // add it as String 
                    //String.valueOf() helps to put int to String
                }else{ // when code comes to else it means ranges are bigger than 2
                    output.add(start + "->"+ nums[i-1]); // if string is mixed the value accepted as String 
                }
                if(i < nums.length) start = nums[i]; // if i is not on end; update start pointer to nums[i[
            }
        }

        return output;
        

    }
}

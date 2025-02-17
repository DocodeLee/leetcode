class Solution {
    public List<String> summaryRanges(int[] nums) {
        //we get int array and need to sort it 
        // make a list and just show the first and last num
        
        // Time Complexity O(n) , Space Complexity O(1)
        /List<String> output = new ArrayList<>();
        if (nums.length == 0) return output;

        int start = nums[0];
        
        for(int i = 1; i<= nums.length; i++){
            if( i == nums.length || nums[i] != nums[i-1] +1){
                if(start == nums[i-1]){
                    output.add(String.valueOf(start));
                }else{
                    output.add(start + "->"+ nums[i-1]);
                }
                if(i < nums.length) start = nums[i];
            }
        }

        return output;
        

    }
}

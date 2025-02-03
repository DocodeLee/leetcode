class Solution {
    public int[] twoSum(int[] nums, int target) {
        // we got Integer array and target int
        // i need to find two value which makes target and return their indices

        // numbers can be negative & only one solution available
        // cannnot use same value twice
        // array is not sorted

        // nested loop is not proper for large input so need to find other way

        // the best way is not check repeteadly and save the values >> HashMap is the possible access

        
        Map<Integer, Integer> numMap = new HashMap<>(); // making new HashMap
        
        for(int i = 0; i < nums.length; i++){ // start iterate
            int complement = target - nums[i]; // 2 > every loop check the complement
            
            if(numMap.containsKey(complement)){ // this is why we set the nums[i] as key
                return new int[]{numMap.get(complement),i};  // return new array with the get method 
                // get method return the values from the key info
            } //3
                
            numMap.put(nums[i], i); // 1 > put the key is the nums[i], value is index
        }
        return new int[]{}; // no solution case
    }
}

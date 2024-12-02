class Solution {
    public int[] twoSum(int[] nums, int target) {
      // make a hashMap <Key, Value>
        Map<Integer, Integer> complements = new HashMap<>();
      // iterate the loops
        for(int i =0; i <nums.length;i++){
            // set the hashMap index
          Integer complementIndex = complements.get(nums[i]);
            // if there is no history
            if(complementIndex != null){
              // return index, and the partner index
              return new int[]{i, complementIndex};
              
            }
            // put() is for set the hashMap
            complements.put(target - nums[i], i);
        }
        // this is just for defaults
        return nums;
    }
}

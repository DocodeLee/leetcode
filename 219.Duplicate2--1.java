     //we will get int array and integer k
        // duplicates should be near than k value

// i think we need to keep remember the past value so think out the Map and tried to store value and index

// Time : O(n) > Space O(n)

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
   
        Map<Integer,Integer>  m = new HashMap<>(); // make a HashMap 

        for(int i = 0; i < nums.length;i++){ // iteration
            
            if(m.containsKey(nums[i])){ // if duplicates appear 
                if(i - m.get(nums[i]) <= k){ // compare the index (index is saved as value)
                    return true; // if there, return true;
                }
            }
            m.put(nums[i],i); // here is the first line put the memebers with (value, index) pair
        }
        return false; // if doesn't exist > return false last;


    }
}

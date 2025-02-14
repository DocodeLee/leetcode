// majority means more than n/2 when length is n


// most simple O(n logn)
class Solution {
    public int majorityElement(int[] nums) {

      //sort the arrays
        Arrays.sort(nums);
        int n = nums.length; // check the length
        return nums[n/2]; // return the number in the center +1
    }
}

// hashMap
// as we store the value as key we should think about hashMap
class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> m = new HashMap<>(); // declare new Map for store
        int res = 0; // result
        int appear = 0; // it means how mu

        for(int num : nums){ // iteration
            m.put(num,1 + m.getOrDefault(num,0)); // put num(key) +1 value >> Map.getOrDefault(key,default) 
            if(m.get(num) > appear){ //if value has bigger than current appear
                res = num; // update key this time
                appear = m.get(num); //update appear
            }
        }
        return res;
    }
}

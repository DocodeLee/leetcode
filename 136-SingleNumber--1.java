// We get int array (not empty
//need to return single number
// linear run time O(n), space = constant O(1)
// want to use HashMap > if i use HashMap the space complexity becomes O(n)


// if we just solve the problem there are 3 approaches
// 1, brutal force 
class Solution {
    public int singleNumber(int[] nums) {
        for(int i =0; i<nums.length;i++){ // first loop from [i]
            int count = 0; // make int value for check the single
            for(int j =0; j<nums.length; j++){ // set first pointer on [i] move second pointer 'j'
                if(nums[i] == nums[j]){ // if there are same number
                    count++; // count +
                }
            }
            if(count == 1){ // 1 means only it self was same value
                return nums[i]; 
            }
        }
        return -1; // if no return -1
    }
}

//2. HashSet  : Time Complexity O(n) > space Complexity O(n)
class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); //HashSet only save value, HashMap save Key and value
        for(int num : nums){ // iterate numbers
            if(set.contains(num)) 
            {
                set.remove(num); // if there is num already remove that from HashSet
            }
            else
            {
                set.add(num); // this is the first code will run in if statement
            }
        }

        return set.iterator().next(); //iterator() > iterate in Hashset / next() > return the very first value
    }
}

//3. XOR accessment
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0; // set 0 to track the number add correctly
      
        for(int num : nums){
            result^= num; // ^= XOR statement > it declines when the same values come else add the value to result
        }
        return result;
    }
}

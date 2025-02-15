class Solution {
    public boolean containsDuplicate(int[] nums) {
        //input int array, output boolean
        //checking through array? > HashSet or HashMap

        //time O(n) space O(n)
        
        Set<Integer> m = new HashSet<>(); //we don't need to count so just use HashSet

        for(int num : nums){ //iteration
             // must check if contains because we need to consider the previous results;
            if(m.contains(num)){
                return true;
            }
            m.add(num); //hashSet use add """ HashMap use put (key,value)
        }
        return false;
    }
}

// method 2 

// time O(n log(n) ) space O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }

        return false;
    }
}

//method 3
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        
        for(int num : nums){
            numSet.add(num);
        }

        return numSet.size() < nums.length;
    }
}


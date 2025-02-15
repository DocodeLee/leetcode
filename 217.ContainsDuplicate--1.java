class Solution {
    public boolean containsDuplicate(int[] nums) {
        //input int array, output boolean
        //checking through array? > HashSet or HashMap

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

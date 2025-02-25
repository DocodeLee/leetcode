// getting arrays and we need to find disappeard number [1,n]
// length will be the n, and Set will help to find the disappered number

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int max = nums.length;

        Set<Integer> s = new HashSet<>();

        for(int num : nums){
            s.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= max; i++){
            if(!s.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}

// this code is not efficient, O(n), O(n) >> i think this is the just java's limit...maybe

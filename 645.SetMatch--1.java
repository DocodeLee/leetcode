// The Method I thought (wrong)
// make a set and list and put the number into list when HashSet already has value.

// but in this case we cannot get the all index of duplicates
class Solution {
    public int[] findErrorNums(int[] nums) {
        // need to return the index
        
        Set<Integer> set1 = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        
        for(int i = 0; i < nums.length; i++){
            if(set1.contains(nums[i])){
                result.add(i);
            }
            set1.add(i);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}


// 
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2]; // make a int array
        int n = nums.length; // check length


      // this loop was little bit difficult to understand but used the specification that
      // if n = 3  the number is starts from 1 to 3; 
        for(int i = 0; i < n; i++){
            int num = Math.abs(nums[i]);

            if(nums[num - 1] < 0){
                result[0] = num;
            }else{
                nums[num -1 ] = - nums[num -1];
            }
        }

        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }
}

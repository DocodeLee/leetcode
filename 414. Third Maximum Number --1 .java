// return third maximum number
// if the there are no more than 3 types of int just return the maximum number of 

// i tried to solve this with Array.sort(array) > but this problem is starting from the smaller value


// simplest method
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s = new HashSet<>(); // make set
        for(int n : nums) s.add(n); // add 

        if(s.size() < 3) return Collections.max(s); // if less than 3 . just return max 
       //else > remove the two max > max will be third
        s.remove(Collections.max(s));
        s.remove(Collections.max(s));

        return Collections.max(s);
    }
}

// Faster method
class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for(int num : nums){
            if(num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }else if(max1 > num && max2 < num){
                max3 = max2;
                max2 = num;
            }else if (max2 > num && max3 < num){
                max3 = num;
            }
        }
        return max3 != Long.MIN_VALUE ? (int) max3 : (int) max1;

    }
}

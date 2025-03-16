// Return the subsequence with the values difference 1
// Method 1 is sorting array
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums); // sort Arrays
        // set two pointer on 0 & 1
        int tail = 0;
        int head = 1;
        
        int res = 0;

        while(head < nums.length){ // use while loop until the r goes to length th value
            int diff = nums[head] -nums[tail]; // check different
            if(diff == 1) res = Math.max(res, head-tail+1); // if different is 1 update result max(res,r-l+1(new res))
            if(diff <= 1) head++; // and if it is less than <=1 r++
            else tail++; // update l, to remake the arrays first
        }
        return res; // return result

    }
}

// Method 2 : HashSet


class Solution {
    public int findLHS(int[] nums) {
        
        Map<Integer,Integer> freq = new HashMap<>(); // new Map for checking frequency
        
        for(int num : nums){ // for each num
            freq.put(num,freq.getOrDefault(num,0)+1); // count the frequency
        }
        
        int res = 0;
        for(int num : freq.keySet()){ // for keySet
            if(freq.containsKey(num+1)){ // if nums has num and (num+1)
                res= Math.max(res, freq.get(num) + freq.get(num+1)); // update result with res and addition of num and num+1
            }
            
        }
        return res; //return result
    }
}

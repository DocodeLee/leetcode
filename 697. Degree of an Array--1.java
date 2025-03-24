class Solution {
    public int findShortestSubArray(int[] nums) {
        //need to store the numbers into Map
        // check frequency
        // check the smallest length of most frequency values

        Map<Integer,Integer> map1 = new HashMap<>();
        
        for(int num : nums){
            map1.put(num,map1.getOrDefault(num,0) +1);
        }

        int maxCount = Integer.MIN_VALUE;

        for(int j : map1.keySet()){
            maxCount = Math.max(maxCount,map1.get(j));
        }

        HashMap<Integer,Integer> map2 = new HashMap<>();
        
        int windowSize = Integer.MIN_VALUE;
        int res = Integer.MAX_VALUE;
        int i = 0,j=0;

        while(j < nums.length){
            map2.put(nums[j], map2.getOrDefault(nums[j],0)+1);

            windowSize = Math.max(windowSize,map2.get(nums[j]));

            while(windowSize == maxCount){
                res=Math.min(res,j-i+1);
                map2.put(nums[i],map2.get(nums[i])-1);
                if(map2.get(nums[i])==0) map2.remove(nums[i]);
                if(nums[i] == nums[j])windowSize--;
                i++;
            }
            j++;
        }
        return res;
    }
}

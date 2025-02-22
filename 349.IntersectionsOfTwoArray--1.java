// going to get two arrays and need to find duplicates

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> dupl = new HashSet<>(); // declare HashSet for store the nums1 values
        List<Integer> result = new ArrayList<>();
      // at this time i realaize the List<Integer> and int[] is different
      //List<Integer> is collection type and size is not fixed
      //but int[] needs to fix the size and only get int type vlaue

        for(int num : nums1){ // for the first arrays
            dupl.add(num); // put the values into set
        }
        for(int num : nums2){ //for the second array
            if(dupl.contains(num)){
                result.add(num); //add number if set has
                dupl.remove(num); // need to remove because if nums2 have same value the arrayList will be affected
            }
        }
        int[] result2 = new int[result.size()]; // change the List<Intger> to int[]
        for(int i = 0; i < result.size();i++){
            result2[i] =result.get(i);  // add to int[]
        }
        return result2;

    }
}

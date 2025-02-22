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


// using HashSets withou ArrayList
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // flow is similar but the different is using Set
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums2){
            if(set1.contains(num)){
                set2.add(num); // using HashSet so don't need to remove
            }
        }

        int[] result = new int[set2.size()]; // declare int[] result with size
        int i = 0;
        for(int num : set2){
            result[i++] = num; // for( int i = 0;.... >> cannot use this for loop because we cannot call the elements in Set
        }
        return result; // return results;
    }
}

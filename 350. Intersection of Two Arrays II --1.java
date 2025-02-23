//intersection of two array 
// need to put duplicate 
// it means we cannot use set
// standard is nums1 ,
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> count = new HashMap<>(); //Make hash Map to count the dupl
        List<Integer> result = new ArrayList<>(); // make a list for result List

        for(int num : nums1){
            count.put(num,count.getOrDefault(num,0)+1); //put number with count
        }
        for(int num : nums2){
            if(count.getOrDefault(num,0) >0){ // if count has num
                result.add(num); //add number
                count.put(num,count.get(num)-1); // count - 1
            }
        }
        return result.stream().mapToInt(i->i).toArray(); // change list to int ARray 
      //stream() change list<Intger> to stream of Integers
      //mapToInt() >> List Is wrapper Class Integer > int 
      //toArray()
    }
}

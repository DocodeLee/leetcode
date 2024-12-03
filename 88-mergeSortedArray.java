// solution 1
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      // set j to 0, i to m > because we need to put the nums2 in nums1 anyway  
      for(int j=0, i = m; j< n; j++){
        // put nums2 to nums1 in index[i]
            nums1[i] = nums2[j];
        // go to next index
            i++;
        }
      //sort
        Arrays.sort(nums1);
    }
}
// this method is not good because we put the variable and sort. time efficiency is low


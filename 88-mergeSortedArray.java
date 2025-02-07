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

// Using Pointers
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // we are going to get two arrays
        // m and n means the num of elements which will be merged
        //final array.length should be m+n

        //but instead be stored inside the array nums1

        // m could be 0

        // wants to use two pointer > because we merge, and need to be sorted (need to be compare)

        // time complexity O(m+n) , space complexity O(1)

        int i = m - 1; //need to -1 because index starts from 0
        int j = n - 1;
        int k = m + n - 1; //tracker for total length

        while(j >=0){ // if j comes 0 no more elements to merege
        if( i >= 0 && nums1[i] > nums2[j]){
            nums1[k--] = nums1[i--];
        }else{
            nums1[k--] = nums2[j--];
        }
        }
    }
}

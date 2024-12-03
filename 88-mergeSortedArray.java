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

        //setting 3 pointers
        int p = m+n -1; // p is the last index of nums1
        int p1 = m -1; // p1 is where the last value in nums1
        int p2 = n -1; // p2 is where the nums2 index

        // iterate until the index comes to null 
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){ // if nums1 value is bigger than nums2 value
                nums1[p] = nums1[p1]; // change the nums1 value to the last index
                p1--; // move pointer
                p--; //move pointer
            }else{ // when the nums2 value is bigger
                nums1[p] = nums2[p2]; // change [p] value to nums2[p2]
                p2--; // move pointers
                p--; // move pointers
            }
        }
        while(p2 >= 0 ){ // this is for case when the only nums2 has value
            nums1[p] = nums2[p2]; // put the nums2[p2] into nums1
            p2--; // move pointers
            p--; // move pointers
        }
    }
}

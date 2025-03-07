//given two arrays, if nums2 have greater value next to nums1.value return the next greater or return -1;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length]; // make a result[] to return the answer
      
        for(int i = 0; i < nums1.length; i ++){ // loop for nums1
            result[i] = -1; // put the default value as -1

            for(int j =0; j < nums2.length; j++){ // loop with the nums2
                if(nums2[j] == nums1[i]){ // if nums2 have nums2 
                    for(int k = j + 1; k < nums2.length; k++){ //start the third loop form the j+1 index
                        if(nums2[k] > nums1[i]){ // if kth value is bigger than i
                            result[i] = nums2[k]; // add result ith index > with kth index
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return result;
    }
}

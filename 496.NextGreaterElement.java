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


// use stack instead of iterating multiple times

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // step 1 : make indexArray (0 <= nums1[i], nums2[i] <= 10^4)
        
        int[] indexArray = new int[10001]; //

        // step 2 : put the elements in the indexArray
        for(int i =0; i < nums2.length; i++){
            indexArray[nums2[i]] = i; //it saves index > index to use
        }
        // step 3 : use method to simple the loop
        for(int i =0; i < nums1.length;i++){
            nums1[i] = findNextGreater(nums2, indexArray[nums1[i]]); // make method with Arrays and index of nums1
        }
        return nums1;
 
    }

    // method get nums2, and index
    public int findNextGreater(int[] nums2, int index){ 
        for(int i = index +1; i < nums2.length;i++){
            if(nums2[i] > nums2[index]) return nums2[i];
        }
        return -1;
    }
}

/*

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

*/

class Solution {
    public int strStr(String haystack, String needle) {
      // when i see the problem i just taught need to comoare the words and stopped
    // In this prob, point was : substring(index1, index2)
        for(int i =0, j = needle.length(); j <= haystack.length();i++,j++){ 
          //make a iteration i starts from 0, j starts from needle.length(). because need to minus
            if(haystack.substring(i,j).equals(needle)){ //find fist index
                return i;
            }
        }
        return -1; //if no return -1
    }
}

/*
 Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
*/

// in this case we need to compare the string with sample sentence,
// if not match decrease the number 

class Solution {
    public String longestCommonPrefix(String[] strs) {
      //handle edge case
        if (strs == null || strs.length == 0) return "";

      // set the first word as pref
        String pref = strs[0];
        int prefLen = pref.length(); // get length because we need to use this num

        for(int i =1; i<strs.length; i++){ //iterate 
            String s = strs[i]; // get the i index string
            while (prefLen > s.length() || ! pref.equals(s.substring(0,prefLen))){ //we should keep run so we use while
              // we need to decrease prefLen when the opponent is smaller than sample and if it is not equals with substringed (string from 0 to prefLen)
                prefLen--;
                if(prefLen ==0){ // it means there were no same prefix in string
                    return ""; //return "";
                }
                pref = pref.substring(0,prefLen); // if there were same prefLen 
            }
        }
        return pref; //return string

    }
}

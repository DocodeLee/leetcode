/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

*/

// Solution from me

class Solution {
    public int lengthOfLastWord(String s) {
      
        String[] split_string = s.split(" "); // split the input string and create new String array
        String a = split_string[split_string.length -1]; //get the last index world
        return a.length(); // count number
    }
}

// this solve the problems but there were more faster methods 
// The problem was if the String becomes bigger and bigger we need to cut and put as Array

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // just cut the end white space
        
        int length = 0; //set the int to return
        for (int i = s.length() - 1; i >= 0; i--) { //from the last length
            if (s.charAt(i) != ' ') { // go until space comes
                length++; // becomes biiger
            }
            else if (length > 0) { // if we met space
                break; // break 
            }
        }
        return length; // and we can return the number
    }
}

// this is more easy because we only cut space by trim()

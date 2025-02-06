/*

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

*/

class Solution {
    public int[] plusOne(int[] digits) {
      // start the iteration
        for(int i = digits.length -1; i>=0; i--){
            if(digits[i] < 9){ // if number of last index is not 9
                digits[i] +=1; // plus one to last index
                return digits; // break this there are no more reason to run after code
            }
          // but if it was 9
            digits[i] = 0; // last index will be 0
          // then it re-run the for loop until the 9 will not come back
        }

      // if there were only 9 in arrays 
        int[] newDigits = new int [digits.length + 1]; // make new array with one more length
        newDigits[0] = 1; // first number will be 1
        return newDigits;
    }
}


class Solution {
    public int[] plusOne(int[] digits) {
        //getting integer array
        // need to add 1 to the number but if 9 need to do upper
        // length is not that big

        // the problem is when 9 is on last
        // time complexity : O(N)
        // space complexity : O(1)

        // first i thougth for loop is not need but when i did not set [9,9,9] the continuous 9 would be problem
       for(int i = digits.length -1; i >=0; i-- ){ //set i from the last to the 0 so need to use >= "to check 0"
            if(digits[i] + 1 != 10){ // if it is not 10
            digits[i] +=1; // just plus 1
            return digits; // return digits
            }
           // if not
            digits[i] = 0; // first just change the [i] to 0
       } 
        int[] newDigits = new int[digits.length +1]; // make new array with length +1
        newDigits[0] = 1; // first one should be 1
        return newDigits; // return new digits
    }
}

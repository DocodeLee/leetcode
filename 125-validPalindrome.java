class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]",""); // change string to lower case
        int left = 0; // setting point index 1
        int right = s.length() -1; // setting point index 2

        while(left < right){ 
            if(s.charAt(left) != s.charAt(right)){ //use charAt() method
                return false; // if different return false
            }
            left++;
            right--;
        }
        return true; // if all was same the loop will be overed and return true



    }
}

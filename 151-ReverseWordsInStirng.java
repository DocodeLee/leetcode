/*
Input: s = "the sky is blue"
Output: "blue is sky the"
*/

class Solution {
    public String reverseWords(String s) {
        s = s.trim(); // trim first because there could be unnecessary blank / i did s.trim() but s = s.trim() is correct
        String[] str = s.split(" "); //split the string as Array based by blank

        StringBuilder ans = new StringBuilder(); // need to correct during the code so we use StringBuilder
        for(int i = str.length-1; i >= 0; i--){ //need to reverse so we put the words from the last index
            if(!str[i].isEmpty()){ //i did not do this / this needs not to put blank into ans
                ans.append(str[i]); // append() index string
                if(i >0){ // as we need space between words we use this if statement
                    ans.append(" "); // add balnk 
                }
            }
        }
        return ans.toString(); //need to return String but ans was StringBuilder so change to String()
    }
}

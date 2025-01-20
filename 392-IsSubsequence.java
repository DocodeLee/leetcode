class Solution {
    public boolean isSubsequence(String s, String t) {

      // making a two pointer for each string
        int sp = 0;
        int tp = 0;

        while(sp<s.length() && tp < t.length()){ //iterate until the length
            if(s.charAt(sp) == t.charAt(tp)){ //if there is same character in t
                sp++; // only move sp
            }
            tp++; // if no move the t pointer to next until find
        }
        return sp == s.length(); // if s pointer moves to the length moment, it returns true automatically/
    }
}

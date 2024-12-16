/*
I	1
V	5
X	10
L	50
C	100
D	500
M	1000

Input: num = 3749

Output: "MMMDCCXLIX"

change the int to String
this was very simple question
we just minus from the biggest number in index
and change it to String
*/


class Solution {
    public String intToRoman(int num) {
         // set int list for number
        int[] n = {1000, 900, 500, 400, 100, 90, 
                            50, 40, 10, 9, 5, 4, 1};
        // set String list for roman
        String[] s = {"M", "CM", "D", "CD", "C", 
                        "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int i = 0; // we are going to run from 0 index of s
        String str = new String(); // create new String 
        while(num>0){ // we only treat positive number
            if(num>=n[i]){ // if the num is bigger than index number 
                str=str+s[i]; // add alphabet into last string
                num-=n[i]; // number becomes smaller
            }else{
                i++; //if number becomes smaller than index number go to next index
            }
        }
        return str; // return the last number
    }
}

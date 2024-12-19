/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
*/

class Solution {
    public String convert(String s, int numRows) {
        //Define StringBuilders
        StringBuilder[] sbs = new StringBuilder[numRows]; //need to make StringBuilder Array
        for(int i = 0; i < numRows; i++){ 
            sbs[i] = new StringBuilder(); // make StringBuilder as elements
        }

        //Define Variables
        char[] arr = s.toCharArray(); //change string to charArray
        int n = arr.length; // get the length
        int index = 0; // set the index as 0

        //Travers zig zag
        while(index < n){
            //Go down
            for (int j =0; j < numRows && index < n; j++){ //from 0 to most below array (length-1) and until the index
                sbs[j].append(arr[index++]); //fill the character from the index(0)
            } // it goes to the next for loop when the j becomes j-1
          
            //GO up before start
            for(int j = numRows - 2; j >0 && index < n; j--){ //starts from the one step up from the bottom
                sbs[j].append(arr[index++]); // fill the character and index++ change following for loop
            }
            // for loops finish but the index < n so we go back to first point of while loop
        }
        //Combine all stringbuilders into one
        StringBuilder res = sbs[0]; // this is just set the standard to 0 becuase 0 is the starting row
        for(int i = 1; i < numRows; i++){
            res.append(sbs[i].toString()); //append the string to array orderly
        }
        return res.toString(); // change StringBuilder to String
    }
}

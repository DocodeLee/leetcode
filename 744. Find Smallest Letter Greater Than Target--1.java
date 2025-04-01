// in letters char array > need to fidn the most smallest letter greater than target

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      
        int start = 0; // set start in 0
        int end = letters.length -1; // set end into last index

        while(start <= end){
            int mid = start + (end - start) /2; // set mid into the center

          // in here we utilize that the letters is writted in sequence
            if(letters[mid] > target && ((mid == 0) || letters[mid-1] < target)){
                return letters[mid];
            }else if(letters[mid] > target){ // if the middle one is bigger than target
                end = mid - 1; // decrease end pointer
            }else { // else situation : letters[mid] < target
                start = mid + 1; // increase start pointer
            }
        }
        return letters[start % letters.length]; // return the index of 
    }
}

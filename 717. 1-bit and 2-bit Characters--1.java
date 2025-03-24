// in bit arrasy
// The first character can be represented by one bit 0.
// The second character can be represented by two bits (10 or 11).
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0; // starts i from 0
        while(i < bits.length-1){
            i += bits[i] == 0 ? 1 : 2; // if bits[i] is 0 only move 1 , if its not 0 should move two 
        }
        return i == bits.length -1 && bits[i] == 0; // check i comes to last index and last index is 0 or not
    }
}

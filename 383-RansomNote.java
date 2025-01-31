// define that ransomNote is part of magazine

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magaHash = new HashMap<>(); // make new HashMap<Character, Integer>

        for(char c : magazine.toCharArray()){ // for each character in magazine
            magaHash.put(c,magaHash.getOrDefault(c,0) + 1); // getOrDefault() : if key has value get value or put defualt
        }
       // after setting the HashMap on magaHash
        for(char c : ransomNote.toCharArray()){ // for ransomNote
            if(!magaHash.containsKey(c) || magaHash.get(c) <= 0 ){ //if magaHash does not have key or c is less than 0
                return false; // return false
            }
            magaHash.put(c, magaHash.get(c) -1); //need to decrease the value step by step
        }
        return true; // if there are no problem on if return true;
    }
}

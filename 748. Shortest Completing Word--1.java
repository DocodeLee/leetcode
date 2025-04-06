// get array and from there only count letters as letter insensitive
// need to use all leters

public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        // Step 1: Normalize the licensePlate to count only alphabetic characters
        int[] targetCount = new int[26];  
        // To store frequency of each letter in the licensePlate
        for (char c : licensePlate.toLowerCase().toCharArray()) {  
            // Convert licensePlate to lowercase and process each character
            if (Character.isLetter(c)) {   // Check if the character is a letter (ignoring numbers or spaces)
                targetCount[c - 'a']++;  
                // Increment the count of the letter in the targetCount array 
              //  (index corresponds to the letter's position in the alphabet)
            }
        }
        
        // Step 2: Find the shortest word that contains all characters of targetCount
        String shortestWord = "";  
      // Initialize the variable to store the shortest valid word, starting with an empty string
        
        for (String word : words) {  // Loop through each word in the list
            int[] wordCount = new int[26];  // Array to store the frequency of each letter in the current word
            for (char c : word.toCharArray()) {  // Loop through each character of the word
                wordCount[c - 'a']++;  // Increment the count for this letter in the wordCount array
            }
            
            // Check if the word contains all the letters required by targetCount
            boolean isValid = true;  // Assume the word is valid unless proven otherwise
            for (int i = 0; i < 26; i++) {  // Iterate through all 26 letters of the alphabet
                if (wordCount[i] < targetCount[i]) {  // If the word doesn't have enough of a particular letter from targetCount
                    isValid = false;  // Mark the word as invalid
                    break;  // No need to check further, break out of the loop
                }
            }
            
            // If valid and word is shorter, update the shortestWord
            if (isValid && (shortestWord.isEmpty() || word.length() < shortestWord.length())) {  // Check if the current word is valid and shorter than the current shortestWord
                shortestWord = word;  // Update shortestWord to the current word
            }
        }
        
        return shortestWord;  // Return the shortest word that satisfies the condition
    }
}

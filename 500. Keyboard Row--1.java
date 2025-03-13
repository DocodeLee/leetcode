// determine the word is on one row or not
class Solution {
    public String[] findWords(String[] words) {
        // Step 1. declare String for same row characters
        String firstRow = "qwertyuiop";
        String secondRow = "asdffghjkl";
        String thirdRow = "zxcvbnm";

        // Step 2. make a new list to put String (this is arrayList so need to change Array)
        List<String> list = new ArrayList<>();

        // Step 3. for each word in words check it is in row or not if it is in row add to list
        for(String i : words){
            if(isinrow(i, firstRow) || isinrow(i,secondRow) || isinrow(i,thirdRow))
            list.add(i);
        }
        // Step 4 : finally change ArrayList to Array with String
        return list.toArray(new String[0]); 
      // (create an String Array) String[0] is easier thant list.size() because no need to calculate size
      
    }

  // step 3.5 > method to check is this is one row?
    private boolean isinrow(String s, String row){ // for running need to get string and row elements
        for(char c: s.toCharArray()){ // for all character
          //indexOf() helps finding form row / Character.toLowerCase(c) : helps case independency
            if(row.indexOf(Character.toLowerCase(c)) == -1){ // if it shows -1 character is not on row
                return false;  // return false
            }
        }
        return true; // if pass return true;
    }
}

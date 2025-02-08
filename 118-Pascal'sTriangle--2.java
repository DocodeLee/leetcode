/*
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {

        //first make a return Type because we don't have nothing
        List<List<Integer>> result = new ArrayList<>();

        //if the numRows are 0
        if(numRows == 0) return result;

        //from normal
        // make a inner List<Intger>
        List<Integer> firstRow = new ArrayList<>();
        //the first row should be start from 1
        firstRow.add(1);
        result.add(firstRow);

        //from the secondRow
        for(int i =1; i < numRows; i++){
            List<Integer> prev_row = result.get(i-1); //call the previous Row
            List<Integer> current_row = new ArrayList<>();

            current_row.add(1);

            //for other elements in inner ArrayList
            for(int j =1; j < i; j++){
                current_row.add(prev_row.get(j-1) + prev_row.get(j)); 
                //add the numbers 
            }

            //after all loop add 1 to the last
            current_row.add(1);
            result.add(current_row);
        }
        return result;
        
    }
}

// Dynamic Programming

class Solution {
    public List<List<Integer>> generate(int numRows) {
        //we will get int as Row Number
        // return List<List<Integer>>

        List<List<Integer>> result = new ArrayList<>();
        if(numRows ==0){
            return result;
        }

        if(numRows ==1){
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            result.add(firstRow);
            return result;
        }
        result = generate(numRows -1);
        List<Integer> prevRow = result.get(numRows - 2);
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);

        for(int i =1; i < numRows -1; i++){
            currentRow.add(prevRow.get(i -1) + prevRow.get(i));
        }
        currentRow.add(1);
        result.add(currentRow);

        return result;
    }
}

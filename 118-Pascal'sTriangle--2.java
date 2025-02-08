/*
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
      
        List<List<Integer>> triangle = new ArrayList<>(); // make List of Integer List

        if(numRows ==0) return triangle; // edge case when the numRows is 0
        // normal case
        List<Integer> first_row = new ArrayList<>(); // make first Row
        first_row.add(1); // add 1 into arrayList
        triangle.add(first_row); // add the first list to the triangle

        // from the second row
        for(int i =1; i<numRows; i++){ //this loop will be stop at 4 but we add (1) manually under/ so i< numRows doesn't matter
            List<Integer> prev_row= triangle.get(i-1); // need prev_row info because we add the prev_row int to row
            List<Integer> row = new ArrayList<>(); // make new row as ArrayList

            row.add(1); // first element is always 1

            // inner for loop
            for(int j=1; j<i; j++){
                row.add(prev_row.get(j-1)+prev_row.get(j)); // sum of prev_row[j-1] and prev_row[j] will be the element 
            }

            row.add(1); // add 1 at last
            triangle.add(row); // add this row to triangle
        }
        return triangle;
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

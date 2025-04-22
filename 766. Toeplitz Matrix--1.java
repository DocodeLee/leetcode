
//Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.

// A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
      
        int rows = matrix.length; // rows are lengths of mtrix
        int cols = matrix[0].length; // col is first index length


      // double loop
        for(int i =0 ; i < rows -1; i++){
            for(int j =0; j < cols-1; j++){
                if(matrix[i][j] != matrix[i+1][j+1]){ // to be Toeplitz : should have same elements in [i+1][j+1]
                    return false; // != return false
                }
            }
        }
        return true;
    }
}

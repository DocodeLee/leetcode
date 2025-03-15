// need to reshape the 2D array, r : row, c : column
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if( mat.length * mat[0].length != r * c){ // if r * c is not match with mat eleements
            return mat; // return the mat
        }
      
        int[][] output = new int[r][c]; // make a new array wiith r,c combination
        for(int idx = 0; idx < r * c ; idx++){
            output[idx/c][idx%c] = mat[idx / mat[0].length][idx % mat[0].length];
          // matrix is actually the groups of the 1D arrays > columns are the standard
          // idx / c > 0,0.... until idx = c > shows the row
          // idx % c > 0,1,2,... until idx = c > shows the column 
          // same with mat(original matrix)
          
        }
        return output;
    }
}

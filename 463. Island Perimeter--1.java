
class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0; //declare perimeter
        int rows = grid.length; // rows are grid.length
        int cols = grid[0].length; // declare grid[0]

        for( int r = 0; r < rows; r++){ // two loops run
            for(int c= 0; c < cols; c++){
                if(grid[r][c] == 1){ // if land
                    perimeter += 4; // perimeter +4 (square)
                    if(r > 0 && grid[r-1][c] ==1){ // if left one is land -2
                        perimeter -= 2;
                    }
                    if(c > 0 && grid[r][c-1] ==1){ // if upper part is land -2
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
}

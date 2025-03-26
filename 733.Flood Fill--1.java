// Depth First Search // if you search from the same level > one by one > DFS
// Breath First Search // if you search same level at once > BFS
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image; // if image already changed return image

        fill(image, sr,sc, color, image[sr][sc]); // use method
        return image; // return image
    }

    public void fill(int[][] image, int sr, int sc, int color, int cur){
      
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)return; // if it is not match the condition > return ;
      
        if(cur != image[sr][sc]) return; // if already changed just return

        image[sr][sc] = color; // change [sr][sc] to new color

      // recurison for 4 directions
        fill(image, sr -1,sc, color, cur);
        fill(image, sr +1,sc, color, cur);
        fill(image, sr,sc -1, color, cur);
        fill(image, sr,sc +1, color, cur);

    }
}

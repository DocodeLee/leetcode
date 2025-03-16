//You are given an m x n matrix M initialized with all 0's and an array of operations ops,
//where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.

// add 1 to the ops result
// ex : [2,2]  > add 1 to the (0,0) (0,1) (1,1) ...(2,2)
// ex : [3,3] > add 1 from (0,0) to (3,3)

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minx = m;
        int miny = n;

        for(int[] op : ops){
            minx = Math.min(minx,op[0]);
            miny = Math.min(miny,op[1]);
        }
        return minx * miny;
    }
}

// Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
// and each cookie j has a size s[j]. 
//If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content.
// Your goal is to maximize the number of your content children and output the maximum number.

// it was hard to understand but the thing is check how many cookies child want
// return the how man children can be satisfied

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // sort the Arrays for convenience 
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int count = 0; // return value
      // declare variable for two pointer count and return value
        while(i < g.length && j < s.length){ // turning loop until the array length
            if(g[i] <= s[j]){ // if childrens need is small or same with cookies 
                count++; // count up
                i++; // pointers move
                j++;
            }else j++;
        }
        return count; //return count
    }
}

// we are going to get sorted Array
// need to return TreeNode as OutPut
// The TreeNode class represents a node that contains data for a single node in a tree

 // Definition for a binary tree node.
 public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
     
    TreeNode() {}
    TreeNode(int val) {
         this.val = val;
         }
    TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
         this.right = right;
      }
  }

// Time complexity O(n) Space Complexity O(n)
class Solution {
    public TreeNode sortedArrayToBST(int[] nums){ //we will get sorted Array
        return helper(nums, 0, nums.length -1); // give the indexx 
    }

    private TreeNode helper(int[] nums, int left, int right){ // arrays and two int value
        if(left > right) return null; // left = leftindex > so should be bigger than right

        int mid = (left + right) /2; // sorted array so mid = mid index 
        TreeNode root = new TreeNode(nums[mid]); // root is mid
        root.left = helper(nums, left, mid -1); // recursive
        root.right = helper(nums, mid + 1, right); //recursive
        return root;
       }
}

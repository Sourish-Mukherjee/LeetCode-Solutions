//Link: https://leetcode.com/problems/minimum-depth-of-binary-tree/

class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0)
            return 1+right;
        else if(right == 0)
            return 1+left;
        return 1+Math.min(left,right);
    }
}

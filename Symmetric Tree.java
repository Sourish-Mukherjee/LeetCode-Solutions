//Link https://leetcode.com/problems/symmetric-tree/

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return areMirror(root,root);
    }
    boolean areMirror(TreeNode a, TreeNode b) {
        if(a==null && b==null)
            return true;
        if(a==null || b==null)
            return false;
        if(a.val!=b.val)
            return false;
        return areMirror(a.left,b.right) && areMirror(a.right,b.left);
        
    }
}

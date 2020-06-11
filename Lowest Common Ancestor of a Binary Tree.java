//Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;
        if(root==p || root==q)
            return root;
        TreeNode lca = lowestCommonAncestor(root.left,p,q);
        TreeNode lca2 = lowestCommonAncestor(root.right,p,q);
        if(lca!=null && lca2!=null)
            return root;
        return lca!=null?lca:lca2;
    }
}

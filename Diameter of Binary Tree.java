//Link: https://leetcode.com/problems/diameter-of-binary-tree/

class Solution {
    int dia = 0;
    public int util(TreeNode root) {
        if (root == null) return 0;

        int l = util(root.left);  // height of left subtree
        int r = util(root.right); // height of right subtree

        if (l + r  > dia) dia = l + r; // l+r is a possible max dia

        return 1 + Math.max(l, r); // returning height of subtree
    }

    public int diameterOfBinaryTree(TreeNode root) {
        util(root);
        return dia;
    }
}

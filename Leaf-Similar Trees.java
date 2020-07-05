//Link: https://leetcode.com/problems/leaf-similar-trees/

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> tree1 = new ArrayList();
        List<Integer> tree2 = new ArrayList();
        dfs(root1, tree1);
        dfs(root2, tree2);
        return tree1.equals(tree2);
    }

    public void dfs(TreeNode node, List<Integer> leafValues) {
        if (node != null) {
            if (node.left == null && node.right == null)
                leafValues.add(node.val);
            dfs(node.left, leafValues);
            dfs(node.right, leafValues);
        }
    }
}

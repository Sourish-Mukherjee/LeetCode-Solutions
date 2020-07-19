//Link: https://leetcode.com/problems/count-good-nodes-in-binary-tree/

class Solution {
    int count=0;
    public int goodNodes(TreeNode root) {
        if(root!=null)
             func(root,root.val);
        
        return count;
    }
    void func(TreeNode root, int max){
        if(root == null)
            return;
        
        if(root.val >= max){
            count++;
            max = root.val;
        }
        func(root.left,max);
        func(root.right,max);
        
    }
}

//Link: https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/

class Solution {
    public int sumEvenGrandparent(TreeNode root) {
    return helper(root,null,null); //Perform DFS
    }    
    private int helper(TreeNode current,TreeNode parent,TreeNode grandParent){
        int sum=0;
        if(current==null) return 0;
        if(grandParent!=null && grandParent.val % 2 == 0){
            sum+=current.val;
        }
        sum+= helper(current.left,current,parent);
        sum+=helper(current.right,current,parent);
        return sum;

    }
}

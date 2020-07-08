//Link: https://leetcode.com/problems/sum-of-left-leaves/

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        int sum = 0;
        if(root!=null){
            que.offer(root);
            while(!que.isEmpty()){
                TreeNode temp = que.poll();
                if(temp.left!=null){
                    if(temp.left.left==null && temp.left.right==null)
                        sum+=temp.left.val;
                    else
                        que.offer(temp.left);
                }
                if(temp.right!=null)
                    que.offer(temp.right);
            }
        }
        return sum;
    }
}

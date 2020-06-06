//Link: https://leetcode.com/problems/maximum-width-of-binary-tree/

class Solution {
    
    class Node{
        int pos;
        TreeNode tnode;
        public Node(int pos,TreeNode tnode)
        {
            this.pos=pos;
            this.tnode=tnode;
        }
    }
    
    
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Node> que = new LinkedList<>();
        int max_width = 0;
        if(root!=null)
        {
            que.add(new Node(1,root));
            while(!que.isEmpty()){
                int size =que.size();
                int currMin = Integer.MAX_VALUE;
                int currMax = Integer.MIN_VALUE;
                while(size-->0){
                    Node temp = que.poll();
                    currMin = Math.min(temp.pos,currMin);
                    currMax = Math.max(temp.pos,currMax);
                    if(temp.tnode.left!=null)
                        que.add(new Node(2*temp.pos,temp.tnode.left));
                    if(temp.tnode.right!=null)
                        que.add(new Node(2*temp.pos+1,temp.tnode.right));
                }
                int diff = currMax-currMin+1;
                max_width=Math.max(diff,max_width);
            }
        }
        return max_width;
    }
}

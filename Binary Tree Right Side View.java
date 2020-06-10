//Link: https://leetcode.com/problems/binary-tree-right-side-view/

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> finalList = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root!=null){
            que.offer(root);
            while(!que.isEmpty()){
                int size = que.size();
                TreeNode temp = null;
                while(size-->0){
                    temp = que.poll();
                    if(temp.left!=null)
                        que.add(temp.left);
                    if(temp.right!=null)
                        que.add(temp.right);
                }
                finalList.add(temp.val);
            }
        }
        return finalList;
    }
}

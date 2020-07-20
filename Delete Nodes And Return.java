//Link: https://leetcode.com/problems/delete-nodes-and-return-forest/

class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if(root == null)
            return new ArrayList<TreeNode>();
        List<TreeNode> list = new ArrayList<>();
        helper(root,to_delete,list);
        if(!search(to_delete,root.val))
            list.add(root);
        return list;
    }
    private TreeNode helper(TreeNode node, int[] arr, List<TreeNode> list){
        if(node == null)
            return null;
        node.left = helper(node.left,arr,list);
        node.right = helper(node.right,arr,list);
        if(search(arr,node.val))
        {
            if(node.left!=null)
                list.add(node.left);
            if(node.right!=null)
                list.add(node.right);
            node = null;
        }
        return node;
    }
    
    private boolean search(int arr[], int ele){
        for(int x: arr)
            if(x==ele)
                return true;
        return false;
    }
}

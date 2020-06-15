//Link: https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

public class Codec {

    // Encodes a tree to a single string.
    int index = 0;
    
    public String serialize(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        serial(root,list);
        return list.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strArray = data.substring(1,data.length()-1).split(", ");
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(strArray)); 
        return deserial(myList);
    }
    
    
    public void serial(TreeNode root, ArrayList<String> A) {
	    if(root!=null){
	        A.add(root.val+"");
	        serial(root.left,A);
	        serial(root.right,A);
	    }
	    else{
	        A.add("#");
	    }
	}
	
    public TreeNode deserial(ArrayList<String> A){
        if(index == A.size())
            return null;
        String val = A.get(index);
        TreeNode root = null;
        index++;
        if(!val.equals("#"))
        {
        root = new TreeNode(Integer.parseInt(val));
        root.left=(deserial(A));
        root.right=(deserial(A));
        }
        return root;
    }
    
}

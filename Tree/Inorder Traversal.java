class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> res = new ArrayList<>();
        calinorder(res,root);
        return res;
        
    }
    void calinorder(ArrayList res,Node root)
    {
        if(root==null)
        return;
        calinorder(res,root.left);
        res.add(root.data);
        calinorder(res,root.right);
    }
}

class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        calPreorder(res,root);
        return res;
    }
    static void calPreorder(ArrayList res,Node root)
    {
        if(root==null)
        return;
        res.add(root.data);
        calPreorder(res,root.left);
        calPreorder(res,root.right);
        
    }

}

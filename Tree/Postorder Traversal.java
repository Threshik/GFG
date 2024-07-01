class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> res = new ArrayList<>();
       calPostorder(res,root);
       return res;
    }
    void calPostorder(ArrayList res, Node root)
    {
        if(root==null)
        return;
        calPostorder(res,root.left);
        calPostorder(res,root.right);
        res.add(root.data);
    }
}

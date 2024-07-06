lass Solution {
    static Node prev=null;
    public void populateNext(Node root) {
        // code here
        prev=null;
        inorder(root);
    }
    public void inorder(Node root)
    {
        if(root==null)
        return;
        inorder(root.left);
        if(prev!=null)
        prev.next=root;
        prev=root;
        inorder(root.right);
        
    }
}

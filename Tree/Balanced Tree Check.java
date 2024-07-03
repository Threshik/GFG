class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	if(root==null)
	return true;
	int lh;
	int rh;
	lh=height(root.left);
	rh=height(root.right);
	if(Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right))
	return true;
	return false;
    }
    int height(Node root)
    {
        if(root==null)
        return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return 1+Math.max(lh,rh);
    }
}


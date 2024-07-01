class Solution
{
	int countNonLeafNodes(Node root) {
	    //code here
	    
	    if(root==null)
	    return 0;
	    if(root.left==null && root.right==null)
	    return 0;
	    int lp=countNonLeafNodes(root.left);
	    int rp=countNonLeafNodes(root.right);
	    return 1+lp+rp;
	   
	    
	}
}

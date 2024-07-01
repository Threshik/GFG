class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node==null)
        return 0;
        if(node.left==null && node.right==null)
        return 1;
        int lp=height(node.left);
        int rp=height(node.right);
        return 1+ Math.max(lp,rp);
    }
}

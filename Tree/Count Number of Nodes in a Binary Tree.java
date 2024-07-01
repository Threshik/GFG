class Solution {

    public static int countNodes(Node root) {
        // Code here
        if(root==null)
        return 0;
        if(root.left==null && root.right==null)
        return 1;
        int lp=countNodes(root.left);
        int rp=countNodes(root.right);
        return 1+lp+rp;
    }
}

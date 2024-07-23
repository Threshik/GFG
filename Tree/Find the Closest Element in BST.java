
class Solution
{
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer.
    static int minDiff(Node  root, int K) 
    { 
        // Write your code here
        int res=Integer.MAX_VALUE;
        if(root==null)
        return -1;
        int floor=-1;
        while(root!=null)
        {
            if(root.data==K)
            return 0;
            if(res>Math.abs(root.data-K))
            res=Math.abs(root.data-K);
            if(root.data<K)
            root=root.right;
            else
            root=root.left;
        }
        return res;
        
    } 
}


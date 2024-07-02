class Solution {
    public static boolean isSubtree(Node T, Node S) {
        // add code here.
        if(S==null) //null is a subtree of every tree
        return true;
        if(T==null) //then a tree itself not there so return false;
        return false;
        
        if(check(T,S))
        return true;
        
        //if condition is false
        return isSubtree(T.left,S) || isSubtree(T.right,S);
    }
    static boolean check(Node T, Node S)
    {
        if(T==null && S==null)
        return true;
        if(T==null || S==null)
        return false;
        //if there is data in the tree
        return((T.data==S.data) && check(T.left,S.left) && 
        check(T.right,S.right));
    }
}

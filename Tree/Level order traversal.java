class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root==null)
        return res;
        q.add(root);
        while(q.size()!=0)
        {
                Node level = q.poll();
                res.add(level.data);
                if(level.left!=null)
                q.add(level.left);
                if(level.right!=null)
                q.add(level.right);
        }
        return res;
    }
}

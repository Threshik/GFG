class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root==null)
        return res;
        q.add(root);
        int flag=0;
        while(q.size()!=0)
        {
            ArrayList<Integer> level = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                Node n = q.poll();
                level.add(n.data);
                if(n.left!=null)
                q.add(n.left);
                if(n.right!=null)
                q.add(n.right);
            }
            if(flag%2==0)
            { 
                Collections.reverse(level);
                res.addAll(level);
                flag=1-flag;
            }
            else
            {
               
                res.addAll(level);
                flag=1-flag;
            }
        }
        return res;
    }
}

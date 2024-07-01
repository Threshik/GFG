class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(node==null)
        return res;
        q.add(node);
        while(q.size()!=0)
        {
            ArrayList<Integer> level = new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node n = q.poll();
                if(n.right!=null)
                q.add(n.right);
                if(n.left!=null)
                q.add(n.left);
                level.add(n.data);
            }
            res.addAll(level);
        }
        Collections.reverse(res);
        return res;
    }
}      

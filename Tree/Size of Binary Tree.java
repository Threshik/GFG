class Solution {
    public static int getSize(Node node) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(node==null)
        return 0;
        q.add(node);
        while(q.size()!=0)
        {
            ArrayList<Integer> level = new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node n = q.poll();
                level.add(n.data);
                if(n.left!=null)
                q.add(n.left);
                if(n.right!=null)
                q.add(n.right);
            }
            res.addAll(level);
        }
        int n = res.size();
        return n;
    }
}
        

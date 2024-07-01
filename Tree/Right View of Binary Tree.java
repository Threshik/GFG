class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        if(node==null)
        return res;
        q.add(node);
        while(q.size()!=0)
        {
            List<Integer> levels = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                Node n = q.poll();
                levels.add(n.data);
                if(n.right!=null)
                q.add(n.right);
                if(n.left!=null)
                q.add(n.left);
                
            }
            int data1 = levels.get(0);
            res.add(data1);
        }
        return res;
    }
}


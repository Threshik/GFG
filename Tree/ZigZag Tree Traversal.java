class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayList<Integer> res = new ArrayList<>();
	    Queue<Node> q = new LinkedList<>();
	    if(root==null)
	    return res;
	    q.add(root);
	    int flag=0;
	    
	    while(q.size()!=0)
	    {
	        int size=q.size();
	        ArrayList<Integer> l = new ArrayList<>();
	        for(int i=0;i<size;i++)
	        {
	            Node level = q.poll();
	            l.add(level.data);
	            if(level.left!=null)
	            q.add(level.left);
	            if(level.right!=null)
	            q.add(level.right);
	        }
	        if(flag%2!=0)
	        {
	            Collections.reverse(l);
	        }
	            res.addAll(l);
	            flag++;
	        
	    }
	    return res;
	}
}

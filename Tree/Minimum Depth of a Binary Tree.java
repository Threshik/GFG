class Solution
{
	int minDepth(Node root)
	{
	    //code here
	    Queue<Node> q = new LinkedList<>();
	    if(root==null)
	    return 0;
	    q.add(root);
	    int depth=1;
	    while(q.size()!=0)
	    {
	        int size=q.size();

	        for(int i=0;i<size;i++)
	        {	        
	            Node node=q.poll();
	            if(node.left==null && node.right==null)
	            return depth;
	            if(node.left!=null)
	            q.add(node.left); 
	            if(node.right!=null)
	            q.add(node.right);
	        }
	        depth++;
	    }
	    return -1;
	}
}

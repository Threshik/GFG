class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        // Your code here
        int maxWidth=0;
        Queue<Node> q = new LinkedList<>();
        if(root==null)
        return 0;
        q.add(root);
        
        while(q.size()!=0)
        {
            int size=q.size();
            maxWidth=Math.max(maxWidth,size);
            for(int i=0;i<size;i++)
            {
            Node n = q.poll();
            if(n.left!=null)
            q.add(n.left);
            if(n.right!=null)
            q.add(n.right);
            }
        }
        return maxWidth;
        
    }
}

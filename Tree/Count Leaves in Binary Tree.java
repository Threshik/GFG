class Tree
{
    int countLeaves(Node node) 
    {
         // Your code
        //  int leaf =0;
        //  Queue<Node> q = new LinkedList<>();
        //  q.add(node);
        //  while(q.size()!=0)
        //  {
        //      Node level = q.remove();
        //      int c=0;
        //      if(level.left!=null)
        //      {
        //         q.add(level.left);
        //         c++;
        //      }
        //      if(level.right!=null)
        //      {
        //          q.add(level.right);
        //          c++;
        //      }
        //      if(c==0)
        //      leaf++;
        //  }
        //  return leaf;
        
        if(node==null)
        return 0;
        if(node.left==null && node.right==null)
        return 1;
        int lp=countLeaves(node.left);
        int rp =countLeaves(node.right);
        return lp+rp;
    }
}

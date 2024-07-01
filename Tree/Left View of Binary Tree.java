class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> res = new ArrayList<>();
      if(root==null)
      return res;
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      while(q.size()!=0)
      {
          List<Integer> levels = new ArrayList<>();
          int size= q.size();
          for(int i=0;i<size;i++)
          {
              Node n = q.poll();
              levels.add(n.data);
              if(n.left!=null)
              q.add(n.left);
              if(n.right!=null)
              q.add(n.right);
          }
          int data1 = levels.get(0);
          res.add(data1);
          
      }
      return res;
    }
}

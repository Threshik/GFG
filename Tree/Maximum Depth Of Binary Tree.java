class Solution {
  public static int maxDepth(Node root) {
    // code here
    
    //maximim depth of the tree = the element on the left side
    ArrayList<Integer> res = new ArrayList<>();
    Queue<Node> q = new LinkedList<>();
    if(root==null)
    return 0;
    q.add(root);
    while(q.size()!=0)
    {
        ArrayList<Integer> level = new ArrayList<>();
        int size=q.size();
        for(int i=0;i<size;i++)
        {
            Node node = q.poll();
            level.add(node.data);
            if(node.left!=null)
            q.add(node.left);
            if(node.right!=null)
            q.add(node.right);
        }
        res.add(level.get(0));
    }
    int n = res.size();
    return n;

  }
}
     

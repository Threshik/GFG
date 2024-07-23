class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Queue<Node> q = new LinkedList<>();
       if(root1!=null)
       q.add(root1);
       while(q.size()!=0)
       {
           Node n1 = q.poll();
           pq.add(n1.data);
           if(n1.left!=null)
           q.add(n1.left);
           if(n1.right!=null)
           q.add(n1.right);
       }
       if(root2!=null)
       q.add(root2);
       while(q.size()!=0)
       {
           Node n2 = q.poll();
           pq.add(n2.data);
           if(n2.left!=null)
           q.add(n2.left);
           if(n2.right!=null)
           q.add(n2.right);
       }
       while(pq.size()!=0)
       {
           res.add(pq.poll());
       }
       return res;
    }
}

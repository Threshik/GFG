class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(node==null)
        return;
        q.add(node);
        while(q.size()!=0)
        {
            Node level = q.remove();
            if(level.left!=null)
            q.add(level.left);
            if(level.right!=null)
            q.add(level.right);
            Node temp = level.left;
            level.left=level.right;
            level.right=temp;
        }
       
    }
   
}

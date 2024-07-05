class Solution {
    // Function to find the vertical width of a Binary Tree.
    public int verticalWidth(Node root) {
        // code here.
        Map<Node,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        Queue<Node> q = new LinkedList<>();
        if(root==null)
        return 0;
        q.add(root);
        //root horizontal distance is 0
        map.put(root,0);
        while(q.size()!=0)
        {
                Node node = q.poll();
                //to get current horizontal distance
                int hd = map.get(node);
                //unique horizontal distance in set
                set.add(hd);
                if(node.left!=null)
                {
                q.add(node.left);
                //left child
                map.put(node.left,hd-1);
                }
                if(node.right!=null)
                {
                q.add(node.right);
                //right child
                map.put(node.right,hd+1);
                }
            
        }
        return set.size();
    }
}

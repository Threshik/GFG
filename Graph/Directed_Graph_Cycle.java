class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) 
        // code here
       {
           boolean[] visited = new boolean[V];
           boolean[] pathvis = new boolean[V];
           
           for(int i=0;i<V;i++)
           {
               if(checkCycle(i,visited,pathvis,adj))
               return true;
           }
           return false;
       }
       
       public boolean checkCycle(int i,boolean[] visited,boolean[] pathvis,ArrayList<ArrayList<Integer>> adj)
       {
           visited[i]=true;
           pathvis[i]=true;
           
           
           for(int node: adj.get(i))
           {
               //node is not visited
               if(!visited[node])
               {
                   if(checkCycle(node,visited,pathvis,adj))
                   return true;
               }
               //node is visited but the path is in same path
               else if(pathvis[node])
               return true;
           }
           pathvis[i]=false;
           return false;
       }
    
}
